/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package depgraphs.ui;

import depgraphs.DepGraphs;
import depgraphs.eventful.Eventful;
import depgraphs.ui.style.css;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.awt.image.ImageFilter;
import java.io.InputStream;
import java.net.URL;
import java.util.Enumeration;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.GrayFilter;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JPanel;
import javax.swing.JToolBar;
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
	
	public Toolbar() {
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
		
		toggle_btn.setActive(false);
		
		l.add(load_btn);
		r.add(toggle_btn);
		
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
