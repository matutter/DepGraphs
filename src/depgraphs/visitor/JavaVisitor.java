/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package depgraphs.visitor;

import depgraphs.data.FQN;
import depgraphs.data.VisualFQN;
import depgraphs.ui.graph.gImportContext;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import lang.JavaParser;
import static lang.JavaParser.Identifier;
import org.antlr.v4.runtime.misc.NotNull;

/**
 *
 * @author Mat
 * @param <T>
 */
public class JavaVisitor<T> extends lang.JavaBaseVisitor<T> {
	public gImportContext consumerCtx;
	public String name;
	public List<FQN> imports;
	public VisualFQN jpackage;
		
	public JavaVisitor() {
		super();
		imports = new ArrayList<>();
	}
	
	// PACKAGE
	@Override public T visitPackageDeclaration(@NotNull JavaParser.PackageDeclarationContext ctx) {
		imports.clear();
		List<String> l = new ArrayList();
		l.addAll(ctx.getTokens(Identifier)
			.stream()
			.map(Object::toString)
			.collect(Collectors.toList())
		);
		l.add( name );
		jpackage = consumerCtx.add(l).get();
		jpackage.markTerminal();
		
		return visitChildren(ctx);
	}
	
	// IMPORTS
	@Override public T visitImportDeclaration(@NotNull JavaParser.ImportDeclarationContext ctx) {
		FQN f = consumerCtx.add( Arrays.asList(
			ctx.getChild(0)
				.getChild(1)
				.getText()
				.split("\\.")
		)).get();
		f.markTerminal();
		imports.add(f);
		return visitChildren(ctx);
	}
	
//	
//	// extra for later
//	@Override public T visitClassInstanceCreationExpression_lfno_primary(@NotNull JavaParser.ClassInstanceCreationExpression_lfno_primaryContext ctx) {
//		ctx.getTokens(Identifier).stream().map(TerminalNode::toString).forEach(col::add);
//		return visitChildren(ctx);
//	}
//
//	@Override public T visitClassType_lfno_classOrInterfaceType(@NotNull JavaParser.ClassType_lfno_classOrInterfaceTypeContext ctx) {
//		ctx.getTokens(Identifier).stream().map(TerminalNode::toString).forEach(col::add);
//		return visitChildren(ctx);
//	}
//
//	@Override public T visitSimpleTypeName(@NotNull JavaParser.SimpleTypeNameContext ctx) {
//		ctx.getTokens(Identifier).stream().map(TerminalNode::toString).forEach(col::add);
//		return visitChildren(ctx);
//	}
//
//	@Override
//	public T visitSuperclass(JavaParser.SuperclassContext ctx) {
//		col.add( ctx.stop.getText() );
//		return super.visitSuperclass(ctx); //To change body of generated methods, choose Tools | Templates.
//	}
//	
// redundant gives <Type> with angle brackets
//	@Override public T visitTypeArguments(@NotNull JavaParser.TypeArgumentsContext ctx) {
//		return visitChildren(ctx);
//	}
//
//	@Override public T visitExceptionTypeList(@NotNull JavaParser.ExceptionTypeListContext ctx) {
//		ctx.getTokens(Identifier).stream().map(TerminalNode::toString).forEach(col::add);
//		return visitChildren(ctx);
//	}
//
//	@Override public T visitReferenceType(@NotNull JavaParser.ReferenceTypeContext ctx) {
//		ctx.getTokens(Identifier).stream().map(TerminalNode::toString).forEach(col::add);
//		return visitChildren(ctx);
//	}
//



	
}
