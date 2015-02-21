/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package depgraphs.visitors.tools;

import java.util.Stack;

/**
 *
 * @author Mat
 */
public class VisitorNode {
	public String id;
	public Stack<String> children;
	public VisitorNode() {
		children = new Stack<>();
	}
	public void set(String id) {
		this.id = id;
	}
	public void push(String child) {
		this.children.push(child);
	}
}
