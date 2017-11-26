// Generated from src/Grammar/PyLogic3.g4 by ANTLR 4.7
package Classes;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link PyLogic3Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface PyLogic3Visitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link PyLogic3Parser#file_input}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile_input(PyLogic3Parser.File_inputContext ctx);
	/**
	 * Visit a parse tree produced by {@link PyLogic3Parser#single_input}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingle_input(PyLogic3Parser.Single_inputContext ctx);
	/**
	 * Visit a parse tree produced by {@link PyLogic3Parser#eval_input}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEval_input(PyLogic3Parser.Eval_inputContext ctx);
	/**
	 * Visit a parse tree produced by {@link PyLogic3Parser#decorator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecorator(PyLogic3Parser.DecoratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link PyLogic3Parser#decorators}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecorators(PyLogic3Parser.DecoratorsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PyLogic3Parser#decorated}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecorated(PyLogic3Parser.DecoratedContext ctx);
	/**
	 * Visit a parse tree produced by {@link PyLogic3Parser#funcdef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncdef(PyLogic3Parser.FuncdefContext ctx);
	/**
	 * Visit a parse tree produced by {@link PyLogic3Parser#parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameters(PyLogic3Parser.ParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link PyLogic3Parser#typedargslist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypedargslist(PyLogic3Parser.TypedargslistContext ctx);
	/**
	 * Visit a parse tree produced by {@link PyLogic3Parser#tfpdef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTfpdef(PyLogic3Parser.TfpdefContext ctx);
	/**
	 * Visit a parse tree produced by {@link PyLogic3Parser#varargslist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarargslist(PyLogic3Parser.VarargslistContext ctx);
	/**
	 * Visit a parse tree produced by {@link PyLogic3Parser#vfpdef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVfpdef(PyLogic3Parser.VfpdefContext ctx);
	/**
	 * Visit a parse tree produced by {@link PyLogic3Parser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt(PyLogic3Parser.StmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PyLogic3Parser#simple_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_stmt(PyLogic3Parser.Simple_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PyLogic3Parser#small_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSmall_stmt(PyLogic3Parser.Small_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PyLogic3Parser#expr_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_stmt(PyLogic3Parser.Expr_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PyLogic3Parser#testlist_star_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTestlist_star_expr(PyLogic3Parser.Testlist_star_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link PyLogic3Parser#augassign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAugassign(PyLogic3Parser.AugassignContext ctx);
	/**
	 * Visit a parse tree produced by {@link PyLogic3Parser#del_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDel_stmt(PyLogic3Parser.Del_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PyLogic3Parser#pass_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPass_stmt(PyLogic3Parser.Pass_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PyLogic3Parser#flow_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlow_stmt(PyLogic3Parser.Flow_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PyLogic3Parser#break_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreak_stmt(PyLogic3Parser.Break_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PyLogic3Parser#continue_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinue_stmt(PyLogic3Parser.Continue_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PyLogic3Parser#return_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_stmt(PyLogic3Parser.Return_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PyLogic3Parser#yield_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitYield_stmt(PyLogic3Parser.Yield_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PyLogic3Parser#raise_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRaise_stmt(PyLogic3Parser.Raise_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PyLogic3Parser#import_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImport_stmt(PyLogic3Parser.Import_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PyLogic3Parser#import_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImport_name(PyLogic3Parser.Import_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PyLogic3Parser#import_from}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImport_from(PyLogic3Parser.Import_fromContext ctx);
	/**
	 * Visit a parse tree produced by {@link PyLogic3Parser#import_as_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImport_as_name(PyLogic3Parser.Import_as_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PyLogic3Parser#dotted_as_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDotted_as_name(PyLogic3Parser.Dotted_as_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PyLogic3Parser#import_as_names}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImport_as_names(PyLogic3Parser.Import_as_namesContext ctx);
	/**
	 * Visit a parse tree produced by {@link PyLogic3Parser#dotted_as_names}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDotted_as_names(PyLogic3Parser.Dotted_as_namesContext ctx);
	/**
	 * Visit a parse tree produced by {@link PyLogic3Parser#dotted_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDotted_name(PyLogic3Parser.Dotted_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PyLogic3Parser#global_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobal_stmt(PyLogic3Parser.Global_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PyLogic3Parser#nonlocal_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonlocal_stmt(PyLogic3Parser.Nonlocal_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PyLogic3Parser#assert_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssert_stmt(PyLogic3Parser.Assert_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PyLogic3Parser#compound_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompound_stmt(PyLogic3Parser.Compound_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PyLogic3Parser#if_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_stmt(PyLogic3Parser.If_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PyLogic3Parser#while_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_stmt(PyLogic3Parser.While_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PyLogic3Parser#for_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_stmt(PyLogic3Parser.For_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PyLogic3Parser#try_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTry_stmt(PyLogic3Parser.Try_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PyLogic3Parser#with_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWith_stmt(PyLogic3Parser.With_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PyLogic3Parser#with_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWith_item(PyLogic3Parser.With_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PyLogic3Parser#except_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExcept_clause(PyLogic3Parser.Except_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PyLogic3Parser#suite}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuite(PyLogic3Parser.SuiteContext ctx);
	/**
	 * Visit a parse tree produced by {@link PyLogic3Parser#test}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTest(PyLogic3Parser.TestContext ctx);
	/**
	 * Visit a parse tree produced by {@link PyLogic3Parser#test_nocond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTest_nocond(PyLogic3Parser.Test_nocondContext ctx);
	/**
	 * Visit a parse tree produced by {@link PyLogic3Parser#lambdef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdef(PyLogic3Parser.LambdefContext ctx);
	/**
	 * Visit a parse tree produced by {@link PyLogic3Parser#lambdef_nocond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdef_nocond(PyLogic3Parser.Lambdef_nocondContext ctx);
	/**
	 * Visit a parse tree produced by {@link PyLogic3Parser#or_test}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOr_test(PyLogic3Parser.Or_testContext ctx);
	/**
	 * Visit a parse tree produced by {@link PyLogic3Parser#and_test}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnd_test(PyLogic3Parser.And_testContext ctx);
	/**
	 * Visit a parse tree produced by {@link PyLogic3Parser#not_test}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNot_test(PyLogic3Parser.Not_testContext ctx);
	/**
	 * Visit a parse tree produced by {@link PyLogic3Parser#comparison}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparison(PyLogic3Parser.ComparisonContext ctx);
	/**
	 * Visit a parse tree produced by {@link PyLogic3Parser#comp_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComp_op(PyLogic3Parser.Comp_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link PyLogic3Parser#star_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStar_expr(PyLogic3Parser.Star_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link PyLogic3Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(PyLogic3Parser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link PyLogic3Parser#xor_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXor_expr(PyLogic3Parser.Xor_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link PyLogic3Parser#and_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnd_expr(PyLogic3Parser.And_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link PyLogic3Parser#shift_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShift_expr(PyLogic3Parser.Shift_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link PyLogic3Parser#arith_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArith_expr(PyLogic3Parser.Arith_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link PyLogic3Parser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(PyLogic3Parser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link PyLogic3Parser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(PyLogic3Parser.FactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link PyLogic3Parser#power}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPower(PyLogic3Parser.PowerContext ctx);
	/**
	 * Visit a parse tree produced by {@link PyLogic3Parser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtom(PyLogic3Parser.AtomContext ctx);
	/**
	 * Visit a parse tree produced by {@link PyLogic3Parser#testlist_comp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTestlist_comp(PyLogic3Parser.Testlist_compContext ctx);
	/**
	 * Visit a parse tree produced by {@link PyLogic3Parser#trailer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrailer(PyLogic3Parser.TrailerContext ctx);
	/**
	 * Visit a parse tree produced by {@link PyLogic3Parser#subscriptlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubscriptlist(PyLogic3Parser.SubscriptlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link PyLogic3Parser#subscript}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubscript(PyLogic3Parser.SubscriptContext ctx);
	/**
	 * Visit a parse tree produced by {@link PyLogic3Parser#sliceop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSliceop(PyLogic3Parser.SliceopContext ctx);
	/**
	 * Visit a parse tree produced by {@link PyLogic3Parser#exprlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprlist(PyLogic3Parser.ExprlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link PyLogic3Parser#testlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTestlist(PyLogic3Parser.TestlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link PyLogic3Parser#dictorsetmaker}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDictorsetmaker(PyLogic3Parser.DictorsetmakerContext ctx);
	/**
	 * Visit a parse tree produced by {@link PyLogic3Parser#classdef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassdef(PyLogic3Parser.ClassdefContext ctx);
	/**
	 * Visit a parse tree produced by {@link PyLogic3Parser#arglist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArglist(PyLogic3Parser.ArglistContext ctx);
	/**
	 * Visit a parse tree produced by {@link PyLogic3Parser#argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgument(PyLogic3Parser.ArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link PyLogic3Parser#comp_iter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComp_iter(PyLogic3Parser.Comp_iterContext ctx);
	/**
	 * Visit a parse tree produced by {@link PyLogic3Parser#comp_for}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComp_for(PyLogic3Parser.Comp_forContext ctx);
	/**
	 * Visit a parse tree produced by {@link PyLogic3Parser#comp_if}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComp_if(PyLogic3Parser.Comp_ifContext ctx);
	/**
	 * Visit a parse tree produced by {@link PyLogic3Parser#yield_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitYield_expr(PyLogic3Parser.Yield_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link PyLogic3Parser#yield_arg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitYield_arg(PyLogic3Parser.Yield_argContext ctx);
	/**
	 * Visit a parse tree produced by {@link PyLogic3Parser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(PyLogic3Parser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by {@link PyLogic3Parser#fact}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFact(PyLogic3Parser.FactContext ctx);
	/**
	 * Visit a parse tree produced by {@link PyLogic3Parser#rules}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRules(PyLogic3Parser.RulesContext ctx);
	/**
	 * Visit a parse tree produced by {@link PyLogic3Parser#consult}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConsult(PyLogic3Parser.ConsultContext ctx);
	/**
	 * Visit a parse tree produced by {@link PyLogic3Parser#log_line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLog_line(PyLogic3Parser.Log_lineContext ctx);
	/**
	 * Visit a parse tree produced by {@link PyLogic3Parser#strr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStrr(PyLogic3Parser.StrrContext ctx);
	/**
	 * Visit a parse tree produced by {@link PyLogic3Parser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(PyLogic3Parser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link PyLogic3Parser#integer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInteger(PyLogic3Parser.IntegerContext ctx);
}