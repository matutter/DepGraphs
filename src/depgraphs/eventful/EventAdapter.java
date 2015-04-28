package depgraphs.eventful;

import depgraphs.ui.graph.gImportContext;
import depgraphs.scraper.JavaScraper;
import depgraphs.ui.graph.gmain;
import depgraphs.DepGraphs;
import depgraphs.fs;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.logging.Logger;
import java.util.logging.Level;
import java.util.Collection;
import java.io.IOException;
import java.util.Optional;
import java.util.Stack;
import java.io.File;

/**
 *
 * @author Mat
 */
public class EventAdapter implements Runnable {
	Optional<Runnable> noActivity = Optional.empty();
	Optional<Runnable> activity = Optional.empty();
	Stack<String> scheduler;
	gmain g;

	public gmain getGraph() {
		return g;
	}
	
	public EventAdapter() {
		scheduler = new Stack<>();
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
		scheduler.push(s);
	}
	
	@Override
	public void run() {
		FPSLock lock = new FPSLock(1000/60);
		while( !Thread.interrupted() ) {
			try {
				if( !scheduler.empty() ) {
					activity.ifPresent(Runnable::run);
					scheduler.stream().forEach(this::parse);
					noActivity.ifPresent(Runnable::run);
					scheduler.clear();
				} 
				Thread.sleep( lock.delay );
			} catch (Exception ex) {
				Logger.getLogger(EventAdapter.class.getName()).log(Level.SEVERE, null, ex);
			}
		}
	}

	private void parse(String s) {
		File f = new File( s );
		if( f.exists() ) {
			g.setRootTitle(f.getName());
			gImportContext ctx = new gImportContext();
			ctx.visual = g.ROOT.getRow();
			ctx.qualifier = f.getName();
			try {
				Collection<File> files = fs.getSources( f.getCanonicalPath() , ".java");
				JavaScraper scraper = new JavaScraper( ctx );

				int i = 0, max = files.size();
				
				for( File fi : files ) {
					DepGraphs.setText( Integer.toString(++i) + "/" + max + "   " + fi.getName() + "  ("+ (fi.length()/1000.0) +"KB)" );
					if( fi.exists() && fi.canRead() ) {
						try {
							g.update( scraper.scrape(fi) );
						} catch( Exception ex ) {
							Logger.getLogger(EventAdapter.class.getName()).log(Level.SEVERE, null, ex);
						}
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
