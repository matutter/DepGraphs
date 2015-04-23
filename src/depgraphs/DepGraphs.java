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
import java.io.IOException;
import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.UIManager;


/**
 *
 * @author Mat
 */
public class DepGraphs {
	
	/**
	 * @param args the command line arguments
	 */
	
	static JFileChooser select;

	
	public static void main(String[] args) {
		looknFeel();
		args = new String[]{ "C:\\Users\\Mat\\Documents\\NetBeansProjects\\DepGraphs\\src\\depgraphs" };

		
		EventAdapter adapter = new EventAdapter();
		Toolbar toolbar = new Toolbar();
		GStreamGraph gs = new GStreamGraph( css.Default );
		
		select = new JFileChooser();
		select.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
		
		UIBuilder builder = new UIBuilder();
		
		builder
			.useDim( new Dimension(700,800) )
			.useToolbar( toolbar )
			.useAdapter( adapter )
			.useGraph( gs )
			;
		
		adapter.setNoActivityIndicator(()->{ toolbar.showLoader(false); });
		adapter.setActivityIndicator(()->{ toolbar.showLoader(true); });
		
		toolbar.on("layout-click", (Object sender, Object obj)->{
			gs.toggleAuto();
		});
		
		toolbar.on("load-click", (Object sender, Object obj)->{
			adapter.clear( (ctx)->{
				Toolbar bar = (Toolbar)sender;
				select.showDialog(bar.getComponent(), "Choose a JAVA Project Directory");
				Optional.ofNullable(select.getSelectedFile()).ifPresent( f -> {
					try {
						ctx.loadOnNextTick( f.getCanonicalPath() );
					} catch (IOException ex) {}
				});
			});
		});
		JFrame f = builder.build();
		f.setVisible(true);
		
		Optional.ofNullable(args[0]).ifPresent(adapter::loadOnNextTick);
		
	}

	private static void looknFeel() {
		try {
			for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
				if ( info.getName().equals("Windows") ) {
					System.out.println( info.getName() + " PLAF" );
					UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (Exception e) {}
	}
	
}
