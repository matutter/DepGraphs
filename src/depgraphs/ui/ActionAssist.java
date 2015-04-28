/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package depgraphs.ui;

import java.awt.event.ActionEvent;
import java.util.function.Consumer;
import javax.swing.AbstractAction;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;

/**
 *
 * @author Mat
 */
public class ActionAssist {
	
	public static void ApplyMenuAction(JPopupMenu p, String label,Runnable ev) {
		ApplyMenuAction(p, label, (e)->{ ev.run(); } );
	}
	
	public static void ApplyMenuAction(JPopupMenu p, String label,Consumer<ActionEvent> ev) {
		JMenuItem item = new JMenuItem();
		item.setAction( new AbstractAction(){
			@Override
			public void actionPerformed(ActionEvent e) {
				ev.accept(e);
			}
		});
		item.setText(label);
		p.add(item);
	}
	
}
