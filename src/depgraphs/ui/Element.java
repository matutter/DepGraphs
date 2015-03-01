/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package depgraphs.ui;

import java.awt.Component;

/**
 *
 * @author Mat
 */
public interface Element {
	public Component getComponent();
	public Component setBounds( int x, int y, int span_x, int span_y );
}
