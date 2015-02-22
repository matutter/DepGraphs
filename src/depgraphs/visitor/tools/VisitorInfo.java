/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package depgraphs.visitor.tools;

import java.util.Stack;

/**
 *
 * @author Mat
 */
public class VisitorInfo {
	
	static 
	
	public String name;
	public Stack<String> children;
	public VisitorInfo() {
		children = new Stack<>();
	}
	public void set(String id) {
		this.name = id;
	}
	public void push(String child) {
		this.children.push(child);
	}
}
