/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package depgraphs.scraper;

import java.io.File;

/**
 *
 * @author Mat
 */
public class FsScraper extends Scraper {

	@Override
	public void scrape(File f) {
		
		//env.log( f.getParentFile().getParentFile().getName() );
		
		Integer parent1 = ref.updateId( f.getParentFile().getParentFile().getName() );//ref.updateGroup( f.getParentFile().getParentFile().getName() );
		Integer parent2 = ref.updateId( f.getParentFile().getName() );//ref.updateGroup( f.getParentFile().getName() );
		Integer child = ref.updateId(f.getName());
		
		ref.updateGroup(parent1, parent2);
		ref.updateGroup(parent2, child);
		
		
		
	}
	
}
