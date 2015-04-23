/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package depgraphs.ui;

import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 *
 * @author Mat
 */
public class HoverRefresh {
	Component c;
	
	public HoverRefresh(Component c){
		this.c = c;
	}
	
	public MouseListener get() {
		return new MouseListener(){
			@Override
			public void mouseClicked(MouseEvent e) {}
			@Override
			public void mousePressed(MouseEvent e) {}
			@Override
			public void mouseReleased(MouseEvent e) {}
			@Override
			public void mouseEntered(MouseEvent e) { c.revalidate(); }
			@Override
			public void mouseExited(MouseEvent e) { c.revalidate(); }
		};
	}
}
