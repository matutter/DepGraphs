/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package depgraphs.ui.style;

/**
 *
 * @author Mat
 */
public class css {
public static String Default = ""
				+ "graph {"
				+ "		fill-color: #DDD, #EEE; fill-mode: gradient-diagonal2;"
				//+ "		fill-color: #FEFEFE;"
				//+ "		padding: 60px;"
				+ "}"
				+ "node {"
//				+ "		size-mode: fit;"
//				+ "		shape: rounded-box;"
//				+ "		stroke-mode: plain;"
//				+ "		padding: 8px, 1px; "
//				+ "		fill-color: #7a7a7a;"
				+ "		text-alignment: center;"
				+ "		text-style: bold;"
				+ "		text-color: #222;"
//				+ "		shape: freeplane;"
				+ "		fill-mode: none;"
//				+ "		size: 20px, 20px;"
//				+ "		text-alignment: above;"
//				+ "		stroke-mode: plain;"
//				+ "		stroke-width: 6px;"
//				+ "		stroke-color: #585;"
//				+ "		text-padding: 5px, 1px;"
//				+ "		text-background-mode: rounded-box;"
//				+ "		text-background-color: #333;"
				+ "}"
				+ "node:clicked {"
				+ "		fill-color: #1659d2;"
				//+ "		text-background-color: #1659d2;"
				+ "}"
				+ "edge {"
//				+ "		arrow-shape: circle;"
//				+ "		arrow-size: 8px;"
//				+ "		shape: blob;"
				+ "		fill-color: #7a7a7a;"
				+ "}";

// thank for the colors southpaws @ http://www.colourlovers.com/palette/1585402/Glowing_Night_Sky
public static String NightSky = ""
		+ "graph {"
		+ "		fill-color: #0D2321, #0B464C;"
		+ "		fill-mode: gradient-diagonal2;"
		+ "		padding: 60px;"
		+ "}"
		+ "node {"
		+ "		size-mode: fit;"
		+ "		text-offset: 0px, 3px;"
		+ "		size: 10px, 15px;"
		+ "		shape: rounded-box;"
		+ "		stroke-mode: plain;"
		+ "		padding: 8px, 4px; "
		+ "		text-alignment: center;"
		+ "		text-style: bold;"
		+ "		stroke-color: #16816D;"
		//+ "		fill-color: #C3FFD4;"
		+ "		text-color: #16816D;"
		+ "}"
		+ "node:clicked {"
		+ "		fill-color: #15C585;"
		+ "}"
		+ "edge {"
		+ "		shape: angle; arrow-shape: arrow; size: 1.1px;"
		//+ "		shape: cubic-curve;"
		+ "		fill-color: #15C585;"
		+ "}";

}
