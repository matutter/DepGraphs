/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package depgraphs.ui;

import depgraphs.env;
import java.awt.Color;
import java.awt.Desktop.Action;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.AbstractAction;
import javax.swing.BorderFactory;
import javax.swing.JPopupMenu;
import javax.swing.JTextField;

/**
 *
 * @author Mat
 */
public class Input extends JTextField {
	private JPopupMenu popup;
	public Input() {
		super();
		JTextField self = this;
		popup = new JPopupMenu();
		
		this.setDragEnabled(false);
		this.setDoubleBuffered(false);
		this.setBackground( new Color(0,0,0,48) );
		this.setForeground( Color.WHITE );
		this.setBorder( BorderFactory.createEmptyBorder(8, 8, 8, 8) );
		
		
		popup.add( new AbstractAction("Paste") {
			@Override
			public void actionPerformed(ActionEvent e) {
                self.paste();
			}
        });
		
		this.addMouseListener(new MouseListener(){

			@Override
			public void mouseClicked(MouseEvent e) {
				switch( e.getButton() ) {
					case MouseEvent.BUTTON1:
						//env.log( "111" );
					break;
					case MouseEvent.BUTTON2:
						//env.log( "222" );
					break;
					case MouseEvent.BUTTON3:
						popup.show( self , e.getX(), e.getY());
					break;
				}
			}

			@Override
			public void mousePressed(MouseEvent e) {
			}

			@Override
			public void mouseReleased(MouseEvent e) {
			}

			@Override
			public void mouseEntered(MouseEvent e) {
			}

			@Override
			public void mouseExited(MouseEvent e) {
			}
		});
		
		
	}
}
