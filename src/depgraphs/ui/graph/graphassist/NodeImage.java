/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package depgraphs.ui.graph.graphassist;

import depgraphs.ui.graph.gconst;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.geom.Ellipse2D;
import java.awt.image.BufferedImage;

/**
 *
 * @author Mat
 */
public class NodeImage {
	
	static final Shape shape = new Ellipse2D.Double(12, 12, 78, 78);
	static final int out = 16;
	static final int thickness = 10;
	
	static final Image img_PACK, img_PROJ, img_SRC;
	static final Image img_IMP;
	static final Image img_DEF;
	
	static {
		img_PROJ = get(gconst.PROJ_INNER,gconst.PROJ_OUTER);
		img_PACK = get(gconst.PACK_INNER, gconst.PACK_OUTER);
		img_SRC = get(gconst.SRC_INNER,gconst.SRC_OUTER);
		img_DEF = get(Color.DARK_GRAY, Color.GRAY);
		img_IMP = get(Color.DARK_GRAY, Color.GRAY);
	}
	
	static Image get( Color fill, Color stroke ) {
		BufferedImage img = new BufferedImage(100, 100, BufferedImage.TYPE_INT_ARGB);
		Graphics2D g = img.createGraphics();
		g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		g.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
		g.setColor(fill);
		g.fill(shape);
		g.setStroke( new BasicStroke(thickness) );
		g.setColor(stroke);
		g.draw(shape);
		return img.getScaledInstance(out, out, BufferedImage.SCALE_AREA_AVERAGING );
	}
	
	public static Image getImage( String s ) {
//		if( !s.equals(  "PACKAGE" ) )
//			System.out.println(s);
		switch( s ){
			case "PROJECT": return img_PROJ;
			case "PACKAGE": return img_PACK;
			case "SOURCE":	return img_SRC;
			default:		return img_DEF;
		}
	}
}
