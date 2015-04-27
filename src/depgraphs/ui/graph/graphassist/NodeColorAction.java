package depgraphs.ui.graph.graphassist;

import depgraphs.ui.graph.gconst;
import prefuse.action.assignment.ColorAction;
import prefuse.util.ColorLib;
import prefuse.visual.VisualItem;

public class NodeColorAction extends ColorAction {
	public NodeColorAction(String group) {
		super(group, VisualItem.FILLCOLOR, ColorLib.rgba(255,255,255,0));
		add(gconst.HOVER, ColorLib.gray(220,230));
		add(gconst.SEARCH, ColorLib.rgb(255,190,190));
		add(gconst.FOCUS, ColorLib.rgb(198,229,229));
	}
}
