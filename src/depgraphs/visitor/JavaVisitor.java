/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package depgraphs.visitor;

//import depgraphs.network.ReferenceMap;
import java.util.List;
import lang.JavaParser;
import org.antlr.v4.runtime.tree.TerminalNode;

/**
 *
 * @author Mat
 */
public class JavaVisitor extends lang.JavaBaseVisitor {
	
//	private final ReferenceMap ref;
	private Integer groupId;
	
//	public JavaVisitor(ReferenceMap ref) {
//		super();
//		this.ref = ref;
//	}

	
	@Override
	public Object visitPackageDeclaration(JavaParser.PackageDeclarationContext ctx) {
		List<TerminalNode> l = ctx.getTokens(JavaParser.Identifier);
		String s = "";
		
		for(TerminalNode t : l){
			s = s.concat(t.getText()+".");
		};
//		s =  s.substring(0, s.length()-1);
//		groupId = ref.updateGroup(s);
		
		return super.visitPackageDeclaration(ctx); //To change body of generated methods, choose Tools | Templates.
	}
	
	@Override
	public Object visitImportDeclaration(JavaParser.ImportDeclarationContext ctx) {
		List<TerminalNode> l = ctx.getTokens(JavaParser.Identifier);
		String s = ctx.getText();

//		ref.addMember(groupId, s.substring(6, s.length()-1));
		
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
