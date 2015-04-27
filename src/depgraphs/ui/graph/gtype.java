package depgraphs.ui.graph;

import prefuse.util.ColorLib;

/**
 *
 * @author Mat
 */
public enum gtype {
	PACKAGE,
	IMPORT,
	SOURCE,
	PROJECT,
	
	PACKAGE_EDGE    (),
	IMPORT_EDGE	    (),
	SOURCE_EDGE     (),
	NOMINAL_EDGE    (),
	
	PROJECT_TO_PACKAGE(gconst.PROJ_OUTER.getRGB()), // SEVERE 5
	PACKAGE_TO_PACKAGE(gconst.PACK_OUTER.getRGB()), // SEVERE 4
	PACKAGE_TO_SOURCE(gconst.PACK_OUTER.getRGB()), // SEVERE 3
	SOURCE_TO_SOURCE(gconst.SRC_OUTER.getRGB()), // SEVERE 2
	
	
	PACKAGE_TO_IMPORT(),
	;
	
	public final int color;
	
	gtype() { color = 0; }
	gtype(int i) { color = i; }
	
	
	public static int colorOrDefault( Object t ) {
		if( t instanceof gtype ) 
			return ((gtype)t).color;
		return 0;
	}
	
}
