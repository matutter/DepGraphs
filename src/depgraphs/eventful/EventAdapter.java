/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package depgraphs.eventful;

import depgraphs.DepGraphs;
import depgraphs.data.Local;
import depgraphs.env;
import depgraphs.fs;
import depgraphs.scraper.JavaScraper;
import depgraphs.ui.graph.gImportContext;
import depgraphs.ui.graph.gmain;
import java.io.File;
import java.io.IOException;
import java.util.Collection;
import java.util.Optional;

import java.util.Stack;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
import java.util.function.Consumer;

/**
 *
 * @author Mat
 */
public class EventAdapter implements Runnable {
	Stack<String> nextTick;
	Optional<Runnable> noActivity = Optional.empty();
	Optional<Runnable> activity = Optional.empty();
	gmain g;

	public gmain getGraph() {
		return g;
	}
	
	public EventAdapter() {
		nextTick = new Stack<>();
	}
	
	public EventAdapter addGraph( gmain g ) {
		this.g = g;
		return this;
	}
	
	public void setNoActivityIndicator(Runnable noActivity) {
		this.noActivity = Optional.ofNullable(noActivity);
	}
	
	public void setActivityIndicator(Runnable activity) {
		this.activity = Optional.ofNullable(activity);
	}
	
	public void runInAnotherThread() {
		ExecutorService exec = Executors.newSingleThreadExecutor();
		exec.execute(this);
	}
	
	public void loadOnNextTick(String s) {
		nextTick.push(s);
	}
	
	public synchronized EventAdapter clear( Consumer<EventAdapter> cb ) {
//		this.g.clear();
		env.log("removing  edges");
		cb.accept( this );
		return this;
	}
	
	@Override
	public void run() {
		System.out.println(" > Sym starting");
//		g.vis.run();
		FPSLock lock = new FPSLock(60);
		int limit = 100;
		boolean rendering = true;
		while( !Thread.interrupted() ) {
			try {
				if( rendering ) {
					activity.ifPresent(Runnable::run);
					while( !nextTick.empty() ) {
						String s = nextTick.lastElement();
						nextTick.pop();
						parse( s );
					}
					rendering = false;
				} else {
					
					if( !nextTick.empty() )
						rendering = true;
					else {
						Thread.sleep( lock.delay );
						noActivity.ifPresent(Runnable::run);
					}
					if( lock.unlocked() ) {
//						g.refresh();
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

	private void parse(String s) {
		File f = new File( s );
		if( f.exists() ) {
//			System.out.println("Parsing " + f.getName());
			g.setRootTitle(f.getName());
			
			gImportContext ctx = new gImportContext();
			ctx.visual = g.ROOT.getRow();
			ctx.qualifier = f.getName();
			try {
				Collection<File> files = fs.getSources( f.getCanonicalPath() , "(.java)|(.png)|(.gif)|(.g4)");
				JavaScraper scraper = new JavaScraper( ctx );

				int i = 0, max = files.size();
				
				for( File fi : files ) {
					DepGraphs.setText( Integer.toString(++i) + "/" + max + "   " + fi.getName() + "  ("+ (fi.length()/1000.0) +"KB)" );
					if( fi.exists() && fi.canRead() ) {
						g.update( scraper.scrape(fi) );
					} else {
						System.out.println( fi.getName() + " skipped" );
					}
				}
				DepGraphs.setText("Linking...");
				g.complete( ctx );
				DepGraphs.setText(f.getName());
				
			} catch( IOException ex ) { System.out.println(ex); }
		}
	}
}
