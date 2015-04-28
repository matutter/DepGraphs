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
 * @param <T>
 */
public final class gmain<T extends VisualFQN<String,List<VisualFQN>>> {
	
	public final Graph     g; 
	public final gVisual   vis;
	public final gDisplay  disp;
	public final Node      ROOT;
	long time_offset = 0, time_last = 0, future = 1500;
	boolean toggleImportVis = true;
	boolean toggleEdgeVis = true;
	
	public static gmain inst;
	
	public gmain() {
		UILib.setPlatformLookAndFeel();
        g = new Graph();
		vis = new gVisual( g );
		
		g.addColumn(gconst.LABEL, gconst.COLUMN_TYPE[0]);
		g.addColumn(gconst.TYPE, gconst.COLUMN_TYPE[1]);
		g.addColumn(gconst.STATE, boolean.class);
//		g.addColumn(gconst.LOCK, boolean.class);
//		g.addColumn(gconst.COLOR, int.class);
		
		ROOT = g.addNode();
		setRootTitle( "DepGraphs" );
		
		disp = new gDisplay(vis);
		gmain.inst  = this;
	}
	
	public void setRootTitle(String title) {
		ROOT.set(gconst.LABEL, title);
		ROOT.set(gconst.TYPE, gtype.PROJECT);
		ROOT.set(gconst.STATE, false);
//		ROOT.set(gconst.LOCK, Boolean.FALSE);
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
	
	public void packageConnect(T parent, VisualFQN child) {
		if( parent.visual == ROOT.getRow() ) return;
		if( parent.visual == -1 ) {
			node( parent, gtype.IMPORT  );
			parent.parent.ifPresent( p->{
				packageConnect((T) p, parent );
			});
		}
		if( child.visual == -1 )
			node( child, gtype.IMPORT );
		connect( parent, child, gtype.NOMINAL_EDGE );
	}
	
	public void complete(T ctx) {
		ctx.stream().forEach( v1 -> {
			
			v1.local.ifPresent( l -> {

				if( v1.visual == -1 )
					node( v1, gtype.SOURCE );
				
				v1.parent.ifPresent( p -> {
					packageConnect((T) p, v1 );
				});
				
				l.stream().forEach( q->{
					if( q instanceof VisualFQN ) {
						T v2 = (T) q;
						
						if( v2.visual == -1 )
							node( v2, gtype.IMPORT );
						
						v2.parent.ifPresent( p -> {
							packageConnect((T) p, v2 );
						});
						
						connect( v1, v2, gtype.IMPORT_EDGE );
					}
				});
			});
		});
		synchronized(vis) {
			gmain.inst.vis.runAt(gconst.FILTER, td());
		}
	}

	public void update(Optional<T> ctx) {
		ctx.ifPresent(p->{
			if( p.visual == -1 ) {
				node(p, gtype.SOURCE);
				Stack<T> seq = new Stack<>();

				while( p.parent.isPresent() ) {
					seq.push(p);
					p = (T) p.parent.get();
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
		});
	}
	
	Node node( VisualFQN v, gtype type ) {
		synchronized(g) {
			Node n = g.addNode();
			n.set(gconst.LABEL, v.name().trim());
			n.set(gconst.TYPE, type);
			n.set(gconst.STATE, Boolean.TRUE);
//			n.set(gconst.LOCK, Boolean.FALSE);
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
	
	
	
	public void toggleIMPORT() {
		toggle( gtype.IMPORT );
	}
	
	public void toggle(gtype t) {
		toggleImportVis = !toggleImportVis;
		vis.cancel(Visualization.ALL_ITEMS);
		vis.getGroup(gconst.NODES).tuples().forEachRemaining((item)->{
			VisualItem i = (VisualItem) item;
			if( t.equals( i.get(gconst.TYPE) ) ) {
				i.setVisible(toggleImportVis);
				Node n = (Node) i;
				n.edges().forEachRemaining(e->{
					VisualItem edge = (VisualItem) e;
					edge.setVisible(toggleImportVis && toggleEdgeVis);
				});
			}
		});
		vis.run(gconst.REPAINT);
	}

	public void resetHIGHLIGHTED() {
		vis.getGroup(gconst.NODES).tuples()
			.forEachRemaining(t->((VisualItem)t)
				.setHighlighted(false));
		vis.run(gconst.REPAINT);
	}
	
	public void showOnlyHIGHLIGHT() {
		toggleEdgeVis = !toggleEdgeVis;
		if( toggleEdgeVis ) {
			// restore all to visible
			vis.getGroup(gconst.EDGES).tuples().forEachRemaining(t->{
				((VisualItem)t).setVisible(toggleEdgeVis);
			});
			// respect and leave imports hidden
			if( toggleImportVis ) {
				toggleImportVis = !toggleImportVis;
				toggleIMPORT();
			}
		} else {
			// set all not connecting highlighted edges not-visible
			vis.getGroup(gconst.EDGES).tuples().forEachRemaining(t->{
				Edge edge = (Edge) t;
				if( !((VisualItem)edge.getTargetNode()).isHighlighted() )
					if( !((VisualItem)edge.getSourceNode()).isHighlighted() )
						((VisualItem)edge).setVisible(false);
			});
		}
		vis.run(gconst.REPAINT);
	}
	
	public void filter() {
		vis.run(gconst.FILTER);
	}
	
	public void clear() {
		vis.cancel(Visualization.ALL_ITEMS);
		clear(g.edges());
		Iterator e = g.nodes();
		e.next(); // preserve node 0 == ROOT
		clear(g.nodes());
		vis.run(gconst.FILTER);
	}
	
	void clear(Iterator it) {
		while( it.hasNext() ) {
			it.next();
			it.remove();
		}
	}
}
