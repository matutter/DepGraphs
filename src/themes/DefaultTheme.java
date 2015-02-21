/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package themes;


public class DefaultTheme extends Theme {
	public DefaultTheme() {
		super("Default");
		g.addAttribute(
			"ui.stylesheet", ""
		  + "node { size: 10px, 10px; }"
		  + "node:hover { fill-color:orange; }"
		  + "edge { fill-color: #AAA; }"
		  + "node.core { fill-color: red; }"
		  + "node.core { size: 14px, 14px; }"
		);
		g.addAttribute("ui.antialias");
		g.addAttribute("ui.quality");
	}
}
