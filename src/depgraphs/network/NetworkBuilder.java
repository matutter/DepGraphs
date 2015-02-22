/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package depgraphs.network;

import depgraphs.env;
import depgraphs.scraper.Scraper;
import java.io.File;
import java.util.Collection;
import depgraphs.graphbuilder.GraphBuilder;

/**
 *
 * @author Mat
 */
public class NetworkBuilder {
	Scraper scraper;
	GraphBuilder graph;
	boolean log_level;
	ReferenceMap ref;
	
	public NetworkBuilder() {
		log_level = false;
		ref = new ReferenceMap();
	}
	
	public NetworkBuilder setScraper(Scraper scraper) {
		this.scraper = scraper.setRefMap( ref );
		return this;
	}
	
	public NetworkBuilder setGraph(GraphBuilder graph) {
		this.graph = graph;
		return this;
	}

	public ReferenceMap getRefMap() {
		return ref;
	}

	public NetworkBuilder build( Collection<File> files ) {
		files.forEach((f)->{ build( f ); });
		return this;
	}
	
	public NetworkBuilder build( File f ) {
		if( log_level ) env.log(f.getName());
		scraper.scrape(f);
		return this;
	}
	
	public NetworkBuilder render() {
		graph.setRefMap(ref).render();
		return this;
	}
	
	public NetworkBuilder log(boolean log_level) {
		this.log_level = log_level;
		return this;
	}

}
