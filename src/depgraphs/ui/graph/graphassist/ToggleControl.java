/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package depgraphs.ui.graph.graphassist;

import java.awt.event.MouseEvent;
import prefuse.controls.ControlAdapter;
import prefuse.visual.VisualItem;

/**
 *
 * @author Mat
 */
public class ToggleControl extends ControlAdapter {

	String m_field;
	String m_group;
	
	public ToggleControl( String field, String group ){
		m_field = field;
		m_group = group;
	}
	
	@Override
	public void itemClicked(VisualItem item, MouseEvent e) {
		if( item.isInGroup(m_group) ) {
			item.setHighlighted(!item.isHighlighted());
		}
	}
}
