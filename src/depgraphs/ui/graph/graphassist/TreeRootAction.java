/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package depgraphs.ui.graph.graphassist;

import java.util.Iterator;
import prefuse.Visualization;
import prefuse.action.GroupAction;
import prefuse.data.Graph;
import prefuse.data.Node;
import prefuse.data.tuple.TupleSet;

/**
 *
 * @author Mat
 */
public class TreeRootAction extends GroupAction {
	public TreeRootAction(String graphGroup) {
		super(graphGroup);
	}
	public void run(double frac) {
		TupleSet focus = m_vis.getGroup(Visualization.FOCUS_ITEMS);
		if ( focus==null || focus.getTupleCount() == 0 ) return;
		Graph g = (Graph)m_vis.getGroup(m_group);
		Node f = null;
		while ( true ) {
			Object o = focus.tuples().next();
			if( !( o instanceof prefuse.data.Node ) ) break;
			if( g.containsTuple(f=(Node)o) ) break;
			f = null;
		}
		if ( f == null ) return;
		g.getSpanningTree(f);
	}
}