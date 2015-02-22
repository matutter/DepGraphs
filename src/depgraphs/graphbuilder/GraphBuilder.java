package depgraphs.graphbuilder;

import depgraphs.network.ReferenceMap;
import org.graphstream.graph.Graph;
import org.graphstream.graph.Node;
import org.graphstream.graph.implementations.SingleGraph;

/**
 *
 * @author Mat
 */
public abstract class GraphBuilder {
	boolean display;
	public Graph g;
	public ReferenceMap ref;
	
	public GraphBuilder(String s) {
		display = false;
		g = new SingleGraph(s);
	}
	
	public GraphBuilder setRefMap( ReferenceMap ref ) {
		this.ref = ref;
		return this;
	}
	
	public abstract void render();

	public void display() {
		if(!display) { 
			display = true;
			g.display();
		}
	}
	
	public boolean isDisplayed() {
		return display;
	}
	
	
	public void createParentNode(Integer index, String name) {
		Node n = g.addNode(index.toString() );
		if( name != null ) {
			n.addAttribute("ui.label",  name );
			if( name.contains("depgraphs") ) {
				n.addAttribute("ui.class", "core");
			}
		}
	}
	
	public void CreateChildNode(Integer index, String name) {
		if( g.getNode(index.toString()) == null )
			g.addNode( index.toString() ).addAttribute("ui.label", name);
	}
	
	public void createEdge( Integer a, Integer b ) {
		String A = a.toString();
		String B = b.toString();
		String C = A+":"+B;
		if( g.getEdge(C) == null  )
			g.addEdge( C, A, B );
	}

}
