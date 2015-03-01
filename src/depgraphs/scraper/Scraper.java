/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package depgraphs.scraper;

//import depgraphs.network.ReferenceMap;
import depgraphs.eventful.EventAdapter;
import java.io.File;

/**
 *
 * @author Mat
 */
public abstract class Scraper {
//	public ReferenceMap ref;
	public abstract void scrape(File f, EventAdapter adapter) ;
//	public Scraper setRefMap(ReferenceMap ref) { this.ref = ref; return this; }
}
