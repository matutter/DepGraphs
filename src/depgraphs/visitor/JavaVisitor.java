/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package depgraphs.visitor;

//import depgraphs.network.ReferenceMap;
import depgraphs.eventful.EventAdapter;
import depgraphs.scraper.Collector;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import lang.JavaParser;
import static lang.JavaParser.Identifier;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.TerminalNode;

/**
 *
 * @author Mat
 */
public class JavaVisitor<T> extends lang.JavaBaseVisitor<T> {
	Collector<String> col;
	
//	functions
//	@Override public T visitClassMemberDeclaration(@NotNull JavaParser.ClassMemberDeclarationContext ctx) {
//		return visitChildren(ctx);
//	}
	
	public JavaVisitor(String domain) {
		super();
		col = new Collector<>(Arrays.asList( domain.split("//.") ));
		System.out.println( this.col );
	}

	@Override public T visitClassInstanceCreationExpression_lfno_primary(@NotNull JavaParser.ClassInstanceCreationExpression_lfno_primaryContext ctx) {
		ctx.getTokens(Identifier).stream().map(TerminalNode::toString).forEach(col::add);
		return visitChildren(ctx);
	}

	@Override public T visitClassType_lfno_classOrInterfaceType(@NotNull JavaParser.ClassType_lfno_classOrInterfaceTypeContext ctx) {
		ctx.getTokens(Identifier).stream().map(TerminalNode::toString).forEach(col::add);
		return visitChildren(ctx);
	}

	@Override public T visitSimpleTypeName(@NotNull JavaParser.SimpleTypeNameContext ctx) {
		ctx.getTokens(Identifier).stream().map(TerminalNode::toString).forEach(col::add);
		return visitChildren(ctx);
	}

	@Override
	public T visitSuperclass(JavaParser.SuperclassContext ctx) {
		col.add( ctx.stop.getText() );
		return super.visitSuperclass(ctx); //To change body of generated methods, choose Tools | Templates.
	}
	
// redundant gives <Type> with angle brackets
//	@Override public T visitTypeArguments(@NotNull JavaParser.TypeArgumentsContext ctx) {
//		return visitChildren(ctx);
//	}

	@Override public T visitExceptionTypeList(@NotNull JavaParser.ExceptionTypeListContext ctx) {
		ctx.getTokens(Identifier).stream().map(TerminalNode::toString).forEach(col::add);
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitReferenceType(@NotNull JavaParser.ReferenceTypeContext ctx) {
		ctx.getTokens(Identifier).stream().map(TerminalNode::toString).forEach(col::add);
		return visitChildren(ctx);
	}

//	may be useful
//	@Override public T visitTypeImportOnDemandDeclaration(@NotNull JavaParser.TypeImportOnDemandDeclarationContext ctx) {
//		System.out.println( ctx.getText() );
//		return visitChildren(ctx);
//	}

//	may be useful
//	@Override public T visitTypeParameters(@NotNull JavaParser.TypeParametersContext ctx) {
//		System.out.println( ctx.getText() );
//		return visitChildren(ctx);
//	}


//	@Override public T visitLiteral(@NotNull JavaParser.LiteralContext ctx) {
//		System.out.println( ctx.getText() );
//		return visitChildren(ctx);
//	}
//	@Override public T visitPackageOrTypeName(@NotNull JavaParser.PackageOrTypeNameContext ctx) {
//		System.out.println( Arrays.asList( ctx.getText().split("\\.") ) );
//		return visitChildren(ctx);
//	}
	
	@Override public T visitResult(@NotNull JavaParser.ResultContext ctx) {
		ctx.getTokens(Identifier).stream().map(TerminalNode::toString).forEach(col::add);
		return visitChildren(ctx);
	}

//	may be useful
//	@Override public T visitVariableDeclarator(@NotNull JavaParser.VariableDeclaratorContext ctx) {
//		return visitChildren(ctx);
//	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitVariableInitializer(@NotNull JavaParser.VariableInitializerContext ctx) {
//		System.out.println( ctx.getTokens(JavaParser.CLASS));
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitStaticImportOnDemandDeclaration(@NotNull JavaParser.StaticImportOnDemandDeclarationContext ctx) { return visitChildren(ctx); }

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitExpression(@NotNull JavaParser.ExpressionContext ctx) { return visitChildren(ctx); }

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitThrowStatement(@NotNull JavaParser.ThrowStatementContext ctx) { return visitChildren(ctx); }

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitMethodInvocation(@NotNull JavaParser.MethodInvocationContext ctx) { return visitChildren(ctx); }


//	@Override public T visitSingleStaticImportDeclaration(@NotNull JavaParser.SingleStaticImportDeclarationContext ctx) {
//		System.out.println( ctx.getText() );
//		return visitChildren(ctx);
//	}


	@Override public T visitUnannClassType(@NotNull JavaParser.UnannClassTypeContext ctx) {
//		System.out.println( ctx.getText() );
		return visitChildren(ctx);
	}


	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitTypeParameter(@NotNull JavaParser.TypeParameterContext ctx) { return visitChildren(ctx); }

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitMethodDeclaration(@NotNull JavaParser.MethodDeclarationContext ctx) { return visitChildren(ctx); }

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitInterfaceBody(@NotNull JavaParser.InterfaceBodyContext ctx) { return visitChildren(ctx); }

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitMethodBody(@NotNull JavaParser.MethodBodyContext ctx) { return visitChildren(ctx); }

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitDims(@NotNull JavaParser.DimsContext ctx) { return visitChildren(ctx); }

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitTypeArgument(@NotNull JavaParser.TypeArgumentContext ctx) { return visitChildren(ctx); }


	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitExplicitConstructorInvocation(@NotNull JavaParser.ExplicitConstructorInvocationContext ctx) { return visitChildren(ctx); }

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitEnumBody(@NotNull JavaParser.EnumBodyContext ctx) { return visitChildren(ctx); }

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitAdditionalBound(@NotNull JavaParser.AdditionalBoundContext ctx) { return visitChildren(ctx); }

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitPrimaryNoNewArray_lfno_primary(@NotNull JavaParser.PrimaryNoNewArray_lfno_primaryContext ctx) { return visitChildren(ctx); }

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitUnannClassOrInterfaceType(@NotNull JavaParser.UnannClassOrInterfaceTypeContext ctx) {
		Arrays.asList( ctx.getText().split("(\\.|\\<|\\>)") ).forEach(col::add);
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitIfThenStatement(@NotNull JavaParser.IfThenStatementContext ctx) { return visitChildren(ctx); }

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitPostDecrementExpression_lf_postfixExpression(@NotNull JavaParser.PostDecrementExpression_lf_postfixExpressionContext ctx) { return visitChildren(ctx); }

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitInterfaceType(@NotNull JavaParser.InterfaceTypeContext ctx) { return visitChildren(ctx); }

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitMethodReference_lf_primary(@NotNull JavaParser.MethodReference_lf_primaryContext ctx) { return visitChildren(ctx); }

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitAndExpression(@NotNull JavaParser.AndExpressionContext ctx) { return visitChildren(ctx); }

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitEnumConstantModifier(@NotNull JavaParser.EnumConstantModifierContext ctx) { return visitChildren(ctx); }

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitUnannClassType_lfno_unannClassOrInterfaceType(@NotNull JavaParser.UnannClassType_lfno_unannClassOrInterfaceTypeContext ctx) { return visitChildren(ctx); }

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitStatement(@NotNull JavaParser.StatementContext ctx) { return visitChildren(ctx); }

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitFieldModifier(@NotNull JavaParser.FieldModifierContext ctx) { return visitChildren(ctx); }

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitMarkerAnnotation(@NotNull JavaParser.MarkerAnnotationContext ctx) { return visitChildren(ctx); }

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitResourceList(@NotNull JavaParser.ResourceListContext ctx) { return visitChildren(ctx); }

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitArrayAccess_lfno_primary(@NotNull JavaParser.ArrayAccess_lfno_primaryContext ctx) { return visitChildren(ctx); }

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitStaticInitializer(@NotNull JavaParser.StaticInitializerContext ctx) { return visitChildren(ctx); }

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitConditionalExpression(@NotNull JavaParser.ConditionalExpressionContext ctx) { return visitChildren(ctx); }

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitFieldDeclaration(@NotNull JavaParser.FieldDeclarationContext ctx) { return visitChildren(ctx); }

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitLeftHandSide(@NotNull JavaParser.LeftHandSideContext ctx) { return visitChildren(ctx); }

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitBasicForStatement(@NotNull JavaParser.BasicForStatementContext ctx) { return visitChildren(ctx); }

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitWhileStatement(@NotNull JavaParser.WhileStatementContext ctx) { return visitChildren(ctx); }

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitPackageDeclaration(@NotNull JavaParser.PackageDeclarationContext ctx) { return visitChildren(ctx); }

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitLocalVariableDeclaration(@NotNull JavaParser.LocalVariableDeclarationContext ctx) {
//		System.out.println(ctx.getChild(0).getClass() );
		return visitChildren(ctx);
	}

	@Override public T visitInstanceInitializer(@NotNull JavaParser.InstanceInitializerContext ctx) { return visitChildren(ctx); }

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
//	@Override public T visitUnannType(@NotNull JavaParser.UnannTypeContext ctx) {
////		System.out.println( ctx.getTokens(Identifier) );
//		return visitChildren(ctx);
//	}

	@Override public T visitEqualityExpression(@NotNull JavaParser.EqualityExpressionContext ctx) { return visitChildren(ctx); }

	@Override public T visitNormalAnnotation(@NotNull JavaParser.NormalAnnotationContext ctx) { return visitChildren(ctx); }

	@Override public T visitTypeBound(@NotNull JavaParser.TypeBoundContext ctx) { return visitChildren(ctx); }

	@Override public T visitPrimary(@NotNull JavaParser.PrimaryContext ctx) { return visitChildren(ctx); }

	@Override public T visitClassModifier(@NotNull JavaParser.ClassModifierContext ctx) { return visitChildren(ctx); }

	@Override public T visitFieldAccess(@NotNull JavaParser.FieldAccessContext ctx) { return visitChildren(ctx); }

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitTypeName(@NotNull JavaParser.TypeNameContext ctx) {
//		System.out.println( ctx.getText() );
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitConstructorBody(@NotNull JavaParser.ConstructorBodyContext ctx) { return visitChildren(ctx); }

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitCatchClause(@NotNull JavaParser.CatchClauseContext ctx) { return visitChildren(ctx); }

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitPrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary(@NotNull JavaParser.PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext ctx) { return visitChildren(ctx); }

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitLabeledStatement(@NotNull JavaParser.LabeledStatementContext ctx) { return visitChildren(ctx); }

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitSwitchLabels(@NotNull JavaParser.SwitchLabelsContext ctx) { return visitChildren(ctx); }

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitFormalParameter(@NotNull JavaParser.FormalParameterContext ctx) { return visitChildren(ctx); }

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitInterfaceType_lf_classOrInterfaceType(@NotNull JavaParser.InterfaceType_lf_classOrInterfaceTypeContext ctx) { return visitChildren(ctx); }

	
	@Override public T visitSingleTypeImportDeclaration(@NotNull JavaParser.SingleTypeImportDeclarationContext ctx) {
		//System.out.println( ctx.getTokens(JavaParser.PACKAGE) );
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitSingleElementAnnotation(@NotNull JavaParser.SingleElementAnnotationContext ctx) { return visitChildren(ctx); }

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitElementValueArrayInitializer(@NotNull JavaParser.ElementValueArrayInitializerContext ctx) { return visitChildren(ctx); }

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitConstantExpression(@NotNull JavaParser.ConstantExpressionContext ctx) { return visitChildren(ctx); }

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitForStatement(@NotNull JavaParser.ForStatementContext ctx) { return visitChildren(ctx); }

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitTypeArgumentList(@NotNull JavaParser.TypeArgumentListContext ctx) { return visitChildren(ctx); }

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitPostDecrementExpression(@NotNull JavaParser.PostDecrementExpressionContext ctx) { return visitChildren(ctx); }

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitReceiverParameter(@NotNull JavaParser.ReceiverParameterContext ctx) { return visitChildren(ctx); }

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitWhileStatementNoShortIf(@NotNull JavaParser.WhileStatementNoShortIfContext ctx) { return visitChildren(ctx); }

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitEnumConstantList(@NotNull JavaParser.EnumConstantListContext ctx) { return visitChildren(ctx); }

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitDoStatement(@NotNull JavaParser.DoStatementContext ctx) { return visitChildren(ctx); }

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitCatchType(@NotNull JavaParser.CatchTypeContext ctx) { return visitChildren(ctx); }

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitForStatementNoShortIf(@NotNull JavaParser.ForStatementNoShortIfContext ctx) { return visitChildren(ctx); }

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitIfThenElseStatement(@NotNull JavaParser.IfThenElseStatementContext ctx) { return visitChildren(ctx); }

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitAssignmentOperator(@NotNull JavaParser.AssignmentOperatorContext ctx) { return visitChildren(ctx); }

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitLabeledStatementNoShortIf(@NotNull JavaParser.LabeledStatementNoShortIfContext ctx) { return visitChildren(ctx); }

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitCatches(@NotNull JavaParser.CatchesContext ctx) { return visitChildren(ctx); }

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitMethodReference_lfno_primary(@NotNull JavaParser.MethodReference_lfno_primaryContext ctx) { return visitChildren(ctx); }

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitVariableDeclaratorList(@NotNull JavaParser.VariableDeclaratorListContext ctx) { return visitChildren(ctx); }

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitVariableModifier(@NotNull JavaParser.VariableModifierContext ctx) { return visitChildren(ctx); }

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitCastExpression(@NotNull JavaParser.CastExpressionContext ctx) { return visitChildren(ctx); }

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitConditionalOrExpression(@NotNull JavaParser.ConditionalOrExpressionContext ctx) { return visitChildren(ctx); }

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitTypeParameterModifier(@NotNull JavaParser.TypeParameterModifierContext ctx) { return visitChildren(ctx); }

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitElementValuePair(@NotNull JavaParser.ElementValuePairContext ctx) { return visitChildren(ctx); }

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitFloatingPointType(@NotNull JavaParser.FloatingPointTypeContext ctx) { return visitChildren(ctx); }

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitDimExpr(@NotNull JavaParser.DimExprContext ctx) { return visitChildren(ctx); }

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitUnannInterfaceType_lf_unannClassOrInterfaceType(@NotNull JavaParser.UnannInterfaceType_lf_unannClassOrInterfaceTypeContext ctx) { return visitChildren(ctx); }

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitResource(@NotNull JavaParser.ResourceContext ctx) { return visitChildren(ctx); }

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitInclusiveOrExpression(@NotNull JavaParser.InclusiveOrExpressionContext ctx) { return visitChildren(ctx); }

	@Override public T visitInterfaceMethodModifier(@NotNull JavaParser.InterfaceMethodModifierContext ctx) { return visitChildren(ctx); }

	@Override public T visitResourceSpecification(@NotNull JavaParser.ResourceSpecificationContext ctx) { return visitChildren(ctx); }

	@Override public T visitInterfaceTypeList(@NotNull JavaParser.InterfaceTypeListContext ctx) { return visitChildren(ctx); }

	@Override public T visitIfThenElseStatementNoShortIf(@NotNull JavaParser.IfThenElseStatementNoShortIfContext ctx) { return visitChildren(ctx); }

	@Override public T visitUnannInterfaceType(@NotNull JavaParser.UnannInterfaceTypeContext ctx) { return visitChildren(ctx); }

	@Override public T visitClassType(@NotNull JavaParser.ClassTypeContext ctx) { return visitChildren(ctx); }

	@Override public T visitUnannReferenceType(@NotNull JavaParser.UnannReferenceTypeContext ctx) {
//		System.out.println( ctx.getText() );
		return visitChildren(ctx);
	}

	@Override public T visitPackageName(@NotNull JavaParser.PackageNameContext ctx) {
//		System.out.println( ctx.getText() );
		return visitChildren(ctx);
	}

	@Override public T visitImportDeclaration(@NotNull JavaParser.ImportDeclarationContext ctx) {
//		System.out.println( ctx.getChild(0).getChild(1).getText() );
		return visitChildren(ctx);
	}

	@Override public T visitPrimitiveType(@NotNull JavaParser.PrimitiveTypeContext ctx) { return visitChildren(ctx); }


	@Override public T visitInterfaceDeclaration(@NotNull JavaParser.InterfaceDeclarationContext ctx) { return visitChildren(ctx); }


	@Override public T visitLocalVariableDeclarationStatement(@NotNull JavaParser.LocalVariableDeclarationStatementContext ctx) { return visitChildren(ctx); }


	@Override public T visitBlockStatement(@NotNull JavaParser.BlockStatementContext ctx) { return visitChildren(ctx); }

	
	@Override public T visitClassType_lf_classOrInterfaceType(@NotNull JavaParser.ClassType_lf_classOrInterfaceTypeContext ctx) {
		return visitChildren(ctx);
	}

	public Collector<String> collect() {
		return col;
	}
	
	
}
