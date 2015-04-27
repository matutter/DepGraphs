package depgraphs.ui.graph;

import depgraphs.data.VisualFQN;
import java.awt.Component;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.Stack;
import java.util.function.Consumer;
import prefuse.Visualization;
import prefuse.data.Edge;
import prefuse.data.Graph;
import prefuse.data.Node;
import prefuse.util.ui.UILib;
import prefuse.visual.VisualItem;

/**
 *
 * @author Mat
 */
public final class gmain {
	
	public final Graph     g; 
	public final gVisual   vis;
	public final gDisplay  disp;
	public final Node      ROOT;
	long time_offset = 0, time_last = 0, future = 1500;
	
	public static gmain inst;
	
	public gmain() {
		UILib.setPlatformLookAndFeel();
        g = new Graph();
		vis = new gVisual( g );
		
		g.addColumn(gconst.LABEL, gconst.COLUMN_TYPE[0]);
		g.addColumn(gconst.TYPE, gconst.COLUMN_TYPE[1]);
		g.addColumn(gconst.STATE, boolean.class);
		g.addColumn(gconst.LOCK, boolean.class);
		g.addColumn(gconst.COLOR, int.class);
		
		ROOT = g.addNode();
		setRootTitle( "DepGraphs" );
		
		disp = new gDisplay(vis);
		gmain.inst  = this;
	}
	
	public void setRootTitle(String title) {
		ROOT.set(gconst.LABEL, title);
		ROOT.set(gconst.TYPE, gtype.PROJECT);
		ROOT.set(gconst.STATE, false);
		ROOT.set(gconst.LOCK, Boolean.FALSE);
	}
	
	public void attach( Consumer<Component> cb , Component parent) {
		cb.accept( inst.disp.getPanel(parent) );
		inst.disp.setVisible(true);
	}
	
	long td() {
		long now = System.currentTimeMillis();
		if( time_last == 0 ) {
			time_last = now;
			return 0;
		}
		time_offset = now - time_last;
		time_last = now;
		if( time_offset > future ) return 0;
		time_last += future;
		return time_last;
	}
	
	public void packageConnect(VisualFQN parent, VisualFQN child) {
		if( parent.visual == ROOT.getRow() ) return;
		if( parent.visual == -1 ) {
			node( parent, gtype.IMPORT  );
			parent.parent.ifPresent( p->{
				packageConnect((VisualFQN) p, parent );
			});
		}
		if( child.visual == -1 )
			node( child, gtype.IMPORT );
		connect( parent, child, gtype.NOMINAL_EDGE );
	}
	
	public void complete(VisualFQN ctx) {
		ctx.stream().forEach( f -> {
			VisualFQN v1 = (VisualFQN)f;
			((Optional<List>)v1.local).ifPresent( l -> {

				if( v1.visual == -1 )
					node( v1, gtype.SOURCE );
				
				v1.parent.ifPresent( p -> {
					packageConnect((VisualFQN) p, v1 );
				});
				
				l.stream().forEach( q->{
					if( q instanceof VisualFQN ) {
						VisualFQN v2 = (VisualFQN) q;
						
						if( v2.visual == -1 )
							node( v2, gtype.IMPORT );
						
						v2.parent.ifPresent( p -> {
							packageConnect((VisualFQN) p, v2 );
						});
						
						connect( v1, v2, gtype.IMPORT_EDGE );
						
					} else {
					}
				});
			});
		});
		synchronized(vis) {
			gmain.inst.vis.runAt(gconst.FILTER, td());
		}
	}

	public void update(Optional<VisualFQN> ctx) {
		if( ctx.isPresent() ) {
			VisualFQN p = ctx.get();
			if( p.visual != -1 ) {
//				System.out.println( "Updating " + ctx.get().name() );

			} else {
				node(p, gtype.SOURCE);
				Stack<VisualFQN> seq = new Stack<>();

				while( p.parent.isPresent() ) {
					seq.push(p);
					p=(VisualFQN) p.parent.get();
				}
				VisualFQN other = seq.pop();
				while( !seq.empty() ) {
					if( p.visual == -1 )
						node(p, gtype.PACKAGE);
					if( other.visual == -1 )
						node( other, gtype.PACKAGE );
					connect(p,other,gtype.SOURCE_EDGE);
					other = p;
					p = seq.pop();
				}
				connect(p,other);
			}
		} else {
			System.out.println( "no package!" );
		}
	}
	
	Node node( VisualFQN v, gtype type ) {
		synchronized(g) {
			Node n = g.addNode();
			n.set(gconst.LABEL, v.name().trim());
			n.set(gconst.TYPE, type);
			n.set(gconst.STATE, Boolean.TRUE);
			n.set(gconst.LOCK, Boolean.FALSE);
			v.visual = n.getRow();
			return n;
		}
	}
	
	void connect( VisualFQN v1, VisualFQN v2, gtype type ) {
		Integer a = v1.visual;
		Integer b = v2.visual;
		synchronized(g) {
			if( g.getEdge(a, b) == -1 ) {
				int i = g.addEdge( a, b);
				Edge e = g.getEdge(i);
				e.set(gconst.TYPE, type);
				e.set(gconst.STATE, Boolean.FALSE);
			}
		}
	}
	
	void connect( VisualFQN v1, VisualFQN v2 ) {
		connect( v1, v2, gtype.NOMINAL_EDGE );
	}
	
	boolean visToggle = false;
	
	public void toggle(gtype t) {
		vis.cancel(Visualization.ALL_ITEMS);
		Iterator it = vis.getGroup(gconst.NODES).tuples();
		while( it.hasNext() ) {
			VisualItem i = (VisualItem) it.next();
			if( t.equals( i.get(gconst.TYPE) ) ) {
				i.setVisible(visToggle);
				Node n = (Node) i;
				n.edges().forEachRemaining(e->{
					VisualItem edge = (VisualItem) e;
					edge.setVisible(visToggle);
				});
			}
		}
		gmain.inst.vis.runAt(gconst.FILTER, td());
		visToggle = !visToggle;
	}

	public void clear() {
		vis.cancel(Visualization.ALL_ITEMS);
		Iterator e = g.edges();
		while( e.hasNext() ) {
			e.next();
			e.remove();
		}
		e = g.nodes();
		while( e.hasNext() ) {
			e.next();
			e.remove();
		}
		vis.run(gconst.FILTER);
	}
}
