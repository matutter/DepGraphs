/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package depgraphs.ui.graph.graphassist;

import depgraphs.ui.graph.gconst;
import depgraphs.ui.graph.gtype;
import java.awt.BasicStroke;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.geom.AffineTransform;
import java.awt.geom.Point2D;
import java.util.Iterator;
import prefuse.Constants;
import prefuse.data.Edge;
import prefuse.data.Node;
import prefuse.render.EdgeRenderer;
import prefuse.util.ColorLib;
import prefuse.util.GraphicsLib;
import prefuse.visual.EdgeItem;
import prefuse.visual.VisualItem;

/**
 *
 * @author Mat
 */
public class EdgeRenderer2 extends EdgeRenderer {
	
	public static final int shift_px = 10;
	
	@Override
	protected Shape getRawShape(VisualItem item) {
        EdgeItem   edge = (EdgeItem)item;
        VisualItem item1 = edge.getSourceItem();
        VisualItem item2 = edge.getTargetItem();
        
        int type = m_edgeType;
        
        getAlignedPoint(m_tmpPoints[0], item1.getBounds(),
                        m_xAlign1, m_yAlign1);
        getAlignedPoint(m_tmpPoints[1], item2.getBounds(),
                        m_xAlign2, m_yAlign2);
        m_curWidth = (float)(m_width * getLineWidth(item));
        
        // create the arrow head, if needed
        EdgeItem e = (EdgeItem)item;
        if ( e.isDirected() && m_edgeArrow != Constants.EDGE_ARROW_NONE ) {
            // get starting and ending edge endpoints
            boolean forward = (m_edgeArrow == Constants.EDGE_ARROW_FORWARD);
            Point2D start = null, end = null;
            start = m_tmpPoints[forward?0:1];
            end   = m_tmpPoints[forward?1:0];
            
            // compute the intersection with the target bounding box
            VisualItem dest = forward ? e.getTargetItem() : e.getSourceItem();
            int i = GraphicsLib.intersectLineRectangle(start, end,
                    dest.getBounds(), m_isctPoints);
            if ( i > 0 ) end = m_isctPoints[0];
            
            // create the arrow head shape
            AffineTransform at = getArrowTrans(start, end, m_curWidth);
            m_curArrow = at.createTransformedShape(m_arrowHead);
            
            // update the endpoints for the edge shape
            // need to bias this by arrow head size
            Point2D lineEnd = m_tmpPoints[forward?1:0]; 
            lineEnd.setLocation(0, -m_arrowHeight);
            at.transform(lineEnd, lineEnd);
        } else {
            m_curArrow = null;
        }
        
        // create the edge shape
        Shape shape = null;
        double n1x = m_tmpPoints[0].getX();
        double n1y = m_tmpPoints[0].getY();
        double n2x = m_tmpPoints[1].getX();
        double n2y = m_tmpPoints[1].getY();
        switch ( type ) {
            case Constants.EDGE_TYPE_LINE:          
                m_line.setLine(n1x+shift_px, n1y, n2x+shift_px, n2y);
                shape = m_line;
                break;
            case Constants.EDGE_TYPE_CURVE:
                getCurveControlPoints(edge, m_ctrlPoints,n1x,n1y,n2x,n2y);
                m_cubic.setCurve(
					n1x,
					n1y,
                    m_ctrlPoints[0].getX(),
					m_ctrlPoints[0].getY(),
                    m_ctrlPoints[1].getX(),
					m_ctrlPoints[1].getY(),
                    n2x,
					n2y
				);
                shape = m_cubic;
                break;
            default:
                throw new IllegalStateException("Unknown edge type");
        }
        
        // return the edge shape
        return shape;
    }
	
	@Override
    public void render(Graphics2D g, VisualItem item) {
		Edge e = (Edge) item;
		Node src = e.getSourceNode();
		Node dst = e.getTargetNode();
		
		VisualItem vsrc = (VisualItem) src;
		VisualItem vdst = (VisualItem) dst;
		gtype src_t = (gtype) src.get(gconst.TYPE); 
		gtype dst_t = (gtype) dst.get(gconst.TYPE);
		

		
		if(  vsrc.isHighlighted() || vsrc.isHover() ) {
			int color = gconst.COLOR_EDGE;
			switch( src_t ) {
				case PROJECT:
					color = getProjectColor( dst_t );
					break;
				case PACKAGE:
					color = getPackageColor( dst_t );
					break;
				case SOURCE:
					color = getSourceColor( dst_t );
					break;
			}
			item.setStrokeColor( color );
			item.setStroke(gconst.EDGE_STROKE_THICK);
		} else if( gtype.SOURCE.equals(src_t) && src_t.equals(dst_t) && (vsrc.isHover() || vdst.isHover()) ) {
			item.setStrokeColor( gconst.SRC_ALT.getRGB() );
			item.setStroke(gconst.EDGE_STROKE_THICK);
		} else {
			item.setStrokeColor(gconst.COLOR_EDGE);
			item.setStroke(gconst.EDGE_STROKE);
		}
		
		if( (vdst.isHighlighted() || vdst.isHover()) && gtype.SOURCE.equals(src_t) && src_t.equals(dst_t) ) {
			item.setStrokeColor( gconst.SRC_ALT.getRGB() );
			item.setStroke(gconst.EDGE_STROKE_THICK);
		}
		Shape shape = getShape(item);
        if (shape != null)
           GraphicsLib.paint(g, item, shape, getStroke(item), getRenderType(item));
    }
	
	int getSourceColor( gtype t ) {
		switch(t){
			case SOURCE: return gtype.SOURCE_TO_SOURCE.color;
			default:
				return gconst.COLOR_EDGE;
		}
	}
	int getProjectColor( gtype t ) {
		switch(t){
			case PACKAGE: return gtype.PROJECT_TO_PACKAGE.color;
			default:
				return gconst.COLOR_EDGE;
		}
	}
	int getPackageColor( gtype t ) {
		switch(t){
			case PACKAGE: return gtype.PACKAGE_TO_PACKAGE.color;
			case SOURCE: return gtype.PACKAGE_TO_SOURCE.color;
			default:
				return gconst.COLOR_EDGE;
		}
	}
	
	void accentEdges( Iterator it, gtype type, int color, BasicStroke stroke ) {
		while( it.hasNext() ) {
			VisualItem item = (VisualItem) it.next();
			if( type.equals( item.get(gconst.TYPE) ) ) {
				item.setStroke(stroke);
				item.setStrokeColor(color);
			}
		}
	}
	
}
