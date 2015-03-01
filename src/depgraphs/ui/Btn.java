/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package depgraphs.ui;

import depgraphs.env;
import depgraphs.eventful.Eventful;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;

/**
 *
 * @author Mat
 */
public class Btn extends JLabel {
	
	Color active_hover_foreground_color = Color.WHITE;
	Color alt_normal_color = Color.ORANGE;
	Color normal_color = Color.GRAY;
	String altText;
	String _id;
	
	public Btn(String id, String s, Eventful parent){
		super(s);
		this._id = id;
		this.setName(s);
		this.setForeground( normal_color );
		this.setBackground( new Color(0,0,0,0) );
		this.setBorder( BorderFactory.createEmptyBorder(8, 8, 8, 8) );
		
		this.setCursor( new Cursor( Cursor.HAND_CURSOR ) );
		
		String evName = _id+"-click";
		
		parent.register( evName );
		
		this.addMouseMotionListener( new MouseMotionListener(){
			@Override
			public void mouseDragged(MouseEvent e) {}
			@Override
			public void mouseMoved(MouseEvent e) {}
		} );
		
		this.addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent e) {
				altSwap();
				parent.fire(evName, parent, e);
			}
			@Override
			public void mousePressed(MouseEvent e) {}
			@Override
			public void mouseReleased(MouseEvent e) {
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				setHover(true);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				setHover(false);
			}
		});
	}
	
	public void setHover(boolean tof) {
		this.setForeground( tof ? active_hover_foreground_color : normal_color );
	}
	
	public void altSwap() {
		Color ref = normal_color;
		normal_color = alt_normal_color;
		alt_normal_color = ref;
		if( altText != null ) {
			String s = this.getText();
			this.setText( altText );
			this.altText = s;
		}
	}
	
	public Btn setAltText(String s) {
		this.altText = s;
		return this;
	}
	
}
