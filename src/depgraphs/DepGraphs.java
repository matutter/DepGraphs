/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package depgraphs;

import depgraphs.network.NetworkBuilder;
import java.io.File;
import java.util.Collection;

/**
 *
 * @author Mat
 */
public class DepGraphs {
	
	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		// TODO code application logic here
		//String path = "C:\\Users\\Mat\\Documents\\NetBeansProjects\\DepGraphs\\src\\depgraphs";
		String path = "C:\\Users\\Mat\\Documents\\NetBeansProjects";

		env.log(" > starting network sequence ");
		
		Collection<File> sources = fs.getSources(path, ".java");
		NetworkBuilder builder = new NetworkBuilder();
		
		builder.consume( sources );
		
		builder.generate();
		
		
	}
	
}
