/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package depgraphs.ui.graph;

import depgraphs.data.VisualFQN;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author Mat
 */
public class gImportContext extends VisualFQN<String,List<VisualFQN>> {
	public Optional<VisualFQN<String,List<VisualFQN>>> jpackage;
	public String name;
	
	public gImportContext() {
		super();
		jpackage = Optional.empty();
	}
	
	public void setPackage( List<String> jp ) {
		jpackage = add(jp);
//		jpackage.ifPresent( p -> p.setHidden(true) );
	}
	
	@Override
	public String toString() {
		if( jpackage.isPresent() )
			return jpackage.get().fqn();
		else 
			return "Unknown Package";
	}

	
	
}
