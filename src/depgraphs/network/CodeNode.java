/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package depgraphs.network;

import java.util.Stack;

/**
 *
 * @author Mat
 */
public class CodeNode {
	Integer id;
	Stack<Integer> children;
	public CodeNode() {
		children = new Stack<>();
	}
	public void set(Integer id) {
		this.id = id;
	}
	public void push(Integer child) {
		this.children.push(child);
	}
}
