/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package depgraphs.ui;

import depgraphs.eventful.EventAdapter;
import depgraphs.ui.style.css;
import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLayeredPane;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;

/**
 *
 * @author Mat
 */
public class UIBuilder {
	
	EventAdapter adapter;
	Toolbar toolbar;
	GStreamGraph gs;
	
	Dimension dim;
	
	String style;
	
	public UIBuilder() {
		adapter = null;
		toolbar = null;
		dim = null;
		gs = null;
		style = null;
	}
	
	public UIBuilder useDim( Dimension dim  ) {
		this.dim = dim;
		return this;
	}

	public UIBuilder useGraph( GStreamGraph gs  ) {
		this.gs = gs;
		return this;
	}
	
	public UIBuilder useToolbar( Toolbar toolbar  ) {
		this.toolbar = toolbar;
		return this;
	}
	
	public UIBuilder useAdapter( EventAdapter adapter  ) {
		this.adapter = adapter;
		return this;
	}
	
	public JFrame build() {
		JFrame f = new JFrame();
		f.setLayout(new BorderLayout());
		f.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JLayeredPane p = new JLayeredPane();
		p.setLayout( new BorderLayout() );
		
		if( style == null )
			style = css.Default;
		
		if(gs == null)
			gs = new GStreamGraph( style );
		
		if( toolbar == null ) 
			toolbar = new Toolbar();

		if( adapter == null )
			adapter = new EventAdapter();
		
		if( dim == null )
			dim = new Dimension(500,600);
		
//		toolbar.setBounds(0,0,400,40);
		
		p.add( toolbar.getComponent(), BorderLayout.NORTH );
		p.add( gs.getComponent(), BorderLayout.CENTER );
		
		p.setPreferredSize( dim );
		
		f.getContentPane().add( p, BorderLayout.CENTER );
		f.setPreferredSize( dim );
		f.setSize( dim );

		adapter.addGraph(gs).runInAnotherThread();
		f.pack();
		return f;
	}
}
