/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package depgraphs.data;

import java.util.HashSet;
import java.util.List;

/**
 *
 * @author Mat
 */
public class Local {
	public static final FQN<String,HashSet<String>> storage = new FQN();
	public static void add( List<String> fqn ) {
		storage.add( fqn.iterator() ).isTerminal = true;
	}
	
}
