/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package depgraphs;

import depgraphs.eventful.EventAdapter;
import depgraphs.ui.Btn;
import depgraphs.ui.Toolbar;
import depgraphs.ui.UIBuilder;
import depgraphs.ui.graph.gmain;
import depgraphs.ui.graph.gtype;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.util.Optional;
import javax.swing.AbstractAction;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
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
	static JLabel progress;
	
	public static void setText( String s ) {
		if( progress == null ) return;
		progress.setText(s);
	}
	
	public static void main(String[] args) {
		gmain m = new gmain();
		looknFeel();
//		args = new String[]{ "C:\\Users\\Mat\\Documents\\NetBeansProjects\\DepGraphs\\src\\depgraphs" };

		progress = new JLabel("DepGraphs");
		
		EventAdapter adapter = new EventAdapter();
		Toolbar toolbar = new Toolbar();
		
		select = new JFileChooser();
		select.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
		
		UIBuilder builder = new UIBuilder();
		
		builder
			.useDim( new Dimension(700,800) )
			.useToolbar( toolbar )
			.useAdapter( adapter )
			;
		
		adapter.setNoActivityIndicator(()->{ toolbar.showLoader(false); });
		adapter.setActivityIndicator(()->{ toolbar.showLoader(true); });
		
		toolbar.on("layout-click", (Object sender, Object obj)->{
//			gs.toggleAuto();
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
		
		// popup tool menu
		JPopupMenu pop = new JPopupMenu("Toolbar");
		JMenuItem importToggle = new JMenuItem(new AbstractAction(){
			@Override
			public void actionPerformed(ActionEvent e) {
				gmain.inst.toggle( gtype.IMPORT );
			}
		});
		importToggle.setText("Toggle Imports");
		
		JMenuItem clearVis = new JMenuItem(new AbstractAction(){
			@Override
			public void actionPerformed(ActionEvent e) {
				gmain.inst.clear();
			}
		});
		clearVis.setText("Clear Vis");
		
		pop.add(importToggle);
		pop.add(clearVis);
		
		toolbar.on("tool-click", (Object sender, Object obj)->{
			pop.setInvoker(toolbar.toolBtn);
			Point p = toolbar.toolBtn.getLocationOnScreen();
			p.y += toolbar.toolBtn.getHeight();
			pop.setLocation( p );
			pop.setVisible(true);
		});
		
		JFrame f = builder.build();
		f.add(progress, BorderLayout.SOUTH);
		f.setVisible(true);
		
		if( args.length > 0 )
			adapter.loadOnNextTick(args[0]);
		
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
