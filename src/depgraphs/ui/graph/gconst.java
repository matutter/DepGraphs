package depgraphs.ui.graph;
	
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.util.Map;
import prefuse.data.expression.Predicate;
import prefuse.data.expression.parser.ExpressionParser;
import prefuse.util.ColorLib;
import prefuse.util.FontLib;
import prefuse.visual.expression.InGroupPredicate;

/**
 *
 * @author Mat
 */
public interface gconst {

	Class[] COLUMN_TYPE = { String.class, gtype.class, Boolean.class, Boolean.class };
	
	
	String GRAPH      = "g";
	String NODES      = GRAPH+".nodes";
	String EDGES      = GRAPH+".edges";
	String LINEAR     = "lin";
	String LABEL      = "label";
	String TEXTCOLOR  = "tcolr";
	String ANIM_COLOR = "anipa";
	String ANIMATE    = "ani";
	String RECOLOR    = "rec";
	String REPAINT    = "rep";
	String FONTNAME   = "Tahoma";
	String FILTER     = "filt";
	String TYPE       = "typ";
	String STATE      = "stat";
	String LAYOUT     = "lay";
	String LOCK		  = "locker";
	String SUB_LAYOUT = "subl";
	String HIGHLIGHTER = "hili";
	String COLOR = "colour";
		
	BasicStroke IND_STROKE = new BasicStroke(1.8f);
	BasicStroke EDGE_STROKE = new BasicStroke(1.4f);
	BasicStroke EDGE_STROKE_THICK = new BasicStroke(3.2f);

	// graph BG color
	Color COLOR_BG = new Color(248, 247, 247);
	
	// project node color
	Color PROJ_INNER = new Color(142,0,0);
	Color PROJ_OUTER = new Color(219, 0, 0);
	
	// package node color
	Color PACK_INNER = new Color(0, 131, 43);
	Color PACK_OUTER = new Color(13, 255, 92);

	// source node color
	Color SRC_INNER = new Color(0, 81, 192);
	Color SRC_OUTER = new Color(13, 176, 255);
	Color SRC_ALT = new Color(255, 13, 176);
	
	// int colors
	int COLOR_EDGE = ColorLib.rgb(200, 200, 200);
	int COLOR_HOVER = ColorLib.rgb(255, 45, 45);
	
	// fonts
	Font FONT_SM = FontLib.getFont(FONTNAME, 10);
	Font FONT_MD = FontLib.getFont(FONTNAME, Font.BOLD, 15);
	
	// predicates
	Predicate FOCUS = new InGroupPredicate("_focus_");
	Predicate SEARCH = new InGroupPredicate("_search_");
	Predicate HOVER = (Predicate)ExpressionParser.parse("_hover");
}
