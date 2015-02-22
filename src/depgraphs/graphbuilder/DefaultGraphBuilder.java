/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package depgraphs.graphbuilder;

import depgraphs.network.ReferenceMap;
import java.util.HashSet;


public class DefaultGraphBuilder extends GraphBuilder {
	public DefaultGraphBuilder() {
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

	@Override
	public void render() {
		if( this.ref == null ) return;
		this.display();
		
		ref.getGroups().forEach((id, set)->{
			
			this.createParentNode( id , ref.getName(id)  );
			
			set.forEach(( childId )->{
			
				this.CreateChildNode(childId, ref.getName(childId));
				
				this.createEdge(id, childId);
				
				
			});
			
		});
		
		
	
	}
}
