/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package depgraphs.ui.graph;

import depgraphs.ui.graph.graphassist.EdgeRenderer2;
import depgraphs.ui.graph.graphassist.NodeColorAction;
import depgraphs.ui.graph.graphassist.NodeImage;
import depgraphs.ui.graph.graphassist.TextColorAction;
import depgraphs.ui.graph.graphassist.TreeRootAction;
import java.awt.Image;
import prefuse.Constants;
import prefuse.Visualization;
import prefuse.action.ActionList;
import prefuse.action.ItemAction;
import prefuse.action.RepaintAction;
import prefuse.action.animate.ColorAnimator;
import prefuse.action.animate.PolarLocationAnimator;
import prefuse.action.animate.QualityControlAnimator;
import prefuse.action.animate.VisibilityAnimator;
import prefuse.action.assignment.ColorAction;
import prefuse.action.assignment.FontAction;
import prefuse.action.layout.CollapsedSubtreeLayout;
import prefuse.action.layout.graph.RadialTreeLayout;
import prefuse.activity.SlowInSlowOutPacer;
import prefuse.data.Graph;
import prefuse.render.DefaultRendererFactory;
import prefuse.render.EdgeRenderer;
import prefuse.render.ImageFactory;
import prefuse.render.LabelRenderer;
import prefuse.render.ShapeRenderer;
import prefuse.visual.VisualItem;
import prefuse.visual.expression.InGroupPredicate;

/**
 *
 * @author Mat
 */
public class gVisual extends Visualization {
	
	public gVisual(Graph g) {
		add( gconst.GRAPH, g );
	
		setInteractive(gconst.EDGES, null, false);
        
		LabelRenderer nr;
		EdgeRenderer er;
		
        // -- set up renderers --
        nr = new LabelRenderer(gconst.LABEL);
        nr.setRenderType(ShapeRenderer.RENDER_TYPE_FILL);
		nr.setImageField(gconst.TYPE);
		
		nr.setImageFactory( new ImageFactory(){
			@Override
			public Image getImage(String imageLocation) {
				return NodeImage.getImage(imageLocation);
			}
		});
        nr.setHorizontalAlignment(Constants.BOTTOM);
        nr.setRoundedCorner(8,8);
		
		// edge control
//		NeighboreColorizer nc = new NeighboreColorizer();
//		
//		ActionList li = new ActionList( Action.INFINITY );
//		li.add( nc ) ;
//		li.setStepTime(1);
//		putAction( gconst.HIGHLIGHTER, li );

		er = new EdgeRenderer2();
		er.setHorizontalAlignment1(Constants.LEFT);
		er.setHorizontalAlignment2(Constants.LEFT);
        DefaultRendererFactory rf = new DefaultRendererFactory(nr);
        rf.add(new InGroupPredicate(gconst.EDGES), er);
        setRendererFactory(rf);
               
        // -- set up processing actions --
        
        // colors
        ItemAction nodeColor = new NodeColorAction(gconst.NODES);
        ItemAction textColor = new TextColorAction(gconst.NODES);
		
        putAction(gconst.TEXTCOLOR, textColor);
		
//		int[] egdge_palette = { ColorLib.rgb(0, 230, 115), ColorLib.rgb(0, 115, 230), ColorLib.rgb(230, 0, 115) };
//		DataColorAction edgeColor = new DataColorAction(
//			gconst.EDGES,
//			gconst.TYPE,
//			Constants.NOMINAL,
//			VisualItem.STROKECOLOR,
//			egdge_palette
//		);
		
        ItemAction edgeColor = new ColorAction(
			gconst.EDGES,
            VisualItem.STROKECOLOR,
			gconst.COLOR_EDGE
		);
        
        FontAction fonts = new FontAction(gconst.NODES, gconst.FONT_SM);
        fonts.add(gconst.FOCUS, gconst.FONT_MD);
		
        
        // recolor
        ActionList recolor = new ActionList();
        recolor.add(textColor);
        recolor.add(nodeColor);
//        recolor.add(nc);
        putAction(gconst.RECOLOR, recolor);
        
        // repaint
        ActionList repaint = new ActionList();
        repaint.add(recolor);
        repaint.add(new RepaintAction());
        putAction(gconst.REPAINT, repaint);
        
        // animate paint change
        ActionList animatePaint = new ActionList(400);
        animatePaint.add(new ColorAnimator(gconst.NODES));
        animatePaint.add(new RepaintAction());
        putAction(gconst.ANIM_COLOR, animatePaint);
        
        // create the tree layout action
        RadialTreeLayout treeLayout = new RadialTreeLayout(gconst.GRAPH);
        putAction(gconst.LAYOUT, treeLayout);
        
        CollapsedSubtreeLayout subLayout = new CollapsedSubtreeLayout(gconst.GRAPH);
        putAction(gconst.SUB_LAYOUT, subLayout);
        
		
        // create the filtering and layout
        ActionList filter = new ActionList();
        filter.add(new TreeRootAction(gconst.GRAPH));
        filter.add(fonts);
        filter.add(treeLayout);
        filter.add(subLayout);
        filter.add(textColor);
        filter.add(nodeColor);
        filter.add(edgeColor);
//        filter.add(nc);
        putAction(gconst.FILTER, filter);
        
        // animated transition
        ActionList animate = new ActionList(500);
        animate.setPacingFunction(new SlowInSlowOutPacer());
        animate.add(new QualityControlAnimator());
        animate.add(new VisibilityAnimator(gconst.GRAPH));
        animate.add(new PolarLocationAnimator(gconst.NODES, gconst.LINEAR));
        animate.add(new ColorAnimator(gconst.NODES));
        animate.add(new RepaintAction());
        putAction(gconst.ANIMATE, animate);
        alwaysRunAfter(gconst.FILTER, gconst.ANIMATE);
		
		
		run( gconst.HIGHLIGHTER  );
	}

	
	
	
}
