/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package depgraphs.scraper;

//import depgraphs.network.ReferenceMap;
import java.io.File;

/**
 *
 * @author Mat
 */
public abstract class Scraper<T> {
//	public ReferenceMap ref;
	public abstract T scrape(File f) ;
//	public Scraper setRefMap(ReferenceMap ref) { this.ref = ref; return this; }
}
