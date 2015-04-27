/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package depgraphs.ui;

import depgraphs.eventful.Eventful;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.FlowLayout;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author Mat
 */
public final class Toolbar extends Eventful  {
//	JToolBar t;
	JPanel p, l, r;
	
	Timer loader;
	IconBtn loadIco;
	public IconBtn toolBtn;
//	IconBtn removeBtn;
	
	public Toolbar() {
		
//		JMenu drop = new JComboBox();
//		drop.add
		p = new JPanel();
		l = new JPanel();
		r = new JPanel();
		p.setLayout(new BorderLayout());
		l.setLayout(new FlowLayout());
		r.setLayout(new FlowLayout());
		p.add(l,BorderLayout.WEST);
		p.add(r,BorderLayout.EAST);
		l.setBackground(Color.WHITE);
		r.setBackground(Color.WHITE);
		p.setBackground(Color.WHITE);
		
		IconBtn toggle_btn = new IconBtn( "layout", "lock.png", this );
		IconBtn load_btn = new IconBtn( "load", "folder.png", this ).setAutoToggle(false);
		loadIco = new IconBtn( null, "loader_sm.gif", this ).setAutoToggle(false);
		IconBtn removeBtn = new IconBtn( "remove", "remove.png", this ).setAutoToggle(true);
		toolBtn = new IconBtn( "tool", "tool.png", this ).setAutoToggle(false);
		
		removeBtn.altSwap();
		toggle_btn.setActive(false);
		
		l.add(load_btn);
		l.add(toolBtn);
		r.add(toggle_btn);
		r.add(removeBtn);
		
		JPanel panel = new JPanel();
		panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));
		panel.setBackground(Color.WHITE);
		panel.add(Box.createHorizontalGlue());
		panel.add(loadIco);
		panel.add(Box.createHorizontalGlue());
		p.add(panel,BorderLayout.CENTER);
		showLoader(false);
	}
	
	public void showLoader(Boolean b) {
		loadIco.setVisible(b);
	}
	
	public Component getComponent() {
		return p;
	}

}
