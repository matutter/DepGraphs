/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package depgraphs.visitor;

import depgraphs.network.NetworkBuilder;
import depgraphs.visitors.tools.VisitorNode;
import lang.JavaDirectiveBaseVisitor;
import lang.JavaDirectiveParser;

/**
 *
 * @author Mat
 */
public class JavaDirectiveVisitor extends JavaDirectiveBaseVisitor {

	private VisitorNode node;
	
	public JavaDirectiveVisitor(VisitorNode node) {
		super();
		this.node = node;
	}
	
	@Override
	public Object visitL_package(JavaDirectiveParser.L_packageContext ctx) {
		return super.visitL_package(ctx); //To change body of generated methods, choose Tools | Templates.
	}
	
	@Override
	public Object visitL_target(JavaDirectiveParser.L_targetContext ctx) {
		switch( ctx.getParent().getRuleIndex() ) {
			case JavaDirectiveParser.RULE_l_package:
				node.set( ctx.getParent().getChild(1).getText() );
			break;
			case JavaDirectiveParser.RULE_l_directive:
				node.push( ctx.getParent().getChild(1).getText() );
			break;
		}
		return super.visitL_target(ctx); //To change body of generated methods, choose Tools | Templates.
	}
	
}
