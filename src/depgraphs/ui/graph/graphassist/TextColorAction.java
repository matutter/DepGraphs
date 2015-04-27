package depgraphs.ui.graph.graphassist;

import depgraphs.ui.graph.gconst;
import prefuse.action.assignment.ColorAction;
import prefuse.util.ColorLib;
import prefuse.visual.VisualItem;

public class TextColorAction extends ColorAction {
	public TextColorAction(String group) {
		super(group, VisualItem.TEXTCOLOR, ColorLib.gray(0));
		add(gconst.HOVER,gconst.COLOR_HOVER);
	}
}
