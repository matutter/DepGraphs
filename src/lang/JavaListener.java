// Generated from Java.g4 by ANTLR 4.2

	package lang;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link JavaParser}.
 */
public interface JavaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link JavaParser#classMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassMemberDeclaration(@NotNull JavaParser.ClassMemberDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#classMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassMemberDeclaration(@NotNull JavaParser.ClassMemberDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaParser#statementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void enterStatementNoShortIf(@NotNull JavaParser.StatementNoShortIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#statementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void exitStatementNoShortIf(@NotNull JavaParser.StatementNoShortIfContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaParser#annotationTypeElementDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeElementDeclaration(@NotNull JavaParser.AnnotationTypeElementDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#annotationTypeElementDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeElementDeclaration(@NotNull JavaParser.AnnotationTypeElementDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaParser#methodInvocation_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterMethodInvocation_lf_primary(@NotNull JavaParser.MethodInvocation_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#methodInvocation_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitMethodInvocation_lf_primary(@NotNull JavaParser.MethodInvocation_lf_primaryContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaParser#primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary(@NotNull JavaParser.PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary(@NotNull JavaParser.PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaParser#annotationTypeBody}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeBody(@NotNull JavaParser.AnnotationTypeBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#annotationTypeBody}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeBody(@NotNull JavaParser.AnnotationTypeBodyContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaParser#constantModifier}.
	 * @param ctx the parse tree
	 */
	void enterConstantModifier(@NotNull JavaParser.ConstantModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#constantModifier}.
	 * @param ctx the parse tree
	 */
	void exitConstantModifier(@NotNull JavaParser.ConstantModifierContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaParser#lambdaBody}.
	 * @param ctx the parse tree
	 */
	void enterLambdaBody(@NotNull JavaParser.LambdaBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#lambdaBody}.
	 * @param ctx the parse tree
	 */
	void exitLambdaBody(@NotNull JavaParser.LambdaBodyContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void enterArgumentList(@NotNull JavaParser.ArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void exitArgumentList(@NotNull JavaParser.ArgumentListContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassBodyDeclaration(@NotNull JavaParser.ClassBodyDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassBodyDeclaration(@NotNull JavaParser.ClassBodyDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaParser#classInstanceCreationExpression_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterClassInstanceCreationExpression_lfno_primary(@NotNull JavaParser.ClassInstanceCreationExpression_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#classInstanceCreationExpression_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitClassInstanceCreationExpression_lfno_primary(@NotNull JavaParser.ClassInstanceCreationExpression_lfno_primaryContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaParser#primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary(@NotNull JavaParser.PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary(@NotNull JavaParser.PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpression(@NotNull JavaParser.UnaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpression(@NotNull JavaParser.UnaryExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaParser#classType_lfno_classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterClassType_lfno_classOrInterfaceType(@NotNull JavaParser.ClassType_lfno_classOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#classType_lfno_classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitClassType_lfno_classOrInterfaceType(@NotNull JavaParser.ClassType_lfno_classOrInterfaceTypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaParser#arrayType}.
	 * @param ctx the parse tree
	 */
	void enterArrayType(@NotNull JavaParser.ArrayTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#arrayType}.
	 * @param ctx the parse tree
	 */
	void exitArrayType(@NotNull JavaParser.ArrayTypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaParser#simpleTypeName}.
	 * @param ctx the parse tree
	 */
	void enterSimpleTypeName(@NotNull JavaParser.SimpleTypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#simpleTypeName}.
	 * @param ctx the parse tree
	 */
	void exitSimpleTypeName(@NotNull JavaParser.SimpleTypeNameContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaParser#expressionName}.
	 * @param ctx the parse tree
	 */
	void enterExpressionName(@NotNull JavaParser.ExpressionNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#expressionName}.
	 * @param ctx the parse tree
	 */
	void exitExpressionName(@NotNull JavaParser.ExpressionNameContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaParser#statementWithoutTrailingSubstatement}.
	 * @param ctx the parse tree
	 */
	void enterStatementWithoutTrailingSubstatement(@NotNull JavaParser.StatementWithoutTrailingSubstatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#statementWithoutTrailingSubstatement}.
	 * @param ctx the parse tree
	 */
	void exitStatementWithoutTrailingSubstatement(@NotNull JavaParser.StatementWithoutTrailingSubstatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaParser#constructorDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterConstructorDeclarator(@NotNull JavaParser.ConstructorDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#constructorDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitConstructorDeclarator(@NotNull JavaParser.ConstructorDeclaratorContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaParser#assertStatement}.
	 * @param ctx the parse tree
	 */
	void enterAssertStatement(@NotNull JavaParser.AssertStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#assertStatement}.
	 * @param ctx the parse tree
	 */
	void exitAssertStatement(@NotNull JavaParser.AssertStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaParser#arrayCreationExpression}.
	 * @param ctx the parse tree
	 */
	void enterArrayCreationExpression(@NotNull JavaParser.ArrayCreationExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#arrayCreationExpression}.
	 * @param ctx the parse tree
	 */
	void exitArrayCreationExpression(@NotNull JavaParser.ArrayCreationExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaParser#unannArrayType}.
	 * @param ctx the parse tree
	 */
	void enterUnannArrayType(@NotNull JavaParser.UnannArrayTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#unannArrayType}.
	 * @param ctx the parse tree
	 */
	void exitUnannArrayType(@NotNull JavaParser.UnannArrayTypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaratorId(@NotNull JavaParser.VariableDeclaratorIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaratorId(@NotNull JavaParser.VariableDeclaratorIdContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaParser#tryWithResourcesStatement}.
	 * @param ctx the parse tree
	 */
	void enterTryWithResourcesStatement(@NotNull JavaParser.TryWithResourcesStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#tryWithResourcesStatement}.
	 * @param ctx the parse tree
	 */
	void exitTryWithResourcesStatement(@NotNull JavaParser.TryWithResourcesStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaParser#typeArguments}.
	 * @param ctx the parse tree
	 */
	void enterTypeArguments(@NotNull JavaParser.TypeArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#typeArguments}.
	 * @param ctx the parse tree
	 */
	void exitTypeArguments(@NotNull JavaParser.TypeArgumentsContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaParser#exceptionType}.
	 * @param ctx the parse tree
	 */
	void enterExceptionType(@NotNull JavaParser.ExceptionTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#exceptionType}.
	 * @param ctx the parse tree
	 */
	void exitExceptionType(@NotNull JavaParser.ExceptionTypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaParser#exceptionTypeList}.
	 * @param ctx the parse tree
	 */
	void enterExceptionTypeList(@NotNull JavaParser.ExceptionTypeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#exceptionTypeList}.
	 * @param ctx the parse tree
	 */
	void exitExceptionTypeList(@NotNull JavaParser.ExceptionTypeListContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpression(@NotNull JavaParser.AdditiveExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpression(@NotNull JavaParser.AdditiveExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpression(@NotNull JavaParser.RelationalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpression(@NotNull JavaParser.RelationalExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaParser#referenceType}.
	 * @param ctx the parse tree
	 */
	void enterReferenceType(@NotNull JavaParser.ReferenceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#referenceType}.
	 * @param ctx the parse tree
	 */
	void exitReferenceType(@NotNull JavaParser.ReferenceTypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaParser#arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterArrayAccess_lf_primary(@NotNull JavaParser.ArrayAccess_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitArrayAccess_lf_primary(@NotNull JavaParser.ArrayAccess_lf_primaryContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaParser#inferredFormalParameterList}.
	 * @param ctx the parse tree
	 */
	void enterInferredFormalParameterList(@NotNull JavaParser.InferredFormalParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#inferredFormalParameterList}.
	 * @param ctx the parse tree
	 */
	void exitInferredFormalParameterList(@NotNull JavaParser.InferredFormalParameterListContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(@NotNull JavaParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(@NotNull JavaParser.ReturnStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaParser#typeImportOnDemandDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterTypeImportOnDemandDeclaration(@NotNull JavaParser.TypeImportOnDemandDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#typeImportOnDemandDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitTypeImportOnDemandDeclaration(@NotNull JavaParser.TypeImportOnDemandDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaParser#typeParameters}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameters(@NotNull JavaParser.TypeParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#typeParameters}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameters(@NotNull JavaParser.TypeParametersContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaParser#lastFormalParameter}.
	 * @param ctx the parse tree
	 */
	void enterLastFormalParameter(@NotNull JavaParser.LastFormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#lastFormalParameter}.
	 * @param ctx the parse tree
	 */
	void exitLastFormalParameter(@NotNull JavaParser.LastFormalParameterContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(@NotNull JavaParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(@NotNull JavaParser.LiteralContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaParser#result}.
	 * @param ctx the parse tree
	 */
	void enterResult(@NotNull JavaParser.ResultContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#result}.
	 * @param ctx the parse tree
	 */
	void exitResult(@NotNull JavaParser.ResultContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaParser#fieldAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterFieldAccess_lfno_primary(@NotNull JavaParser.FieldAccess_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#fieldAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitFieldAccess_lfno_primary(@NotNull JavaParser.FieldAccess_lfno_primaryContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarator(@NotNull JavaParser.VariableDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarator(@NotNull JavaParser.VariableDeclaratorContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaParser#finally_}.
	 * @param ctx the parse tree
	 */
	void enterFinally_(@NotNull JavaParser.Finally_Context ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#finally_}.
	 * @param ctx the parse tree
	 */
	void exitFinally_(@NotNull JavaParser.Finally_Context ctx);

	/**
	 * Enter a parse tree produced by {@link JavaParser#classBody}.
	 * @param ctx the parse tree
	 */
	void enterClassBody(@NotNull JavaParser.ClassBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#classBody}.
	 * @param ctx the parse tree
	 */
	void exitClassBody(@NotNull JavaParser.ClassBodyContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaParser#unannInterfaceType_lfno_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterUnannInterfaceType_lfno_unannClassOrInterfaceType(@NotNull JavaParser.UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#unannInterfaceType_lfno_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitUnannInterfaceType_lfno_unannClassOrInterfaceType(@NotNull JavaParser.UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaParser#enumDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterEnumDeclaration(@NotNull JavaParser.EnumDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#enumDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitEnumDeclaration(@NotNull JavaParser.EnumDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaParser#constantDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstantDeclaration(@NotNull JavaParser.ConstantDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#constantDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstantDeclaration(@NotNull JavaParser.ConstantDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostfixExpression(@NotNull JavaParser.PostfixExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostfixExpression(@NotNull JavaParser.PostfixExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaParser#annotation}.
	 * @param ctx the parse tree
	 */
	void enterAnnotation(@NotNull JavaParser.AnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#annotation}.
	 * @param ctx the parse tree
	 */
	void exitAnnotation(@NotNull JavaParser.AnnotationContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void enterVariableInitializer(@NotNull JavaParser.VariableInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void exitVariableInitializer(@NotNull JavaParser.VariableInitializerContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaParser#staticImportOnDemandDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterStaticImportOnDemandDeclaration(@NotNull JavaParser.StaticImportOnDemandDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#staticImportOnDemandDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitStaticImportOnDemandDeclaration(@NotNull JavaParser.StaticImportOnDemandDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(@NotNull JavaParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(@NotNull JavaParser.ExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaParser#throwStatement}.
	 * @param ctx the parse tree
	 */
	void enterThrowStatement(@NotNull JavaParser.ThrowStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#throwStatement}.
	 * @param ctx the parse tree
	 */
	void exitThrowStatement(@NotNull JavaParser.ThrowStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaParser#methodInvocation}.
	 * @param ctx the parse tree
	 */
	void enterMethodInvocation(@NotNull JavaParser.MethodInvocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#methodInvocation}.
	 * @param ctx the parse tree
	 */
	void exitMethodInvocation(@NotNull JavaParser.MethodInvocationContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaParser#singleStaticImportDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterSingleStaticImportDeclaration(@NotNull JavaParser.SingleStaticImportDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#singleStaticImportDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitSingleStaticImportDeclaration(@NotNull JavaParser.SingleStaticImportDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaParser#lambdaParameters}.
	 * @param ctx the parse tree
	 */
	void enterLambdaParameters(@NotNull JavaParser.LambdaParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#lambdaParameters}.
	 * @param ctx the parse tree
	 */
	void exitLambdaParameters(@NotNull JavaParser.LambdaParametersContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaParser#conditionalAndExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalAndExpression(@NotNull JavaParser.ConditionalAndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#conditionalAndExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalAndExpression(@NotNull JavaParser.ConditionalAndExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExpression(@NotNull JavaParser.MultiplicativeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExpression(@NotNull JavaParser.MultiplicativeExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaParser#packageModifier}.
	 * @param ctx the parse tree
	 */
	void enterPackageModifier(@NotNull JavaParser.PackageModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#packageModifier}.
	 * @param ctx the parse tree
	 */
	void exitPackageModifier(@NotNull JavaParser.PackageModifierContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstructorDeclaration(@NotNull JavaParser.ConstructorDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstructorDeclaration(@NotNull JavaParser.ConstructorDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaParser#primaryNoNewArray_lfno_arrayAccess}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lfno_arrayAccess(@NotNull JavaParser.PrimaryNoNewArray_lfno_arrayAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#primaryNoNewArray_lfno_arrayAccess}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lfno_arrayAccess(@NotNull JavaParser.PrimaryNoNewArray_lfno_arrayAccessContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaParser#unannTypeVariable}.
	 * @param ctx the parse tree
	 */
	void enterUnannTypeVariable(@NotNull JavaParser.UnannTypeVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#unannTypeVariable}.
	 * @param ctx the parse tree
	 */
	void exitUnannTypeVariable(@NotNull JavaParser.UnannTypeVariableContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaParser#normalInterfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterNormalInterfaceDeclaration(@NotNull JavaParser.NormalInterfaceDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#normalInterfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitNormalInterfaceDeclaration(@NotNull JavaParser.NormalInterfaceDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaParser#interfaceType_lfno_classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceType_lfno_classOrInterfaceType(@NotNull JavaParser.InterfaceType_lfno_classOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#interfaceType_lfno_classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceType_lfno_classOrInterfaceType(@NotNull JavaParser.InterfaceType_lfno_classOrInterfaceTypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaParser#constructorModifier}.
	 * @param ctx the parse tree
	 */
	void enterConstructorModifier(@NotNull JavaParser.ConstructorModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#constructorModifier}.
	 * @param ctx the parse tree
	 */
	void exitConstructorModifier(@NotNull JavaParser.ConstructorModifierContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaParser#enumConstantName}.
	 * @param ctx the parse tree
	 */
	void enterEnumConstantName(@NotNull JavaParser.EnumConstantNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#enumConstantName}.
	 * @param ctx the parse tree
	 */
	void exitEnumConstantName(@NotNull JavaParser.EnumConstantNameContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaParser#classInstanceCreationExpression}.
	 * @param ctx the parse tree
	 */
	void enterClassInstanceCreationExpression(@NotNull JavaParser.ClassInstanceCreationExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#classInstanceCreationExpression}.
	 * @param ctx the parse tree
	 */
	void exitClassInstanceCreationExpression(@NotNull JavaParser.ClassInstanceCreationExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaParser#methodDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclarator(@NotNull JavaParser.MethodDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#methodDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclarator(@NotNull JavaParser.MethodDeclaratorContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaParser#annotationTypeMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeMemberDeclaration(@NotNull JavaParser.AnnotationTypeMemberDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#annotationTypeMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeMemberDeclaration(@NotNull JavaParser.AnnotationTypeMemberDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaParser#preDecrementExpression}.
	 * @param ctx the parse tree
	 */
	void enterPreDecrementExpression(@NotNull JavaParser.PreDecrementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#preDecrementExpression}.
	 * @param ctx the parse tree
	 */
	void exitPreDecrementExpression(@NotNull JavaParser.PreDecrementExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaParser#variableInitializerList}.
	 * @param ctx the parse tree
	 */
	void enterVariableInitializerList(@NotNull JavaParser.VariableInitializerListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#variableInitializerList}.
	 * @param ctx the parse tree
	 */
	void exitVariableInitializerList(@NotNull JavaParser.VariableInitializerListContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaParser#extendsInterfaces}.
	 * @param ctx the parse tree
	 */
	void enterExtendsInterfaces(@NotNull JavaParser.ExtendsInterfacesContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#extendsInterfaces}.
	 * @param ctx the parse tree
	 */
	void exitExtendsInterfaces(@NotNull JavaParser.ExtendsInterfacesContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaParser#elementValue}.
	 * @param ctx the parse tree
	 */
	void enterElementValue(@NotNull JavaParser.ElementValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#elementValue}.
	 * @param ctx the parse tree
	 */
	void exitElementValue(@NotNull JavaParser.ElementValueContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaParser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void enterArrayInitializer(@NotNull JavaParser.ArrayInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void exitArrayInitializer(@NotNull JavaParser.ArrayInitializerContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaParser#arrayAccess}.
	 * @param ctx the parse tree
	 */
	void enterArrayAccess(@NotNull JavaParser.ArrayAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#arrayAccess}.
	 * @param ctx the parse tree
	 */
	void exitArrayAccess(@NotNull JavaParser.ArrayAccessContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaParser#methodModifier}.
	 * @param ctx the parse tree
	 */
	void enterMethodModifier(@NotNull JavaParser.MethodModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#methodModifier}.
	 * @param ctx the parse tree
	 */
	void exitMethodModifier(@NotNull JavaParser.MethodModifierContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaParser#unannClassType}.
	 * @param ctx the parse tree
	 */
	void enterUnannClassType(@NotNull JavaParser.UnannClassTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#unannClassType}.
	 * @param ctx the parse tree
	 */
	void exitUnannClassType(@NotNull JavaParser.UnannClassTypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaParser#lambdaExpression}.
	 * @param ctx the parse tree
	 */
	void enterLambdaExpression(@NotNull JavaParser.LambdaExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#lambdaExpression}.
	 * @param ctx the parse tree
	 */
	void exitLambdaExpression(@NotNull JavaParser.LambdaExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentExpression(@NotNull JavaParser.AssignmentExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentExpression(@NotNull JavaParser.AssignmentExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaParser#typeParameterList}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameterList(@NotNull JavaParser.TypeParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#typeParameterList}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameterList(@NotNull JavaParser.TypeParameterListContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaParser#normalClassDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterNormalClassDeclaration(@NotNull JavaParser.NormalClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#normalClassDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitNormalClassDeclaration(@NotNull JavaParser.NormalClassDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameterList(@NotNull JavaParser.FormalParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameterList(@NotNull JavaParser.FormalParameterListContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaParser#enhancedForStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void enterEnhancedForStatementNoShortIf(@NotNull JavaParser.EnhancedForStatementNoShortIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#enhancedForStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void exitEnhancedForStatementNoShortIf(@NotNull JavaParser.EnhancedForStatementNoShortIfContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaParser#annotationTypeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeDeclaration(@NotNull JavaParser.AnnotationTypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#annotationTypeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeDeclaration(@NotNull JavaParser.AnnotationTypeDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void enterCompilationUnit(@NotNull JavaParser.CompilationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void exitCompilationUnit(@NotNull JavaParser.CompilationUnitContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaParser#wildcardBounds}.
	 * @param ctx the parse tree
	 */
	void enterWildcardBounds(@NotNull JavaParser.WildcardBoundsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#wildcardBounds}.
	 * @param ctx the parse tree
	 */
	void exitWildcardBounds(@NotNull JavaParser.WildcardBoundsContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaParser#primaryNoNewArray_lf_arrayAccess}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lf_arrayAccess(@NotNull JavaParser.PrimaryNoNewArray_lf_arrayAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#primaryNoNewArray_lf_arrayAccess}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lf_arrayAccess(@NotNull JavaParser.PrimaryNoNewArray_lf_arrayAccessContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaParser#enhancedForStatement}.
	 * @param ctx the parse tree
	 */
	void enterEnhancedForStatement(@NotNull JavaParser.EnhancedForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#enhancedForStatement}.
	 * @param ctx the parse tree
	 */
	void exitEnhancedForStatement(@NotNull JavaParser.EnhancedForStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaParser#switchBlockStatementGroup}.
	 * @param ctx the parse tree
	 */
	void enterSwitchBlockStatementGroup(@NotNull JavaParser.SwitchBlockStatementGroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#switchBlockStatementGroup}.
	 * @param ctx the parse tree
	 */
	void exitSwitchBlockStatementGroup(@NotNull JavaParser.SwitchBlockStatementGroupContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaParser#typeVariable}.
	 * @param ctx the parse tree
	 */
	void enterTypeVariable(@NotNull JavaParser.TypeVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#typeVariable}.
	 * @param ctx the parse tree
	 */
	void exitTypeVariable(@NotNull JavaParser.TypeVariableContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaParser#typeParameter}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameter(@NotNull JavaParser.TypeParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#typeParameter}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameter(@NotNull JavaParser.TypeParameterContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(@NotNull JavaParser.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(@NotNull JavaParser.MethodDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaParser#interfaceBody}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceBody(@NotNull JavaParser.InterfaceBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#interfaceBody}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceBody(@NotNull JavaParser.InterfaceBodyContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void enterMethodBody(@NotNull JavaParser.MethodBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void exitMethodBody(@NotNull JavaParser.MethodBodyContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaParser#dims}.
	 * @param ctx the parse tree
	 */
	void enterDims(@NotNull JavaParser.DimsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#dims}.
	 * @param ctx the parse tree
	 */
	void exitDims(@NotNull JavaParser.DimsContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaParser#typeArgument}.
	 * @param ctx the parse tree
	 */
	void enterTypeArgument(@NotNull JavaParser.TypeArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#typeArgument}.
	 * @param ctx the parse tree
	 */
	void exitTypeArgument(@NotNull JavaParser.TypeArgumentContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaParser#unannPrimitiveType}.
	 * @param ctx the parse tree
	 */
	void enterUnannPrimitiveType(@NotNull JavaParser.UnannPrimitiveTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#unannPrimitiveType}.
	 * @param ctx the parse tree
	 */
	void exitUnannPrimitiveType(@NotNull JavaParser.UnannPrimitiveTypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaParser#explicitConstructorInvocation}.
	 * @param ctx the parse tree
	 */
	void enterExplicitConstructorInvocation(@NotNull JavaParser.ExplicitConstructorInvocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#explicitConstructorInvocation}.
	 * @param ctx the parse tree
	 */
	void exitExplicitConstructorInvocation(@NotNull JavaParser.ExplicitConstructorInvocationContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaParser#enumBody}.
	 * @param ctx the parse tree
	 */
	void enterEnumBody(@NotNull JavaParser.EnumBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#enumBody}.
	 * @param ctx the parse tree
	 */
	void exitEnumBody(@NotNull JavaParser.EnumBodyContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaParser#additionalBound}.
	 * @param ctx the parse tree
	 */
	void enterAdditionalBound(@NotNull JavaParser.AdditionalBoundContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#additionalBound}.
	 * @param ctx the parse tree
	 */
	void exitAdditionalBound(@NotNull JavaParser.AdditionalBoundContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaParser#primaryNoNewArray_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lfno_primary(@NotNull JavaParser.PrimaryNoNewArray_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#primaryNoNewArray_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lfno_primary(@NotNull JavaParser.PrimaryNoNewArray_lfno_primaryContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaParser#unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterUnannClassOrInterfaceType(@NotNull JavaParser.UnannClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitUnannClassOrInterfaceType(@NotNull JavaParser.UnannClassOrInterfaceTypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaParser#ifThenStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfThenStatement(@NotNull JavaParser.IfThenStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#ifThenStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfThenStatement(@NotNull JavaParser.IfThenStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaParser#postDecrementExpression_lf_postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostDecrementExpression_lf_postfixExpression(@NotNull JavaParser.PostDecrementExpression_lf_postfixExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#postDecrementExpression_lf_postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostDecrementExpression_lf_postfixExpression(@NotNull JavaParser.PostDecrementExpression_lf_postfixExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaParser#interfaceType}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceType(@NotNull JavaParser.InterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#interfaceType}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceType(@NotNull JavaParser.InterfaceTypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaParser#methodReference_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterMethodReference_lf_primary(@NotNull JavaParser.MethodReference_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#methodReference_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitMethodReference_lf_primary(@NotNull JavaParser.MethodReference_lf_primaryContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaParser#andExpression}.
	 * @param ctx the parse tree
	 */
	void enterAndExpression(@NotNull JavaParser.AndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#andExpression}.
	 * @param ctx the parse tree
	 */
	void exitAndExpression(@NotNull JavaParser.AndExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaParser#enumConstantModifier}.
	 * @param ctx the parse tree
	 */
	void enterEnumConstantModifier(@NotNull JavaParser.EnumConstantModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#enumConstantModifier}.
	 * @param ctx the parse tree
	 */
	void exitEnumConstantModifier(@NotNull JavaParser.EnumConstantModifierContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaParser#unannClassType_lfno_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterUnannClassType_lfno_unannClassOrInterfaceType(@NotNull JavaParser.UnannClassType_lfno_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#unannClassType_lfno_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitUnannClassType_lfno_unannClassOrInterfaceType(@NotNull JavaParser.UnannClassType_lfno_unannClassOrInterfaceTypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(@NotNull JavaParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(@NotNull JavaParser.StatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaParser#fieldModifier}.
	 * @param ctx the parse tree
	 */
	void enterFieldModifier(@NotNull JavaParser.FieldModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#fieldModifier}.
	 * @param ctx the parse tree
	 */
	void exitFieldModifier(@NotNull JavaParser.FieldModifierContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaParser#markerAnnotation}.
	 * @param ctx the parse tree
	 */
	void enterMarkerAnnotation(@NotNull JavaParser.MarkerAnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#markerAnnotation}.
	 * @param ctx the parse tree
	 */
	void exitMarkerAnnotation(@NotNull JavaParser.MarkerAnnotationContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaParser#resourceList}.
	 * @param ctx the parse tree
	 */
	void enterResourceList(@NotNull JavaParser.ResourceListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#resourceList}.
	 * @param ctx the parse tree
	 */
	void exitResourceList(@NotNull JavaParser.ResourceListContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaParser#arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterArrayAccess_lfno_primary(@NotNull JavaParser.ArrayAccess_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitArrayAccess_lfno_primary(@NotNull JavaParser.ArrayAccess_lfno_primaryContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaParser#staticInitializer}.
	 * @param ctx the parse tree
	 */
	void enterStaticInitializer(@NotNull JavaParser.StaticInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#staticInitializer}.
	 * @param ctx the parse tree
	 */
	void exitStaticInitializer(@NotNull JavaParser.StaticInitializerContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaParser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalExpression(@NotNull JavaParser.ConditionalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalExpression(@NotNull JavaParser.ConditionalExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFieldDeclaration(@NotNull JavaParser.FieldDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFieldDeclaration(@NotNull JavaParser.FieldDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaParser#leftHandSide}.
	 * @param ctx the parse tree
	 */
	void enterLeftHandSide(@NotNull JavaParser.LeftHandSideContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#leftHandSide}.
	 * @param ctx the parse tree
	 */
	void exitLeftHandSide(@NotNull JavaParser.LeftHandSideContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaParser#basicForStatement}.
	 * @param ctx the parse tree
	 */
	void enterBasicForStatement(@NotNull JavaParser.BasicForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#basicForStatement}.
	 * @param ctx the parse tree
	 */
	void exitBasicForStatement(@NotNull JavaParser.BasicForStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(@NotNull JavaParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(@NotNull JavaParser.WhileStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaParser#packageDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterPackageDeclaration(@NotNull JavaParser.PackageDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#packageDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitPackageDeclaration(@NotNull JavaParser.PackageDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterLocalVariableDeclaration(@NotNull JavaParser.LocalVariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitLocalVariableDeclaration(@NotNull JavaParser.LocalVariableDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaParser#superinterfaces}.
	 * @param ctx the parse tree
	 */
	void enterSuperinterfaces(@NotNull JavaParser.SuperinterfacesContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#superinterfaces}.
	 * @param ctx the parse tree
	 */
	void exitSuperinterfaces(@NotNull JavaParser.SuperinterfacesContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaParser#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMemberDeclaration(@NotNull JavaParser.InterfaceMemberDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMemberDeclaration(@NotNull JavaParser.InterfaceMemberDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaParser#classInstanceCreationExpression_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterClassInstanceCreationExpression_lf_primary(@NotNull JavaParser.ClassInstanceCreationExpression_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#classInstanceCreationExpression_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitClassInstanceCreationExpression_lf_primary(@NotNull JavaParser.ClassInstanceCreationExpression_lf_primaryContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaParser#switchBlock}.
	 * @param ctx the parse tree
	 */
	void enterSwitchBlock(@NotNull JavaParser.SwitchBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#switchBlock}.
	 * @param ctx the parse tree
	 */
	void exitSwitchBlock(@NotNull JavaParser.SwitchBlockContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaParser#forInit}.
	 * @param ctx the parse tree
	 */
	void enterForInit(@NotNull JavaParser.ForInitContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#forInit}.
	 * @param ctx the parse tree
	 */
	void exitForInit(@NotNull JavaParser.ForInitContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaParser#blockStatements}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatements(@NotNull JavaParser.BlockStatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#blockStatements}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatements(@NotNull JavaParser.BlockStatementsContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameters(@NotNull JavaParser.FormalParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameters(@NotNull JavaParser.FormalParametersContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaParser#typeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 */
	void enterTypeArgumentsOrDiamond(@NotNull JavaParser.TypeArgumentsOrDiamondContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#typeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 */
	void exitTypeArgumentsOrDiamond(@NotNull JavaParser.TypeArgumentsOrDiamondContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaParser#primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary(@NotNull JavaParser.PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary(@NotNull JavaParser.PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaParser#defaultValue}.
	 * @param ctx the parse tree
	 */
	void enterDefaultValue(@NotNull JavaParser.DefaultValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#defaultValue}.
	 * @param ctx the parse tree
	 */
	void exitDefaultValue(@NotNull JavaParser.DefaultValueContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(@NotNull JavaParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(@NotNull JavaParser.TypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaParser#elementValuePairList}.
	 * @param ctx the parse tree
	 */
	void enterElementValuePairList(@NotNull JavaParser.ElementValuePairListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#elementValuePairList}.
	 * @param ctx the parse tree
	 */
	void exitElementValuePairList(@NotNull JavaParser.ElementValuePairListContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaParser#synchronizedStatement}.
	 * @param ctx the parse tree
	 */
	void enterSynchronizedStatement(@NotNull JavaParser.SynchronizedStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#synchronizedStatement}.
	 * @param ctx the parse tree
	 */
	void exitSynchronizedStatement(@NotNull JavaParser.SynchronizedStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaParser#unannClassType_lf_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterUnannClassType_lf_unannClassOrInterfaceType(@NotNull JavaParser.UnannClassType_lf_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#unannClassType_lf_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitUnannClassType_lf_unannClassOrInterfaceType(@NotNull JavaParser.UnannClassType_lf_unannClassOrInterfaceTypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaParser#superclass}.
	 * @param ctx the parse tree
	 */
	void enterSuperclass(@NotNull JavaParser.SuperclassContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#superclass}.
	 * @param ctx the parse tree
	 */
	void exitSuperclass(@NotNull JavaParser.SuperclassContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(@NotNull JavaParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(@NotNull JavaParser.BlockContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStatement(@NotNull JavaParser.ExpressionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStatement(@NotNull JavaParser.ExpressionStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaParser#preIncrementExpression}.
	 * @param ctx the parse tree
	 */
	void enterPreIncrementExpression(@NotNull JavaParser.PreIncrementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#preIncrementExpression}.
	 * @param ctx the parse tree
	 */
	void exitPreIncrementExpression(@NotNull JavaParser.PreIncrementExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaParser#enumBodyDeclarations}.
	 * @param ctx the parse tree
	 */
	void enterEnumBodyDeclarations(@NotNull JavaParser.EnumBodyDeclarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#enumBodyDeclarations}.
	 * @param ctx the parse tree
	 */
	void exitEnumBodyDeclarations(@NotNull JavaParser.EnumBodyDeclarationsContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaParser#dimExprs}.
	 * @param ctx the parse tree
	 */
	void enterDimExprs(@NotNull JavaParser.DimExprsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#dimExprs}.
	 * @param ctx the parse tree
	 */
	void exitDimExprs(@NotNull JavaParser.DimExprsContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaParser#forUpdate}.
	 * @param ctx the parse tree
	 */
	void enterForUpdate(@NotNull JavaParser.ForUpdateContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#forUpdate}.
	 * @param ctx the parse tree
	 */
	void exitForUpdate(@NotNull JavaParser.ForUpdateContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaParser#emptyStatement}.
	 * @param ctx the parse tree
	 */
	void enterEmptyStatement(@NotNull JavaParser.EmptyStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#emptyStatement}.
	 * @param ctx the parse tree
	 */
	void exitEmptyStatement(@NotNull JavaParser.EmptyStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaParser#primaryNoNewArray_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lf_primary(@NotNull JavaParser.PrimaryNoNewArray_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#primaryNoNewArray_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lf_primary(@NotNull JavaParser.PrimaryNoNewArray_lf_primaryContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaParser#annotationTypeElementModifier}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeElementModifier(@NotNull JavaParser.AnnotationTypeElementModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#annotationTypeElementModifier}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeElementModifier(@NotNull JavaParser.AnnotationTypeElementModifierContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaParser#shiftExpression}.
	 * @param ctx the parse tree
	 */
	void enterShiftExpression(@NotNull JavaParser.ShiftExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#shiftExpression}.
	 * @param ctx the parse tree
	 */
	void exitShiftExpression(@NotNull JavaParser.ShiftExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaParser#fieldAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterFieldAccess_lf_primary(@NotNull JavaParser.FieldAccess_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#fieldAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitFieldAccess_lf_primary(@NotNull JavaParser.FieldAccess_lf_primaryContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaParser#instanceInitializer}.
	 * @param ctx the parse tree
	 */
	void enterInstanceInitializer(@NotNull JavaParser.InstanceInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#instanceInitializer}.
	 * @param ctx the parse tree
	 */
	void exitInstanceInitializer(@NotNull JavaParser.InstanceInitializerContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaParser#unannType}.
	 * @param ctx the parse tree
	 */
	void enterUnannType(@NotNull JavaParser.UnannTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#unannType}.
	 * @param ctx the parse tree
	 */
	void exitUnannType(@NotNull JavaParser.UnannTypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaParser#integralType}.
	 * @param ctx the parse tree
	 */
	void enterIntegralType(@NotNull JavaParser.IntegralTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#integralType}.
	 * @param ctx the parse tree
	 */
	void exitIntegralType(@NotNull JavaParser.IntegralTypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaParser#postIncrementExpression_lf_postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostIncrementExpression_lf_postfixExpression(@NotNull JavaParser.PostIncrementExpression_lf_postfixExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#postIncrementExpression_lf_postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostIncrementExpression_lf_postfixExpression(@NotNull JavaParser.PostIncrementExpression_lf_postfixExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaParser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterClassOrInterfaceType(@NotNull JavaParser.ClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitClassOrInterfaceType(@NotNull JavaParser.ClassOrInterfaceTypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpression(@NotNull JavaParser.EqualityExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpression(@NotNull JavaParser.EqualityExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaParser#normalAnnotation}.
	 * @param ctx the parse tree
	 */
	void enterNormalAnnotation(@NotNull JavaParser.NormalAnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#normalAnnotation}.
	 * @param ctx the parse tree
	 */
	void exitNormalAnnotation(@NotNull JavaParser.NormalAnnotationContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaParser#typeBound}.
	 * @param ctx the parse tree
	 */
	void enterTypeBound(@NotNull JavaParser.TypeBoundContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#typeBound}.
	 * @param ctx the parse tree
	 */
	void exitTypeBound(@NotNull JavaParser.TypeBoundContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(@NotNull JavaParser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(@NotNull JavaParser.PrimaryContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaParser#classModifier}.
	 * @param ctx the parse tree
	 */
	void enterClassModifier(@NotNull JavaParser.ClassModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#classModifier}.
	 * @param ctx the parse tree
	 */
	void exitClassModifier(@NotNull JavaParser.ClassModifierContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaParser#fieldAccess}.
	 * @param ctx the parse tree
	 */
	void enterFieldAccess(@NotNull JavaParser.FieldAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#fieldAccess}.
	 * @param ctx the parse tree
	 */
	void exitFieldAccess(@NotNull JavaParser.FieldAccessContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaParser#typeName}.
	 * @param ctx the parse tree
	 */
	void enterTypeName(@NotNull JavaParser.TypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#typeName}.
	 * @param ctx the parse tree
	 */
	void exitTypeName(@NotNull JavaParser.TypeNameContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaParser#constructorBody}.
	 * @param ctx the parse tree
	 */
	void enterConstructorBody(@NotNull JavaParser.ConstructorBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#constructorBody}.
	 * @param ctx the parse tree
	 */
	void exitConstructorBody(@NotNull JavaParser.ConstructorBodyContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaParser#catchClause}.
	 * @param ctx the parse tree
	 */
	void enterCatchClause(@NotNull JavaParser.CatchClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#catchClause}.
	 * @param ctx the parse tree
	 */
	void exitCatchClause(@NotNull JavaParser.CatchClauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaParser#primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary(@NotNull JavaParser.PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary(@NotNull JavaParser.PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaParser#labeledStatement}.
	 * @param ctx the parse tree
	 */
	void enterLabeledStatement(@NotNull JavaParser.LabeledStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#labeledStatement}.
	 * @param ctx the parse tree
	 */
	void exitLabeledStatement(@NotNull JavaParser.LabeledStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaParser#switchLabels}.
	 * @param ctx the parse tree
	 */
	void enterSwitchLabels(@NotNull JavaParser.SwitchLabelsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#switchLabels}.
	 * @param ctx the parse tree
	 */
	void exitSwitchLabels(@NotNull JavaParser.SwitchLabelsContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameter(@NotNull JavaParser.FormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameter(@NotNull JavaParser.FormalParameterContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaParser#interfaceType_lf_classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceType_lf_classOrInterfaceType(@NotNull JavaParser.InterfaceType_lf_classOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#interfaceType_lf_classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceType_lf_classOrInterfaceType(@NotNull JavaParser.InterfaceType_lf_classOrInterfaceTypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaParser#singleTypeImportDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterSingleTypeImportDeclaration(@NotNull JavaParser.SingleTypeImportDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#singleTypeImportDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitSingleTypeImportDeclaration(@NotNull JavaParser.SingleTypeImportDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaParser#singleElementAnnotation}.
	 * @param ctx the parse tree
	 */
	void enterSingleElementAnnotation(@NotNull JavaParser.SingleElementAnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#singleElementAnnotation}.
	 * @param ctx the parse tree
	 */
	void exitSingleElementAnnotation(@NotNull JavaParser.SingleElementAnnotationContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaParser#elementValueArrayInitializer}.
	 * @param ctx the parse tree
	 */
	void enterElementValueArrayInitializer(@NotNull JavaParser.ElementValueArrayInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#elementValueArrayInitializer}.
	 * @param ctx the parse tree
	 */
	void exitElementValueArrayInitializer(@NotNull JavaParser.ElementValueArrayInitializerContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaParser#constantExpression}.
	 * @param ctx the parse tree
	 */
	void enterConstantExpression(@NotNull JavaParser.ConstantExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#constantExpression}.
	 * @param ctx the parse tree
	 */
	void exitConstantExpression(@NotNull JavaParser.ConstantExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(@NotNull JavaParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(@NotNull JavaParser.ForStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaParser#typeArgumentList}.
	 * @param ctx the parse tree
	 */
	void enterTypeArgumentList(@NotNull JavaParser.TypeArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#typeArgumentList}.
	 * @param ctx the parse tree
	 */
	void exitTypeArgumentList(@NotNull JavaParser.TypeArgumentListContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaParser#postDecrementExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostDecrementExpression(@NotNull JavaParser.PostDecrementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#postDecrementExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostDecrementExpression(@NotNull JavaParser.PostDecrementExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaParser#receiverParameter}.
	 * @param ctx the parse tree
	 */
	void enterReceiverParameter(@NotNull JavaParser.ReceiverParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#receiverParameter}.
	 * @param ctx the parse tree
	 */
	void exitReceiverParameter(@NotNull JavaParser.ReceiverParameterContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaParser#whileStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatementNoShortIf(@NotNull JavaParser.WhileStatementNoShortIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#whileStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatementNoShortIf(@NotNull JavaParser.WhileStatementNoShortIfContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaParser#enumConstantList}.
	 * @param ctx the parse tree
	 */
	void enterEnumConstantList(@NotNull JavaParser.EnumConstantListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#enumConstantList}.
	 * @param ctx the parse tree
	 */
	void exitEnumConstantList(@NotNull JavaParser.EnumConstantListContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaParser#doStatement}.
	 * @param ctx the parse tree
	 */
	void enterDoStatement(@NotNull JavaParser.DoStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#doStatement}.
	 * @param ctx the parse tree
	 */
	void exitDoStatement(@NotNull JavaParser.DoStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaParser#catchType}.
	 * @param ctx the parse tree
	 */
	void enterCatchType(@NotNull JavaParser.CatchTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#catchType}.
	 * @param ctx the parse tree
	 */
	void exitCatchType(@NotNull JavaParser.CatchTypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaParser#forStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void enterForStatementNoShortIf(@NotNull JavaParser.ForStatementNoShortIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#forStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void exitForStatementNoShortIf(@NotNull JavaParser.ForStatementNoShortIfContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaParser#ifThenElseStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfThenElseStatement(@NotNull JavaParser.IfThenElseStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#ifThenElseStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfThenElseStatement(@NotNull JavaParser.IfThenElseStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentOperator(@NotNull JavaParser.AssignmentOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentOperator(@NotNull JavaParser.AssignmentOperatorContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaParser#labeledStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void enterLabeledStatementNoShortIf(@NotNull JavaParser.LabeledStatementNoShortIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#labeledStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void exitLabeledStatementNoShortIf(@NotNull JavaParser.LabeledStatementNoShortIfContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaParser#catches}.
	 * @param ctx the parse tree
	 */
	void enterCatches(@NotNull JavaParser.CatchesContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#catches}.
	 * @param ctx the parse tree
	 */
	void exitCatches(@NotNull JavaParser.CatchesContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaParser#methodReference_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterMethodReference_lfno_primary(@NotNull JavaParser.MethodReference_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#methodReference_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitMethodReference_lfno_primary(@NotNull JavaParser.MethodReference_lfno_primaryContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaParser#variableDeclaratorList}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaratorList(@NotNull JavaParser.VariableDeclaratorListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#variableDeclaratorList}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaratorList(@NotNull JavaParser.VariableDeclaratorListContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaParser#variableModifier}.
	 * @param ctx the parse tree
	 */
	void enterVariableModifier(@NotNull JavaParser.VariableModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#variableModifier}.
	 * @param ctx the parse tree
	 */
	void exitVariableModifier(@NotNull JavaParser.VariableModifierContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaParser#castExpression}.
	 * @param ctx the parse tree
	 */
	void enterCastExpression(@NotNull JavaParser.CastExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#castExpression}.
	 * @param ctx the parse tree
	 */
	void exitCastExpression(@NotNull JavaParser.CastExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaParser#conditionalOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalOrExpression(@NotNull JavaParser.ConditionalOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#conditionalOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalOrExpression(@NotNull JavaParser.ConditionalOrExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaParser#typeParameterModifier}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameterModifier(@NotNull JavaParser.TypeParameterModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#typeParameterModifier}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameterModifier(@NotNull JavaParser.TypeParameterModifierContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaParser#elementValuePair}.
	 * @param ctx the parse tree
	 */
	void enterElementValuePair(@NotNull JavaParser.ElementValuePairContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#elementValuePair}.
	 * @param ctx the parse tree
	 */
	void exitElementValuePair(@NotNull JavaParser.ElementValuePairContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaParser#floatingPointType}.
	 * @param ctx the parse tree
	 */
	void enterFloatingPointType(@NotNull JavaParser.FloatingPointTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#floatingPointType}.
	 * @param ctx the parse tree
	 */
	void exitFloatingPointType(@NotNull JavaParser.FloatingPointTypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaParser#dimExpr}.
	 * @param ctx the parse tree
	 */
	void enterDimExpr(@NotNull JavaParser.DimExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#dimExpr}.
	 * @param ctx the parse tree
	 */
	void exitDimExpr(@NotNull JavaParser.DimExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaParser#unannInterfaceType_lf_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterUnannInterfaceType_lf_unannClassOrInterfaceType(@NotNull JavaParser.UnannInterfaceType_lf_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#unannInterfaceType_lf_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitUnannInterfaceType_lf_unannClassOrInterfaceType(@NotNull JavaParser.UnannInterfaceType_lf_unannClassOrInterfaceTypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaParser#resource}.
	 * @param ctx the parse tree
	 */
	void enterResource(@NotNull JavaParser.ResourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#resource}.
	 * @param ctx the parse tree
	 */
	void exitResource(@NotNull JavaParser.ResourceContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaParser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterInclusiveOrExpression(@NotNull JavaParser.InclusiveOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitInclusiveOrExpression(@NotNull JavaParser.InclusiveOrExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaParser#interfaceMethodModifier}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMethodModifier(@NotNull JavaParser.InterfaceMethodModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#interfaceMethodModifier}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMethodModifier(@NotNull JavaParser.InterfaceMethodModifierContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaParser#resourceSpecification}.
	 * @param ctx the parse tree
	 */
	void enterResourceSpecification(@NotNull JavaParser.ResourceSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#resourceSpecification}.
	 * @param ctx the parse tree
	 */
	void exitResourceSpecification(@NotNull JavaParser.ResourceSpecificationContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaParser#interfaceTypeList}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceTypeList(@NotNull JavaParser.InterfaceTypeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#interfaceTypeList}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceTypeList(@NotNull JavaParser.InterfaceTypeListContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaParser#ifThenElseStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void enterIfThenElseStatementNoShortIf(@NotNull JavaParser.IfThenElseStatementNoShortIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#ifThenElseStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void exitIfThenElseStatementNoShortIf(@NotNull JavaParser.IfThenElseStatementNoShortIfContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaParser#unannInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterUnannInterfaceType(@NotNull JavaParser.UnannInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#unannInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitUnannInterfaceType(@NotNull JavaParser.UnannInterfaceTypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaParser#interfaceModifier}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceModifier(@NotNull JavaParser.InterfaceModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#interfaceModifier}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceModifier(@NotNull JavaParser.InterfaceModifierContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaParser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterExclusiveOrExpression(@NotNull JavaParser.ExclusiveOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitExclusiveOrExpression(@NotNull JavaParser.ExclusiveOrExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaParser#classType}.
	 * @param ctx the parse tree
	 */
	void enterClassType(@NotNull JavaParser.ClassTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#classType}.
	 * @param ctx the parse tree
	 */
	void exitClassType(@NotNull JavaParser.ClassTypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaParser#postIncrementExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostIncrementExpression(@NotNull JavaParser.PostIncrementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#postIncrementExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostIncrementExpression(@NotNull JavaParser.PostIncrementExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaParser#tryStatement}.
	 * @param ctx the parse tree
	 */
	void enterTryStatement(@NotNull JavaParser.TryStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#tryStatement}.
	 * @param ctx the parse tree
	 */
	void exitTryStatement(@NotNull JavaParser.TryStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaParser#elementValueList}.
	 * @param ctx the parse tree
	 */
	void enterElementValueList(@NotNull JavaParser.ElementValueListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#elementValueList}.
	 * @param ctx the parse tree
	 */
	void exitElementValueList(@NotNull JavaParser.ElementValueListContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaParser#basicForStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void enterBasicForStatementNoShortIf(@NotNull JavaParser.BasicForStatementNoShortIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#basicForStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void exitBasicForStatementNoShortIf(@NotNull JavaParser.BasicForStatementNoShortIfContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterTypeDeclaration(@NotNull JavaParser.TypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitTypeDeclaration(@NotNull JavaParser.TypeDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaParser#switchStatement}.
	 * @param ctx the parse tree
	 */
	void enterSwitchStatement(@NotNull JavaParser.SwitchStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#switchStatement}.
	 * @param ctx the parse tree
	 */
	void exitSwitchStatement(@NotNull JavaParser.SwitchStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaParser#wildcard}.
	 * @param ctx the parse tree
	 */
	void enterWildcard(@NotNull JavaParser.WildcardContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#wildcard}.
	 * @param ctx the parse tree
	 */
	void exitWildcard(@NotNull JavaParser.WildcardContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(@NotNull JavaParser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(@NotNull JavaParser.ClassDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaParser#unaryExpressionNotPlusMinus}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpressionNotPlusMinus(@NotNull JavaParser.UnaryExpressionNotPlusMinusContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#unaryExpressionNotPlusMinus}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpressionNotPlusMinus(@NotNull JavaParser.UnaryExpressionNotPlusMinusContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaParser#unannReferenceType}.
	 * @param ctx the parse tree
	 */
	void enterUnannReferenceType(@NotNull JavaParser.UnannReferenceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#unannReferenceType}.
	 * @param ctx the parse tree
	 */
	void exitUnannReferenceType(@NotNull JavaParser.UnannReferenceTypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaParser#methodHeader}.
	 * @param ctx the parse tree
	 */
	void enterMethodHeader(@NotNull JavaParser.MethodHeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#methodHeader}.
	 * @param ctx the parse tree
	 */
	void exitMethodHeader(@NotNull JavaParser.MethodHeaderContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaParser#catchFormalParameter}.
	 * @param ctx the parse tree
	 */
	void enterCatchFormalParameter(@NotNull JavaParser.CatchFormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#catchFormalParameter}.
	 * @param ctx the parse tree
	 */
	void exitCatchFormalParameter(@NotNull JavaParser.CatchFormalParameterContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaParser#enumConstant}.
	 * @param ctx the parse tree
	 */
	void enterEnumConstant(@NotNull JavaParser.EnumConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#enumConstant}.
	 * @param ctx the parse tree
	 */
	void exitEnumConstant(@NotNull JavaParser.EnumConstantContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaParser#methodInvocation_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterMethodInvocation_lfno_primary(@NotNull JavaParser.MethodInvocation_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#methodInvocation_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitMethodInvocation_lfno_primary(@NotNull JavaParser.MethodInvocation_lfno_primaryContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaParser#packageName}.
	 * @param ctx the parse tree
	 */
	void enterPackageName(@NotNull JavaParser.PackageNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#packageName}.
	 * @param ctx the parse tree
	 */
	void exitPackageName(@NotNull JavaParser.PackageNameContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterImportDeclaration(@NotNull JavaParser.ImportDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitImportDeclaration(@NotNull JavaParser.ImportDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveType(@NotNull JavaParser.PrimitiveTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveType(@NotNull JavaParser.PrimitiveTypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceDeclaration(@NotNull JavaParser.InterfaceDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceDeclaration(@NotNull JavaParser.InterfaceDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaParser#localVariableDeclarationStatement}.
	 * @param ctx the parse tree
	 */
	void enterLocalVariableDeclarationStatement(@NotNull JavaParser.LocalVariableDeclarationStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#localVariableDeclarationStatement}.
	 * @param ctx the parse tree
	 */
	void exitLocalVariableDeclarationStatement(@NotNull JavaParser.LocalVariableDeclarationStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatement(@NotNull JavaParser.BlockStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatement(@NotNull JavaParser.BlockStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaParser#classType_lf_classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterClassType_lf_classOrInterfaceType(@NotNull JavaParser.ClassType_lf_classOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#classType_lf_classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitClassType_lf_classOrInterfaceType(@NotNull JavaParser.ClassType_lf_classOrInterfaceTypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaParser#packageOrTypeName}.
	 * @param ctx the parse tree
	 */
	void enterPackageOrTypeName(@NotNull JavaParser.PackageOrTypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#packageOrTypeName}.
	 * @param ctx the parse tree
	 */
	void exitPackageOrTypeName(@NotNull JavaParser.PackageOrTypeNameContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(@NotNull JavaParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(@NotNull JavaParser.AssignmentContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaParser#methodName}.
	 * @param ctx the parse tree
	 */
	void enterMethodName(@NotNull JavaParser.MethodNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#methodName}.
	 * @param ctx the parse tree
	 */
	void exitMethodName(@NotNull JavaParser.MethodNameContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaParser#statementExpression}.
	 * @param ctx the parse tree
	 */
	void enterStatementExpression(@NotNull JavaParser.StatementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#statementExpression}.
	 * @param ctx the parse tree
	 */
	void exitStatementExpression(@NotNull JavaParser.StatementExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaParser#breakStatement}.
	 * @param ctx the parse tree
	 */
	void enterBreakStatement(@NotNull JavaParser.BreakStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#breakStatement}.
	 * @param ctx the parse tree
	 */
	void exitBreakStatement(@NotNull JavaParser.BreakStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaParser#ambiguousName}.
	 * @param ctx the parse tree
	 */
	void enterAmbiguousName(@NotNull JavaParser.AmbiguousNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#ambiguousName}.
	 * @param ctx the parse tree
	 */
	void exitAmbiguousName(@NotNull JavaParser.AmbiguousNameContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaParser#statementExpressionList}.
	 * @param ctx the parse tree
	 */
	void enterStatementExpressionList(@NotNull JavaParser.StatementExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#statementExpressionList}.
	 * @param ctx the parse tree
	 */
	void exitStatementExpressionList(@NotNull JavaParser.StatementExpressionListContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaParser#interfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMethodDeclaration(@NotNull JavaParser.InterfaceMethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#interfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMethodDeclaration(@NotNull JavaParser.InterfaceMethodDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaParser#throws_}.
	 * @param ctx the parse tree
	 */
	void enterThrows_(@NotNull JavaParser.Throws_Context ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#throws_}.
	 * @param ctx the parse tree
	 */
	void exitThrows_(@NotNull JavaParser.Throws_Context ctx);

	/**
	 * Enter a parse tree produced by {@link JavaParser#switchLabel}.
	 * @param ctx the parse tree
	 */
	void enterSwitchLabel(@NotNull JavaParser.SwitchLabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#switchLabel}.
	 * @param ctx the parse tree
	 */
	void exitSwitchLabel(@NotNull JavaParser.SwitchLabelContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaParser#methodReference}.
	 * @param ctx the parse tree
	 */
	void enterMethodReference(@NotNull JavaParser.MethodReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#methodReference}.
	 * @param ctx the parse tree
	 */
	void exitMethodReference(@NotNull JavaParser.MethodReferenceContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaParser#primaryNoNewArray}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray(@NotNull JavaParser.PrimaryNoNewArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#primaryNoNewArray}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray(@NotNull JavaParser.PrimaryNoNewArrayContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaParser#numericType}.
	 * @param ctx the parse tree
	 */
	void enterNumericType(@NotNull JavaParser.NumericTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#numericType}.
	 * @param ctx the parse tree
	 */
	void exitNumericType(@NotNull JavaParser.NumericTypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaParser#continueStatement}.
	 * @param ctx the parse tree
	 */
	void enterContinueStatement(@NotNull JavaParser.ContinueStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#continueStatement}.
	 * @param ctx the parse tree
	 */
	void exitContinueStatement(@NotNull JavaParser.ContinueStatementContext ctx);
}