/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package depgraphs.ui;

import depgraphs.eventful.Eventful;
import java.awt.Color;
import java.awt.Component;
import java.awt.FlowLayout;
import javax.swing.JToolBar;

/**
 *
 * @author Mat
 */
public class Toolbar extends Eventful implements Element {
	JToolBar t;
	public Toolbar() {
		t = new JToolBar();
	//	t.setLayout(new FlowLayout());
		t.setBackground( new Color(0,0,0,0) );
		t.setOpaque(true);
		t.setBorderPainted(false);
		t.setFloatable(false);
		t.setRollover(true);
		
		Btn toggle_btn = new Btn( "layout", "Layout On", this ).setAltText( "Layout Off" );
		Btn load_btn = new Btn( "load", "load", this );
		
		t.add( toggle_btn );
		t.add( load_btn );
	}
	
	@Override
	public Component getComponent() {
		return t;
	}

	@Override
	public Component setBounds(int x, int y, int span_x, int span_y) {
		t.setBounds(x, y, span_x, span_y);
		return t;
	}
}
