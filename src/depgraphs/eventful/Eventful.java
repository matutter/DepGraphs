/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package depgraphs.eventful;

import java.util.HashMap;
import java.util.HashSet;
import java.util.function.BiConsumer;

/**
 *
 * @author Mat
 */
public class Eventful {
	HashMap<String, HashSet< BiConsumer<Object, DgEvent > > > events;
	
	protected Eventful() {
		events = new HashMap<>();
	}
	
	public Eventful register( String evName ) {
		if( !events.containsKey(evName) ) {
			events.put(evName, new HashSet<>() );
//			System.out.println( "Registered " + evName );
		}
		return this;
	}
	
	public void fire( String evName, Object self, Object data ) {
		if( events.containsKey(evName) )
			events.get(evName).forEach(( cb )->{
				cb.accept(self, new DgEvent( evName, self, data ) );
			});
	}
	
	public Eventful on(String evName, BiConsumer callback) {
		if( events.containsKey(evName) )
			events.get(evName).add(callback);
		return this;
	}
	
}
