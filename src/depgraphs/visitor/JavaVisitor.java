/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package depgraphs.visitor;

import depgraphs.env;
import depgraphs.visitors.tools.VisitorNode;
import java.util.List;
import lang.JavaParser;
import org.antlr.v4.runtime.tree.TerminalNode;

/**
 *
 * @author Mat
 */
public class JavaVisitor extends lang.JavaBaseVisitor {
	
	private final VisitorNode node;
	
	public JavaVisitor(VisitorNode node) {
		super();
		this.node = node;
	}

	@Override
	public Object visitClassType(JavaParser.ClassTypeContext ctx) {
		//env.log( ctx.getText() );
		return super.visitClassType(ctx); //To change body of generated methods, choose Tools | Templates.
	}	
	
	
	@Override
	public Object visitPackageDeclaration(JavaParser.PackageDeclarationContext ctx) {
		List<TerminalNode> l = ctx.getTokens(JavaParser.Identifier);
		String s = "";
		//	node.set();
		
		//l = l.subList(1, l.size()-1);

		for(TerminalNode t : l){
			//env.log( t.getText() );
			s = s.concat(t.getText()+".");
		};
		
		s =  s.substring(0, s.length()-1);
		
		//env.log( s );
		
		node.set( s  );
		
		return super.visitPackageDeclaration(ctx); //To change body of generated methods, choose Tools | Templates.
	}
	
	@Override
	public Object visitImportDeclaration(JavaParser.ImportDeclarationContext ctx) {
		List<TerminalNode> l = ctx.getTokens(JavaParser.Identifier);
		String s = ctx.getText();
		//	node.set();
		
		//l = l.subList(1, l.size()-1);

		node.push( s.substring(6, s.length()-1) );

		
//		for(TerminalNode t : l){
//			s = s.concat(t.getText()+".");
//		};
//		if(s.length() > 1)
//		s =  s.substring(0, s.length()-1);
		//env.log( s );
		//node.push(s);
		
		return super.visitImportDeclaration(ctx); //To change body of generated methods, choose Tools | Templates.
	}
	
//	@Override
//	public Object visitTerminal(TerminalNode tn) {
//		switch( tn.getSymbol().getType() ) {
//			case JavaParser.Identifier:
//				//env.log( tn.getText() );
//			break;
//			default:
//				env.log( tn.getSymbol().getType() +" "+ tn.getText() );
//			break;
//		}
//		return super.visitTerminal(tn); //To change body of generated methods, choose Tools | Templates.
//	}
	
}
