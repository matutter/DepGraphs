/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package depgraphs.network;

import depgraphs.scrapers.JavaScraper;
import depgraphs.visitors.JavaVisitor;
import java.io.File;
import java.util.Collection;
import java.util.HashMap;
import org.antlr.v4.runtime.tree.ParseTree;
import org.graphstream.graph.Graph;
import org.graphstream.graph.Node;
import org.graphstream.graph.implementations.SingleGraph;

/**
 *
 * @author Mat
 */
public class NetworkBuilder {
	Integer index;
	HashMap<String,Integer> i_map;
	HashMap<Integer,CodeNode> map;
	
	JavaVisitor visitor;
	
	public NetworkBuilder() {
		visitor = new JavaVisitor(this);
		i_map = new HashMap<>();
		map = new HashMap<>();
		index = 0;
	}
	
	public void consume( Collection<File> files ) {
		Integer i = 0;
		for( File f : files ) {
			consume( f, i++ );
		}
	}
	
	public void consume( File f, Integer index ) {
		JavaScraper.scrape(f, index, this);
	}
	
	public void consume( CodeNode n, Integer index ) {
		map.put(index, n);
	}
	
	public Integer getIndex(String s) {
		if( !i_map.containsKey(s) )
			i_map.put(s, index++);
		
		return i_map.get(s);
	}
	
	public void visit(ParseTree pt, Integer index, String s) {
		visitor.reset();
		visitor.visit(pt);
		this.consume( visitor.get(), index );
	}
	
	public void generate() {
		
		Graph g = new SingleGraph("Source");
		g.addAttribute("ui.stylesheet", ""
				+ "node { size: 15px, 15px; }"
				+ "edge { fill-color: #AAA; }"
				+ "node.core { fill-color: red; }");
		g.addAttribute("ui.antialias");
		g.addAttribute("ui.quality");
		
		for( String s : i_map.keySet()) {
			Integer i = i_map.get(s);
			Node n = g.addNode( i.toString());
			n.addAttribute("ui.label", s);
			if( s.contains("depgraphs") ) {
				n.addAttribute("ui.class", "core");
			}
		}
		
		for( CodeNode n : map.values() ) {
			
			for( Integer i : n.children ) {
				String A = n.id.toString();
				String B = i.toString();
				if( g.getEdge(A+B) == null  )
					g.addEdge( A+B, A, B );
			}
		}
		g.display();
		
	}
	
}
