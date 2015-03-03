/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package depgraphs;

import depgraphs.eventful.EventAdapter;
import depgraphs.ui.GStreamGraph;
import depgraphs.ui.Toolbar;
import depgraphs.ui.UIBuilder;
import depgraphs.ui.style.css;
import java.awt.Dimension;
import javax.swing.JFrame;


/**
 *
 * @author Mat
 */
public class DepGraphs {
	
	/**
	 * @param args the command line arguments
	 */
	
	public static void main(String[] args) {
		//String path = "C:\\Users\\Mat\\Documents\\NetBeansProjects\\DepGraphs\\src\\depgraphs";
		env.log(" > starting network sequence ");

		EventAdapter adapter = new EventAdapter();
		Toolbar toolbar = new Toolbar();
		GStreamGraph gs = new GStreamGraph( css.NightSky );
		
		UIBuilder builder = new UIBuilder();
		
		builder
		.useDim( new Dimension(700,800) )
		.useToolbar( toolbar )
		.useAdapter( adapter )
		.useGraph( gs )
		;
		
		toolbar.on("layout-click", (Object sender, Object obj)->{
			gs.toggleAuto();
		});
		
		toolbar.on("load-click", (Object sender, Object obj)->{
			adapter.clear( (ctx)->{
				ctx.loadOnNextTick( toolbar.field.getText() );
			});
		});
		
		JFrame f = builder.build();
		f.setVisible(true);
	}
	
}
