/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package depgraphs.network;

import depgraphs.visitors.tools.VisitorNode;
import depgraphs.env;
import depgraphs.scraper.ScraperBase;
import java.io.File;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.graphstream.graph.Node;
import themes.Theme;

/**
 *
 * @author Mat
 */
public class NetworkBuilder {
	Integer index;
	HashMap<String,Integer> i_map;
	HashMap<Integer,VisitorNode> map;
	HashMap< Integer, HashSet<Integer> > rel;
	Theme vis;
	ScraperBase SCRAPER;
	boolean log_level;
	
	
	public NetworkBuilder() {
		i_map = new HashMap<>();
		rel = new HashMap<>();
		map = new HashMap<>();
		index = 0;
	}
	
	public void setScraper(ScraperBase o) {
		this.SCRAPER = o;
	}
	
	public void consume( Collection<File> files ) {
		for (Iterator<File> it = files.iterator(); it.hasNext();) {
			File f = it.next();
			if( log_level ) env.log(f.getName());
			consume( f );
		}
	}
	
	public void consume( File f ) {
		this.consume( SCRAPER.scrape(f) );
	}
	
	public void consume( VisitorNode n ) {
		Integer A = getIndex(n.id);
		n.children.stream().forEach((s) -> {
			Integer B = getIndex(s);
			Link( A, B );
		});
		map.put(getIndex( n.id ), n);
	}
	
	private void Link(Integer A, Integer B) {
		if( !rel.containsKey(A) ) 
			rel.put(A, new HashSet<>());
		rel.get(A).add(B);
	}
	
	public Integer getIndex(String s) {
		if( !i_map.containsKey(s) )
			i_map.put(s, index++);
		return i_map.get(s);
	}
	
	
	public void generate() {
		if( i_map.keySet().iterator().next() == null ) {
			env.log( " > no enitites found" );
			return;
		}
		

		
		for( String s : i_map.keySet()) {
			Node n = vis.g.addNode( getIndex(s).toString());
			n.addAttribute("ui.label", s);
			if( s.contains("depgraphs") ) {
				n.addAttribute("ui.class", "core");
			}
		}
		
		map.values().stream().forEach((n) -> {
			n.children.stream().forEach((s) -> {
				createEdge( n, s );
			});
		});
		vis.g.display();
		
	}
	
	private void createEdge( VisitorNode n, String s ) {
		String A = getIndex(n.id).toString();
		String B = getIndex(s).toString();
		String C = A+":"+B;
		if( vis.g.getEdge(C) == null  )
			vis.g.addEdge( C, A, B );
		env.log(C);
	}
	
	public NetworkBuilder log(boolean log_level) {
		this.log_level = log_level;
		return this;
	}

	public void setTheme(Theme theme) {
		this.vis = theme;
	}
	
}
