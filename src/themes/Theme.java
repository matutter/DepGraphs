/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package themes;

import org.graphstream.graph.Graph;
import org.graphstream.graph.implementations.SingleGraph;

/**
 *
 * @author Mat
 */
public abstract class Theme {
	public Graph g;
	public Theme(String s) { g = new SingleGraph(s); }
}
