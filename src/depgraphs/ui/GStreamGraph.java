/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package depgraphs.ui;

import depgraphs.data.FQN;
import depgraphs.eventful.Eventful;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.Stack;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.swing.JPanel;
import org.graphstream.graph.Edge;
import org.graphstream.graph.Graph;
import org.graphstream.graph.Node;
import org.graphstream.graph.implementations.SingleGraph;
import org.graphstream.ui.swingViewer.View;
import org.graphstream.ui.swingViewer.Viewer;
import org.graphstream.ui.swingViewer.util.Camera;

/**
 *
 * @author Mat
 */
public class GStreamGraph extends Eventful implements Element {
	
	public static class ATTR {
		public static final String LABEL = "ui.label";
	}
	
	final ConcurrentHashMap<String, String> _map;
	public final Graph g;
	Integer _index;
	Viewer vr;
	final View v;
	
	boolean _auto;
	
	final double WHEEL_DELTA = 8.0f, WHEEL_MAX = 100, WHEEL_MIN = 0;
	
	public GStreamGraph(String css) {
		System.setProperty("org.graphstream.ui.renderer", "org.graphstream.ui.j2dviewer.J2DGraphRenderer");

		_map = new ConcurrentHashMap<>();
		_index = 0;
		_auto = true;
		
		g = new SingleGraph("GS");
		g.addAttribute("ui.antialias");
		g.addAttribute("ui.quality");
		g.addAttribute("ui.stylesheet", css );
		
		vr = new Viewer(g,Viewer.ThreadingModel.GRAPH_IN_ANOTHER_THREAD);
		vr.setCloseFramePolicy(Viewer.CloseFramePolicy.EXIT);
		vr.enableAutoLayout();
		
		v = vr.addDefaultView(false);
		
		v.addMouseWheelListener(new MouseWheelListener(){
			@Override
			public void mouseWheelMoved(MouseWheelEvent e) {
				zoom( e.getPreciseWheelRotation() > 0  );
			}
		});
		
	}
	
	public void clear() {
		_map.clear();
		_index = 0;
		this.g.getEdgeSet().removeIf( edge -> true );
		this.g.getNodeSet().removeIf( vertex -> true );
	}
	
	public GStreamGraph startAuto() {
		vr.enableAutoLayout();
		_auto = true;
		return this;
	}

	public GStreamGraph stopAuto() {
		vr.disableAutoLayout();
		_auto = false;
		return this;
	}
	public GStreamGraph toggleAuto() {
		if( _auto ) vr.disableAutoLayout(); else vr.enableAutoLayout();
		_auto = ! _auto;
		return this;
	}

	@Override
	public Component getComponent() {
		JPanel p = new JPanel();
		p.setLayout(new BorderLayout());
		p.add(v,BorderLayout.CENTER);
		return p;
	}

	@Override
	public Component setBounds(int x, int y, int span_x, int span_y) {
//		v.setBounds(x, y, span_x, span_y);
		return v;
	}
	
	public void refresh() {
		this.v.repaint();
	}
	
	public void zoom( Boolean out ) {
		Camera c = v.getCamera();
		double d = c.getViewPercent();
		synchronized(v) {
			c.setViewPercent( out?d+0.1:d-0.1 );
		}
	}
	
	public boolean autoIsOn() {
		return _auto;
	}
	
	public Optional<Node> getNode( String s ) {
		synchronized(g) {
			return Optional.ofNullable( g.getNode(s) );
		}
	}

	public Node node( String qualifier, String label ) {
		Optional<Node> n = getNode(qualifier);
		if( n.isPresent() )
			return n.get();
		synchronized(g) {
			Node n1 = g.addNode( qualifier );
			n1.setAttribute(ATTR.LABEL, label);
			return n1;
		}
	}
	
	public Optional<Edge> getEdge( Node n1, Node n2 ) {
		synchronized(g) {
			return Optional.ofNullable( n1.getEdgeBetween(n2) );
		}
	}

	private Edge edge(Node n1, Node n2) {
		Optional<Edge> e = getEdge( n1, n2 );
		if( e.isPresent() )
			return e.get();
		String s = n1.getId().concat(".".concat(n2.getId()));
		synchronized(g) {
			return g.addEdge(s, n1, n2, true);
		}
	}
	
	public void update(FQN<String, HashSet<String>> storage) {
		storage.stream()
//			.filter	(FQN::unmarked)
//			.map	(FQN::upstream)
			.forEach(this::insertPackage);
		
		
		
		
	}
	
	void insertPackage(FQN<String, HashSet<String>> p) {
		List<FQN<String, HashSet<String>>> l = p.getList();

		int i = 0;
		if( l.size() == 1 ) {
			Node n1 = node( l.get(i).name()+"*", l.get(i).name() );
		} else if( l.size() > 1 ) {
			String last = l.get(0).name();
			for( i = l.size()-1; i > 0 ; --i ) {
				Node n1 = node( l.get(i).name().concat(Integer.toString(i)), last );
				Node n2 = node( l.get(i-1).name().concat(Integer.toString(i)), l.get(i).name() );
				Edge e = edge( n1, n2 );
				last = l.get(i-1).name();
			}
		}
	}
	
	public void complete(FQN<String, HashSet<String>> p) {
		System.out.println( "finishing..." );
		p.stream().forEach( (fqn)->{
			
			if( fqn.parent.isPresent() ) {
				String s = fqn.parent.get().name().concat(".".concat(fqn.name()));
				Optional<Node> n = getNode( s );
				if( n.isPresent() ) {

					System.out.println( "link success " + s );
					fqn.local.ifPresent(System.out::println);

				} else {
					
					System.err.println( "link failed " + s );

				}				
			}
		});
		System.out.println( "done." );
	}	
	
}
