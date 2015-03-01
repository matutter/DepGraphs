/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package depgraphs.visitor;

import depgraphs.env;
import depgraphs.eventful.EventAdapter;
import java.util.Arrays;
import lang.JavaDirectiveBaseVisitor;
import lang.JavaDirectiveParser;

/**
 *
 * @author Mat
 */
public class JavaDirectiveVisitor extends JavaDirectiveBaseVisitor {

	EventAdapter adapter;
	String tail;
	
	public void useAdapter( EventAdapter adapter ) {
		this.adapter = adapter;
	}
	
	@Override
	public Object visitL_target(JavaDirectiveParser.L_targetContext ctx) {
		String s = ctx.getParent().getChild(1).getText();
		String[] ss = s.split("\\.");
		if( ss.length > 0 ) {
			switch( ctx.getParent().getRuleIndex() ) {
				case JavaDirectiveParser.RULE_l_package:

					adapter.getGraph().addChain( ss );
					this.tail = ss[ ss.length - 1 ];
					
				break;
				case JavaDirectiveParser.RULE_l_directive:

					adapter.getGraph().addChain(  ss );
					adapter.getGraph().connect( tail , ss[0] );

				break;
			}
		}
		return super.visitL_target(ctx);
	}
	
}
