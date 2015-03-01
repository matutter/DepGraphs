/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package depgraphs.eventful;

import depgraphs.env;
import depgraphs.fs;
import depgraphs.scraper.JavaDirectiveScraper;
import depgraphs.ui.GStreamGraph;
import java.io.File;
import java.io.IOException;
import java.util.Collection;

import java.util.Random;
import java.util.Stack;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;

/**
 *
 * @author Mat
 */
public class EventAdapter implements Runnable {
	Stack<String> nextTick;
	GStreamGraph g;
	
	public GStreamGraph getGraph() {
		return g;
	}
	
	public EventAdapter() {
		nextTick = new Stack<>();
	}
	
	public EventAdapter addGraph( GStreamGraph g ) {
		this.g = g;
		return this;
	}
	
	public void runInAnotherThread() {
		ExecutorService exec = Executors.newSingleThreadExecutor();
		exec.execute(this);
	}
	
	public void loadOnNextTick(String s) {
		nextTick.push(s);
	}
	
	@Override
	public void run() {
		System.out.println(" > Sym starting");
		FPSLock lock = new FPSLock(60);
		int limit = 100;
		boolean rendering = true;
		while( !Thread.interrupted() ) {
			try {
				if( rendering ) {
					while( !nextTick.empty() ) {
						String s = nextTick.lastElement();
					//	env.log( s );
						nextTick.pop();
						
						File f = new File( s );
						if( f.exists() ) {
							try {
								Collection<File> files = fs.getSources( f.getCanonicalPath() , ".java");
								JavaDirectiveScraper scraper = new JavaDirectiveScraper();
								
								files.stream().filter( file -> file.exists() && file.canRead() ).forEach((file)->{
									//env.log( file.getName() );
									scraper.scrape(file, this);
								});
								
							} catch( IOException e ) {
							//	env.log( f.getName() + " FAIL" );
							}
						}
						
					}
					rendering = false;
				} else {
					
					if( !nextTick.empty() )
						rendering = true;
					
					if( lock.ping() ) {
						g.refresh();
					}
					else {
						Thread.sleep( lock.delay );
					}
				}
			} catch (InterruptedException ex) {
				Logger.getLogger(EventAdapter.class.getName()).log(Level.SEVERE, null, ex);
			}
		}
	}
}
