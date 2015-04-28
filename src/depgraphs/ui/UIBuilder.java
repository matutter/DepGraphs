/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package depgraphs.ui;

import depgraphs.eventful.EventAdapter;
import depgraphs.ui.graph.gmain;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLayeredPane;

/**
 *
 * @author Mat
 */
public class UIBuilder {
	
	EventAdapter adapter;
	Toolbar toolbar;
	Dimension dim;
	String style;
	
	public UIBuilder() {
		adapter = null;
		toolbar = null;
		dim = null;
		style = null;
	}
	
	public UIBuilder useDim( Dimension dim  ) {
		this.dim = dim;
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
		
		
		if( toolbar == null ) 
			toolbar = new Toolbar();

		if( adapter == null )
			adapter = new EventAdapter();
		
		if( dim == null )
			dim = new Dimension(500,600);
		
		p.add( toolbar.getComponent(), BorderLayout.NORTH );
		gmain.inst.attach( (c)->{p.add((Component) c, BorderLayout.CENTER );}, p );
		
		p.setPreferredSize( dim );
		
		f.getContentPane().add( p, BorderLayout.CENTER );
		f.setPreferredSize( dim );
		f.setSize( dim );

		adapter.addGraph(gmain.inst).runInAnotherThread();
		f.pack();
		return f;
	}
}
