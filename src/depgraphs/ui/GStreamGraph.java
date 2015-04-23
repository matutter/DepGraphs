/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package depgraphs.ui;

import depgraphs.eventful.Eventful;
import java.awt.BorderLayout;
import java.awt.Component;
import java.util.List;
import java.util.Stack;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Consumer;
import javax.swing.JPanel;
import org.graphstream.graph.Graph;
import org.graphstream.graph.Node;
import org.graphstream.graph.implementations.SingleGraph;
import org.graphstream.ui.swingViewer.View;
import org.graphstream.ui.swingViewer.Viewer;

/**
 *
 * @author Mat
 */
public class GStreamGraph extends Eventful implements Element {
	
	final ConcurrentHashMap<String, String> _map;
	public final Graph g;
	Integer _index;
	Viewer vr;
	View v;
	
	boolean _auto;
	
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
	}
	
	public void clear() {
		_map.clear();
		_index = 0;
		this.g.getEdgeSet().removeIf( edge -> true );
		this.g.getNodeSet().removeIf( vertex -> true );
	}
	
	// mapping mechanics
	private synchronized String map(String s) {
		try { 
			synchronized(_map) {
	//			synchronized(g) {
				if( _map.containsKey(s) )
					return _map.get(s);

				_map.put(s, (_index++).toString());
					Node n = g.addNode( _map.get(s) );
					n.addAttribute("ui.label", s);
					//n.setAttribute("weight", _index);
	//			}
				return _map.get(s);
			}
		} catch ( Exception ex ) {
			return null;
		}
	}
	
	public void connect(String A, String B) {
		if( A == null ) return;
		if( B == null ) return;
		
		synchronized(_map) {
			String a = map(A);
			String b = map(B);
			if( a != b )
				connectMap(a,b);
		}
	}
	
	public void connectMap(String a, String b) {
		synchronized(g) {
			if( g.getEdge(a+"--"+b) != null ) return;
			if( g.getEdge(b+"--"+a) != null ) return;

			g.addEdge(a+"--"+b, a, b);
		}
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
	
	private Stack<String> getStackIds( String[] each ) {
		Stack<String> ids = new Stack<>();
		
		for( int i = 0; i < each.length; ++i )
			ids.push( map(each[i]) );
		
		return ids;
	}
	
//	public void addChainToTail( String tail, String[] each ) {
//		Stack<String> ids = getStackIds( each );
//		String last = null;
//		while( !ids.empty() ) {
//			if( last != null )
//				this.connectMap(last, ids.lastElement());
//			else {
//			}
//				
//			last = ids.lastElement();
//			ids.pop();
//		}
//		
//	}
	
	public void addChain( String[] each ) {
		synchronized(g) {
			Stack<String> ids = getStackIds( each );
			String last = null;
			while( !ids.empty() ) {
				if( last != null )
					this.connectMap(last, ids.lastElement());
				else {
				}

				last = ids.lastElement();
				ids.pop();
			}
		}
	}
	
	public boolean autoIsOn() {
		return _auto;
	}

	public void addChain(List<String> ss) {
		this.addChain(ss.toArray(new String[4]));
	}
	
}
