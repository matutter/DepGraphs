/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package depgraphs.ui.graph;

import depgraphs.ui.graph.graphassist.ToggleControl;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.MouseEvent;
import javafx.geometry.Bounds;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import prefuse.Display;
import prefuse.Visualization;
import prefuse.controls.ControlAdapter;
import prefuse.controls.DragControl;
import prefuse.controls.FocusControl;
import prefuse.controls.HoverActionControl;
import prefuse.controls.NeighborHighlightControl;
import prefuse.controls.PanControl;
import prefuse.controls.WheelZoomControl;
import prefuse.controls.ZoomToFitControl;
import prefuse.data.Node;
import prefuse.data.Table;
import prefuse.data.Tuple;
import prefuse.data.query.SearchQueryBinding;
import prefuse.data.search.PrefixSearchTupleSet;
import prefuse.data.search.SearchTupleSet;
import prefuse.data.tuple.DefaultTupleSet;
import prefuse.data.tuple.TupleSet;
import prefuse.util.display.DisplayLib;
import prefuse.util.ui.JFastLabel;
import prefuse.util.ui.JSearchPanel;
import prefuse.util.ui.UILib;
import prefuse.visual.VisualItem;
import prefuse.visual.sort.TreeDepthItemSorter;

/**
 *
 * @author Mat
 */
public class gDisplay extends Display {

    public JSearchPanel search;
	public final ZoomToFitControl zoom = new ZoomToFitControl();
    
    public gDisplay(Visualization vis) {
        super(vis);
		
		zoom.setZoomOverItem(true);
		
        setItemSorter(new TreeDepthItemSorter());
        addControlListener(new DragControl());
        addControlListener( zoom );
        addControlListener(new WheelZoomControl());
        addControlListener(new PanControl());
        addControlListener(new FocusControl(2, gconst.FILTER));
        addControlListener(new HoverActionControl(gconst.REPAINT));
		addControlListener(new ToggleControl(gconst.LOCK, gconst.NODES));
        
        // filter graph and perform layout
//        m_vis.run(gconst.FILTER);
        
        // maintain a set of items that should be interpolated linearly
        // this isn't absolutely necessary, but makes the animations nicer
        // the PolarLocationAnimator should read this set and act accordingly
		
        m_vis.addFocusGroup(gconst.LINEAR, new DefaultTupleSet());
		vis.getGroup(Visualization.FOCUS_ITEMS).addTupleSetListener((TupleSet t, Tuple[] add, Tuple[] rem) -> {
			TupleSet linearInterp = vis.getGroup(gconst.LINEAR);
			if ( add.length < 1 ) return; linearInterp.clear();
			for ( Object n : add  ) {
				if( n instanceof prefuse.data.Node ) {
					Node n1= ((Node)n).getParent();
					linearInterp.addTuple(n1);
				}
			}
		});
        
        SearchTupleSet search2 = new PrefixSearchTupleSet();
        m_vis.addFocusGroup(Visualization.SEARCH_ITEMS, search2);
        search2.addTupleSetListener((TupleSet t, Tuple[] add, Tuple[] rem) -> {
			m_vis.cancel(gconst.ANIM_COLOR);
			m_vis.run(gconst.RECOLOR);
			m_vis.run(gconst.ANIM_COLOR);
		});
    }
    
	public JPanel getPanel(Component parent) {
        // create a search panel for the tree map
		SearchQueryBinding sq = new SearchQueryBinding(
            (Table)m_vis.getGroup(gconst.NODES),
			gconst.LABEL,
            (SearchTupleSet)m_vis.getGroup(Visualization.SEARCH_ITEMS)
		);
		
        search = sq.createSearchPanel(true);
        search.setBorder(BorderFactory.createEmptyBorder(5,5,4,0));
        search.setShowResultCount(true);
        search.setFont(gconst.FONT_SM);
		search.setShowCancel(false);
		search.setBackground(UIManager.getColor ( "Panel.background" ));
		search.setLabelText("");
        
        final JFastLabel title = new JFastLabel("                 ");
        title.setPreferredSize(new Dimension(350, 20));
        title.setVerticalAlignment(SwingConstants.BOTTOM);
        title.setBorder(BorderFactory.createEmptyBorder(3,0,0,0));
        title.setFont(gconst.FONT_MD);
        
        addControlListener(new ControlAdapter() {
			
			void update(VisualItem item) {
				if( item.isInGroup(gconst.EDGES) ) return;
				try {
					String s = item.getString(gconst.LABEL);
					s += "(".concat( item.getString(gconst.TYPE) ) + ")";
					if( item.isHighlighted() )
						s+= " SELECTED";
                    title.setText(s);
				} catch( Exception ex ) {}
			}
			
			@Override
			public void itemClicked(VisualItem item, MouseEvent e) {
				update(item);
			}
			
			@Override
            public void itemEntered(VisualItem item, MouseEvent e) {
				update(item);
            }
			
			@Override
            public void itemExited(VisualItem item, MouseEvent e) {
                title.setText(null);
            }
        });
        
        Box box = new Box(BoxLayout.X_AXIS);
        box.add(Box.createHorizontalStrut(10));
        box.add(title);
        box.add(Box.createHorizontalGlue());
        box.add(search);
        box.add(Box.createHorizontalStrut(3));
//		box.setBackground(new Color(0, 57, 43));
        
        JPanel panel = new JPanel(new BorderLayout());
        panel.add(this, BorderLayout.CENTER);
        panel.add(box, BorderLayout.SOUTH);
        
        Color BACKGROUND = gconst.COLOR_BG;
        Color FOREGROUND = Color.DARK_GRAY;
        UILib.setColor(this, BACKGROUND, FOREGROUND);
		
		Display self = this;
		
		SwingUtilities.invokeLater(()->{
			self.animatePanTo(new Point(-140,-140), 1000);
		});

        return panel;
	}
    
}