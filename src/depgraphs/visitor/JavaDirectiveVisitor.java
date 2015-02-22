/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package depgraphs.visitor;

import depgraphs.network.ReferenceMap;
import lang.JavaDirectiveBaseVisitor;
import lang.JavaDirectiveParser;

/**
 *
 * @author Mat
 */
public class JavaDirectiveVisitor extends JavaDirectiveBaseVisitor {

	private final ReferenceMap ref;
	private Integer groupId;
	
	public JavaDirectiveVisitor(ReferenceMap ref) {
		super();
		this.ref = ref;
	}
	
	@Override
	public Object visitL_package(JavaDirectiveParser.L_packageContext ctx) {
		return super.visitL_package(ctx); //To change body of generated methods, choose Tools | Templates.
	}
	
	@Override
	public Object visitL_target(JavaDirectiveParser.L_targetContext ctx) {
		switch( ctx.getParent().getRuleIndex() ) {
			case JavaDirectiveParser.RULE_l_package:
				groupId = ref.updateGroup(ctx.getParent().getChild(1).getText());
			break;
			case JavaDirectiveParser.RULE_l_directive:
				ref.addMember(groupId, ctx.getParent().getChild(1).getText());
			break;
		}
		return super.visitL_target(ctx); //To change body of generated methods, choose Tools | Templates.
	}
	
}
