// Generated from Java.g4 by ANTLR 4.2

	package lang;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link JavaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface JavaVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link JavaParser#classMemberDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassMemberDeclaration(@NotNull JavaParser.ClassMemberDeclarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#statementNoShortIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementNoShortIf(@NotNull JavaParser.StatementNoShortIfContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#annotationTypeElementDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeElementDeclaration(@NotNull JavaParser.AnnotationTypeElementDeclarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#methodInvocation_lf_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodInvocation_lf_primary(@NotNull JavaParser.MethodInvocation_lf_primaryContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary(@NotNull JavaParser.PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#annotationTypeBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeBody(@NotNull JavaParser.AnnotationTypeBodyContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#constantModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantModifier(@NotNull JavaParser.ConstantModifierContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#lambdaBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaBody(@NotNull JavaParser.LambdaBodyContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#argumentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentList(@NotNull JavaParser.ArgumentListContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBodyDeclaration(@NotNull JavaParser.ClassBodyDeclarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#classInstanceCreationExpression_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassInstanceCreationExpression_lfno_primary(@NotNull JavaParser.ClassInstanceCreationExpression_lfno_primaryContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary(@NotNull JavaParser.PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#unaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpression(@NotNull JavaParser.UnaryExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#classType_lfno_classOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassType_lfno_classOrInterfaceType(@NotNull JavaParser.ClassType_lfno_classOrInterfaceTypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#arrayType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayType(@NotNull JavaParser.ArrayTypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#simpleTypeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleTypeName(@NotNull JavaParser.SimpleTypeNameContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#expressionName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionName(@NotNull JavaParser.ExpressionNameContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#statementWithoutTrailingSubstatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementWithoutTrailingSubstatement(@NotNull JavaParser.StatementWithoutTrailingSubstatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#constructorDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorDeclarator(@NotNull JavaParser.ConstructorDeclaratorContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#assertStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssertStatement(@NotNull JavaParser.AssertStatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#arrayCreationExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayCreationExpression(@NotNull JavaParser.ArrayCreationExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#unannArrayType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannArrayType(@NotNull JavaParser.UnannArrayTypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaratorId(@NotNull JavaParser.VariableDeclaratorIdContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#tryWithResourcesStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTryWithResourcesStatement(@NotNull JavaParser.TryWithResourcesStatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#typeArguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArguments(@NotNull JavaParser.TypeArgumentsContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#exceptionType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExceptionType(@NotNull JavaParser.ExceptionTypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#exceptionTypeList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExceptionTypeList(@NotNull JavaParser.ExceptionTypeListContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#additiveExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveExpression(@NotNull JavaParser.AdditiveExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#relationalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalExpression(@NotNull JavaParser.RelationalExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#referenceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReferenceType(@NotNull JavaParser.ReferenceTypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayAccess_lf_primary(@NotNull JavaParser.ArrayAccess_lf_primaryContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#inferredFormalParameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInferredFormalParameterList(@NotNull JavaParser.InferredFormalParameterListContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(@NotNull JavaParser.ReturnStatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#typeImportOnDemandDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeImportOnDemandDeclaration(@NotNull JavaParser.TypeImportOnDemandDeclarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#typeParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParameters(@NotNull JavaParser.TypeParametersContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#lastFormalParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLastFormalParameter(@NotNull JavaParser.LastFormalParameterContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(@NotNull JavaParser.LiteralContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#result}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResult(@NotNull JavaParser.ResultContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#fieldAccess_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldAccess_lfno_primary(@NotNull JavaParser.FieldAccess_lfno_primaryContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#variableDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarator(@NotNull JavaParser.VariableDeclaratorContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#finally_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFinally_(@NotNull JavaParser.Finally_Context ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#classBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBody(@NotNull JavaParser.ClassBodyContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#unannInterfaceType_lfno_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannInterfaceType_lfno_unannClassOrInterfaceType(@NotNull JavaParser.UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#enumDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumDeclaration(@NotNull JavaParser.EnumDeclarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#constantDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantDeclaration(@NotNull JavaParser.ConstantDeclarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#postfixExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostfixExpression(@NotNull JavaParser.PostfixExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#annotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotation(@NotNull JavaParser.AnnotationContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#variableInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableInitializer(@NotNull JavaParser.VariableInitializerContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#staticImportOnDemandDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStaticImportOnDemandDeclaration(@NotNull JavaParser.StaticImportOnDemandDeclarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(@NotNull JavaParser.ExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#throwStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThrowStatement(@NotNull JavaParser.ThrowStatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#methodInvocation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodInvocation(@NotNull JavaParser.MethodInvocationContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#singleStaticImportDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleStaticImportDeclaration(@NotNull JavaParser.SingleStaticImportDeclarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#lambdaParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaParameters(@NotNull JavaParser.LambdaParametersContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#conditionalAndExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalAndExpression(@NotNull JavaParser.ConditionalAndExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicativeExpression(@NotNull JavaParser.MultiplicativeExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#packageModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackageModifier(@NotNull JavaParser.PackageModifierContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorDeclaration(@NotNull JavaParser.ConstructorDeclarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#primaryNoNewArray_lfno_arrayAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lfno_arrayAccess(@NotNull JavaParser.PrimaryNoNewArray_lfno_arrayAccessContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#unannTypeVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannTypeVariable(@NotNull JavaParser.UnannTypeVariableContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#normalInterfaceDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormalInterfaceDeclaration(@NotNull JavaParser.NormalInterfaceDeclarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#interfaceType_lfno_classOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceType_lfno_classOrInterfaceType(@NotNull JavaParser.InterfaceType_lfno_classOrInterfaceTypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#constructorModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorModifier(@NotNull JavaParser.ConstructorModifierContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#enumConstantName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumConstantName(@NotNull JavaParser.EnumConstantNameContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#classInstanceCreationExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassInstanceCreationExpression(@NotNull JavaParser.ClassInstanceCreationExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#methodDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDeclarator(@NotNull JavaParser.MethodDeclaratorContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#annotationTypeMemberDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeMemberDeclaration(@NotNull JavaParser.AnnotationTypeMemberDeclarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#preDecrementExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPreDecrementExpression(@NotNull JavaParser.PreDecrementExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#variableInitializerList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableInitializerList(@NotNull JavaParser.VariableInitializerListContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#extendsInterfaces}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtendsInterfaces(@NotNull JavaParser.ExtendsInterfacesContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#elementValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValue(@NotNull JavaParser.ElementValueContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#arrayInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayInitializer(@NotNull JavaParser.ArrayInitializerContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#arrayAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayAccess(@NotNull JavaParser.ArrayAccessContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#methodModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodModifier(@NotNull JavaParser.MethodModifierContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#unannClassType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannClassType(@NotNull JavaParser.UnannClassTypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#lambdaExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaExpression(@NotNull JavaParser.LambdaExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#assignmentExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentExpression(@NotNull JavaParser.AssignmentExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#typeParameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParameterList(@NotNull JavaParser.TypeParameterListContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#normalClassDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormalClassDeclaration(@NotNull JavaParser.NormalClassDeclarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#formalParameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameterList(@NotNull JavaParser.FormalParameterListContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#enhancedForStatementNoShortIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnhancedForStatementNoShortIf(@NotNull JavaParser.EnhancedForStatementNoShortIfContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#annotationTypeDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeDeclaration(@NotNull JavaParser.AnnotationTypeDeclarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#compilationUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompilationUnit(@NotNull JavaParser.CompilationUnitContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#wildcardBounds}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWildcardBounds(@NotNull JavaParser.WildcardBoundsContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#primaryNoNewArray_lf_arrayAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lf_arrayAccess(@NotNull JavaParser.PrimaryNoNewArray_lf_arrayAccessContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#enhancedForStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnhancedForStatement(@NotNull JavaParser.EnhancedForStatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#switchBlockStatementGroup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchBlockStatementGroup(@NotNull JavaParser.SwitchBlockStatementGroupContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#typeVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeVariable(@NotNull JavaParser.TypeVariableContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#typeParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParameter(@NotNull JavaParser.TypeParameterContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#methodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDeclaration(@NotNull JavaParser.MethodDeclarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#interfaceBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceBody(@NotNull JavaParser.InterfaceBodyContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#methodBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodBody(@NotNull JavaParser.MethodBodyContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#dims}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDims(@NotNull JavaParser.DimsContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#typeArgument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArgument(@NotNull JavaParser.TypeArgumentContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#unannPrimitiveType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannPrimitiveType(@NotNull JavaParser.UnannPrimitiveTypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#explicitConstructorInvocation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplicitConstructorInvocation(@NotNull JavaParser.ExplicitConstructorInvocationContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#enumBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumBody(@NotNull JavaParser.EnumBodyContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#additionalBound}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditionalBound(@NotNull JavaParser.AdditionalBoundContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#primaryNoNewArray_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lfno_primary(@NotNull JavaParser.PrimaryNoNewArray_lfno_primaryContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannClassOrInterfaceType(@NotNull JavaParser.UnannClassOrInterfaceTypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#ifThenStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfThenStatement(@NotNull JavaParser.IfThenStatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#postDecrementExpression_lf_postfixExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostDecrementExpression_lf_postfixExpression(@NotNull JavaParser.PostDecrementExpression_lf_postfixExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#interfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceType(@NotNull JavaParser.InterfaceTypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#methodReference_lf_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodReference_lf_primary(@NotNull JavaParser.MethodReference_lf_primaryContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#andExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExpression(@NotNull JavaParser.AndExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#enumConstantModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumConstantModifier(@NotNull JavaParser.EnumConstantModifierContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#unannClassType_lfno_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannClassType_lfno_unannClassOrInterfaceType(@NotNull JavaParser.UnannClassType_lfno_unannClassOrInterfaceTypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(@NotNull JavaParser.StatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#fieldModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldModifier(@NotNull JavaParser.FieldModifierContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#markerAnnotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMarkerAnnotation(@NotNull JavaParser.MarkerAnnotationContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#resourceList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResourceList(@NotNull JavaParser.ResourceListContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayAccess_lfno_primary(@NotNull JavaParser.ArrayAccess_lfno_primaryContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#staticInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStaticInitializer(@NotNull JavaParser.StaticInitializerContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#conditionalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalExpression(@NotNull JavaParser.ConditionalExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldDeclaration(@NotNull JavaParser.FieldDeclarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#leftHandSide}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeftHandSide(@NotNull JavaParser.LeftHandSideContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#basicForStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBasicForStatement(@NotNull JavaParser.BasicForStatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(@NotNull JavaParser.WhileStatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#packageDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackageDeclaration(@NotNull JavaParser.PackageDeclarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalVariableDeclaration(@NotNull JavaParser.LocalVariableDeclarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#superinterfaces}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuperinterfaces(@NotNull JavaParser.SuperinterfacesContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceMemberDeclaration(@NotNull JavaParser.InterfaceMemberDeclarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#classInstanceCreationExpression_lf_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassInstanceCreationExpression_lf_primary(@NotNull JavaParser.ClassInstanceCreationExpression_lf_primaryContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#switchBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchBlock(@NotNull JavaParser.SwitchBlockContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#forInit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForInit(@NotNull JavaParser.ForInitContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#blockStatements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStatements(@NotNull JavaParser.BlockStatementsContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#formalParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameters(@NotNull JavaParser.FormalParametersContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#typeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArgumentsOrDiamond(@NotNull JavaParser.TypeArgumentsOrDiamondContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary(@NotNull JavaParser.PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#defaultValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefaultValue(@NotNull JavaParser.DefaultValueContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(@NotNull JavaParser.TypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#elementValuePairList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValuePairList(@NotNull JavaParser.ElementValuePairListContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#synchronizedStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSynchronizedStatement(@NotNull JavaParser.SynchronizedStatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#unannClassType_lf_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannClassType_lf_unannClassOrInterfaceType(@NotNull JavaParser.UnannClassType_lf_unannClassOrInterfaceTypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#superclass}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuperclass(@NotNull JavaParser.SuperclassContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(@NotNull JavaParser.BlockContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#expressionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionStatement(@NotNull JavaParser.ExpressionStatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#preIncrementExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPreIncrementExpression(@NotNull JavaParser.PreIncrementExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#enumBodyDeclarations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumBodyDeclarations(@NotNull JavaParser.EnumBodyDeclarationsContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#dimExprs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDimExprs(@NotNull JavaParser.DimExprsContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#forUpdate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForUpdate(@NotNull JavaParser.ForUpdateContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#emptyStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmptyStatement(@NotNull JavaParser.EmptyStatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#primaryNoNewArray_lf_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lf_primary(@NotNull JavaParser.PrimaryNoNewArray_lf_primaryContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#annotationTypeElementModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeElementModifier(@NotNull JavaParser.AnnotationTypeElementModifierContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#shiftExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShiftExpression(@NotNull JavaParser.ShiftExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#fieldAccess_lf_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldAccess_lf_primary(@NotNull JavaParser.FieldAccess_lf_primaryContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#instanceInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstanceInitializer(@NotNull JavaParser.InstanceInitializerContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#unannType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannType(@NotNull JavaParser.UnannTypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#integralType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegralType(@NotNull JavaParser.IntegralTypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#postIncrementExpression_lf_postfixExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostIncrementExpression_lf_postfixExpression(@NotNull JavaParser.PostIncrementExpression_lf_postfixExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassOrInterfaceType(@NotNull JavaParser.ClassOrInterfaceTypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#equalityExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualityExpression(@NotNull JavaParser.EqualityExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#normalAnnotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormalAnnotation(@NotNull JavaParser.NormalAnnotationContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#typeBound}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeBound(@NotNull JavaParser.TypeBoundContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary(@NotNull JavaParser.PrimaryContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#classModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassModifier(@NotNull JavaParser.ClassModifierContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#fieldAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldAccess(@NotNull JavaParser.FieldAccessContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#typeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeName(@NotNull JavaParser.TypeNameContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#constructorBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorBody(@NotNull JavaParser.ConstructorBodyContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#catchClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatchClause(@NotNull JavaParser.CatchClauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary(@NotNull JavaParser.PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#labeledStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabeledStatement(@NotNull JavaParser.LabeledStatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#switchLabels}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchLabels(@NotNull JavaParser.SwitchLabelsContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#formalParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameter(@NotNull JavaParser.FormalParameterContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#interfaceType_lf_classOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceType_lf_classOrInterfaceType(@NotNull JavaParser.InterfaceType_lf_classOrInterfaceTypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#singleTypeImportDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleTypeImportDeclaration(@NotNull JavaParser.SingleTypeImportDeclarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#singleElementAnnotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleElementAnnotation(@NotNull JavaParser.SingleElementAnnotationContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#elementValueArrayInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValueArrayInitializer(@NotNull JavaParser.ElementValueArrayInitializerContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#constantExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantExpression(@NotNull JavaParser.ConstantExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#forStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatement(@NotNull JavaParser.ForStatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#typeArgumentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArgumentList(@NotNull JavaParser.TypeArgumentListContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#postDecrementExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostDecrementExpression(@NotNull JavaParser.PostDecrementExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#receiverParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReceiverParameter(@NotNull JavaParser.ReceiverParameterContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#whileStatementNoShortIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatementNoShortIf(@NotNull JavaParser.WhileStatementNoShortIfContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#enumConstantList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumConstantList(@NotNull JavaParser.EnumConstantListContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#doStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoStatement(@NotNull JavaParser.DoStatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#catchType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatchType(@NotNull JavaParser.CatchTypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#forStatementNoShortIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatementNoShortIf(@NotNull JavaParser.ForStatementNoShortIfContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#ifThenElseStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfThenElseStatement(@NotNull JavaParser.IfThenElseStatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#assignmentOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentOperator(@NotNull JavaParser.AssignmentOperatorContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#labeledStatementNoShortIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabeledStatementNoShortIf(@NotNull JavaParser.LabeledStatementNoShortIfContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#catches}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatches(@NotNull JavaParser.CatchesContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#methodReference_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodReference_lfno_primary(@NotNull JavaParser.MethodReference_lfno_primaryContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#variableDeclaratorList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaratorList(@NotNull JavaParser.VariableDeclaratorListContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#variableModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableModifier(@NotNull JavaParser.VariableModifierContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#castExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCastExpression(@NotNull JavaParser.CastExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#conditionalOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalOrExpression(@NotNull JavaParser.ConditionalOrExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#typeParameterModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParameterModifier(@NotNull JavaParser.TypeParameterModifierContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#elementValuePair}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValuePair(@NotNull JavaParser.ElementValuePairContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#floatingPointType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatingPointType(@NotNull JavaParser.FloatingPointTypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#dimExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDimExpr(@NotNull JavaParser.DimExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#unannInterfaceType_lf_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannInterfaceType_lf_unannClassOrInterfaceType(@NotNull JavaParser.UnannInterfaceType_lf_unannClassOrInterfaceTypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#resource}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResource(@NotNull JavaParser.ResourceContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInclusiveOrExpression(@NotNull JavaParser.InclusiveOrExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#interfaceMethodModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceMethodModifier(@NotNull JavaParser.InterfaceMethodModifierContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#resourceSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResourceSpecification(@NotNull JavaParser.ResourceSpecificationContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#interfaceTypeList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceTypeList(@NotNull JavaParser.InterfaceTypeListContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#ifThenElseStatementNoShortIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfThenElseStatementNoShortIf(@NotNull JavaParser.IfThenElseStatementNoShortIfContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#unannInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannInterfaceType(@NotNull JavaParser.UnannInterfaceTypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#interfaceModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceModifier(@NotNull JavaParser.InterfaceModifierContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExclusiveOrExpression(@NotNull JavaParser.ExclusiveOrExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#classType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassType(@NotNull JavaParser.ClassTypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#postIncrementExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostIncrementExpression(@NotNull JavaParser.PostIncrementExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#tryStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTryStatement(@NotNull JavaParser.TryStatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#elementValueList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValueList(@NotNull JavaParser.ElementValueListContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#basicForStatementNoShortIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBasicForStatementNoShortIf(@NotNull JavaParser.BasicForStatementNoShortIfContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#typeDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeDeclaration(@NotNull JavaParser.TypeDeclarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#switchStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchStatement(@NotNull JavaParser.SwitchStatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#wildcard}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWildcard(@NotNull JavaParser.WildcardContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#classDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclaration(@NotNull JavaParser.ClassDeclarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#unaryExpressionNotPlusMinus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpressionNotPlusMinus(@NotNull JavaParser.UnaryExpressionNotPlusMinusContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#unannReferenceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannReferenceType(@NotNull JavaParser.UnannReferenceTypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#methodHeader}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodHeader(@NotNull JavaParser.MethodHeaderContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#catchFormalParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatchFormalParameter(@NotNull JavaParser.CatchFormalParameterContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#enumConstant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumConstant(@NotNull JavaParser.EnumConstantContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#methodInvocation_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodInvocation_lfno_primary(@NotNull JavaParser.MethodInvocation_lfno_primaryContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#packageName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackageName(@NotNull JavaParser.PackageNameContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#importDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportDeclaration(@NotNull JavaParser.ImportDeclarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#primitiveType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiveType(@NotNull JavaParser.PrimitiveTypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceDeclaration(@NotNull JavaParser.InterfaceDeclarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#localVariableDeclarationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalVariableDeclarationStatement(@NotNull JavaParser.LocalVariableDeclarationStatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#blockStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStatement(@NotNull JavaParser.BlockStatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#classType_lf_classOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassType_lf_classOrInterfaceType(@NotNull JavaParser.ClassType_lf_classOrInterfaceTypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#packageOrTypeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackageOrTypeName(@NotNull JavaParser.PackageOrTypeNameContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(@NotNull JavaParser.AssignmentContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#methodName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodName(@NotNull JavaParser.MethodNameContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#statementExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementExpression(@NotNull JavaParser.StatementExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#breakStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreakStatement(@NotNull JavaParser.BreakStatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#ambiguousName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAmbiguousName(@NotNull JavaParser.AmbiguousNameContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#statementExpressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementExpressionList(@NotNull JavaParser.StatementExpressionListContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#interfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceMethodDeclaration(@NotNull JavaParser.InterfaceMethodDeclarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#throws_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThrows_(@NotNull JavaParser.Throws_Context ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#switchLabel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchLabel(@NotNull JavaParser.SwitchLabelContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#methodReference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodReference(@NotNull JavaParser.MethodReferenceContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#primaryNoNewArray}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray(@NotNull JavaParser.PrimaryNoNewArrayContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#numericType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumericType(@NotNull JavaParser.NumericTypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#continueStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinueStatement(@NotNull JavaParser.ContinueStatementContext ctx);
}