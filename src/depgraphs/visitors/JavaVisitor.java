/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package depgraphs.visitors;

import depgraphs.network.NetworkBuilder;
import depgraphs.network.CodeNode;
import lang.JavaDirectiveBaseVisitor;
import lang.JavaDirectiveParser;

/**
 *
 * @author Mat
 */
public class JavaVisitor extends JavaDirectiveBaseVisitor {

	private CodeNode node;
	private NetworkBuilder builder;
	
	public JavaVisitor(NetworkBuilder builder) {
		super();
		node = new CodeNode();
		this.builder = builder;
	}
	
	
	
	public void reset() {
		node = new CodeNode();
	}
	
	public CodeNode get() {
		return this.node;
	}

	@Override
	public Object visitL_package(JavaDirectiveParser.L_packageContext ctx) {
		return super.visitL_package(ctx); //To change body of generated methods, choose Tools | Templates.
	}
	
	@Override
	public Object visitL_target(JavaDirectiveParser.L_targetContext ctx) {
		switch( ctx.getParent().getRuleIndex() ) {
			case JavaDirectiveParser.RULE_l_package:
				node.set( builder.getIndex( ctx.getParent().getChild(1).getText() ) );
			break;
			case JavaDirectiveParser.RULE_l_directive:
				node.push( builder.getIndex( ctx.getParent().getChild(1).getText() ) );
			break;
		}
		return super.visitL_target(ctx); //To change body of generated methods, choose Tools | Templates.
	}
	
}
