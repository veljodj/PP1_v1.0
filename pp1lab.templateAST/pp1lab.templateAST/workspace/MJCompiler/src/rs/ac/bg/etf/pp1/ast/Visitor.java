// generated with ast extension for cup
// version 0.8
// 3/3/2021 22:48:31


package rs.ac.bg.etf.pp1.ast;

public interface Visitor { 

    public void visit(Unmatched Unmatched);
    public void visit(MethodDecl MethodDecl);
    public void visit(Mulop Mulop);
    public void visit(Matched Matched);
    public void visit(Relop Relop);
    public void visit(Assignop Assignop);
    public void visit(FormalParamDecl FormalParamDecl);
    public void visit(StatementList StatementList);
    public void visit(Extends Extends);
    public void visit(Addop Addop);
    public void visit(TermsInExpr TermsInExpr);
    public void visit(Factor Factor);
    public void visit(CondTerm CondTerm);
    public void visit(Designator Designator);
    public void visit(Term Term);
    public void visit(RetType RetType);
    public void visit(Condition Condition);
    public void visit(OneMinus OneMinus);
    public void visit(ExprManjiProstiji ExprManjiProstiji);
    public void visit(CaseList CaseList);
    public void visit(ConstDeclList ConstDeclList);
    public void visit(VarDeclOne VarDeclOne);
    public void visit(ActualParamList ActualParamList);
    public void visit(VarDeclList VarDeclList);
    public void visit(FormalParamList FormalParamList);
    public void visit(Expr Expr);
    public void visit(ActPars ActPars);
    public void visit(Stagod Stagod);
    public void visit(ConstVarClassDeclList ConstVarClassDeclList);
    public void visit(Epsilon Epsilon);
    public void visit(DesignatorStatement DesignatorStatement);
    public void visit(Statement Statement);
    public void visit(IdentOrExpr IdentOrExpr);
    public void visit(VarDecl VarDecl);
    public void visit(Array Array);
    public void visit(ClassDecl ClassDecl);
    public void visit(ConstDecl ConstDecl);
    public void visit(CondFact CondFact);
    public void visit(ConstDeclOne ConstDeclOne);
    public void visit(MethodDeclList MethodDeclList);
    public void visit(FormPars FormPars);
    public void visit(ManyVarDecl ManyVarDecl);
    public void visit(EpsilonDerived1 EpsilonDerived1);
    public void visit(MulopMod MulopMod);
    public void visit(MulopDiv MulopDiv);
    public void visit(MulopMul MulopMul);
    public void visit(AddopMinus AddopMinus);
    public void visit(AddopPlus AddopPlus);
    public void visit(RelopLowerEqual RelopLowerEqual);
    public void visit(RelopLower RelopLower);
    public void visit(RelopGreaterEqual RelopGreaterEqual);
    public void visit(RelopGreater RelopGreater);
    public void visit(RelopNotEqual RelopNotEqual);
    public void visit(RelopEqual RelopEqual);
    public void visit(AssignopDerived1 AssignopDerived1);
    public void visit(DesignatorOneArray DesignatorOneArray);
    public void visit(DesignatorOneDot DesignatorOneDot);
    public void visit(DesignatorJustOne DesignatorJustOne);
    public void visit(FactExpr FactExpr);
    public void visit(FactNewArray FactNewArray);
    public void visit(FactNew FactNew);
    public void visit(FactBool FactBool);
    public void visit(FactChar FactChar);
    public void visit(FactNum FactNum);
    public void visit(FuncCall FuncCall);
    public void visit(FactVar FactVar);
    public void visit(TermOne TermOne);
    public void visit(TermMore TermMore);
    public void visit(ExprTermList ExprTermList);
    public void visit(ExprTermMinus ExprTermMinus);
    public void visit(ExprTerm ExprTerm);
    public void visit(ExprConditionFalse ExprConditionFalse);
    public void visit(ExprConditionTrue ExprConditionTrue);
    public void visit(ExprCondition ExprCondition);
    public void visit(Expr1 Expr1);
    public void visit(Expr0 Expr0);
    public void visit(CondFactRelop CondFactRelop);
    public void visit(CondFactOne CondFactOne);
    public void visit(CondTermEnd CondTermEnd);
    public void visit(CondTermMulti CondTermMulti);
    public void visit(ConditionEnd ConditionEnd);
    public void visit(ConditionMulti ConditionMulti);
    public void visit(ActualParamEnd ActualParamEnd);
    public void visit(ActualParams ActualParams);
    public void visit(NoActuals NoActuals);
    public void visit(Actuals Actuals);
    public void visit(DStatementDec DStatementDec);
    public void visit(DStatementInc DStatementInc);
    public void visit(DStatementParen DStatementParen);
    public void visit(DStatementAssign DStatementAssign);
    public void visit(PrintValue PrintValue);
    public void visit(StagodDerived1 StagodDerived1);
    public void visit(CaseListNoElem CaseListNoElem);
    public void visit(CaseListt CaseListt);
    public void visit(DoWhile DoWhile);
    public void visit(StatErrAssignment StatErrAssignment);
    public void visit(StatPrintValue StatPrintValue);
    public void visit(StatPrint StatPrint);
    public void visit(StatReturn2 StatReturn2);
    public void visit(StatReturn StatReturn);
    public void visit(StatCase StatCase);
    public void visit(StatStat StatStat);
    public void visit(StatRead StatRead);
    public void visit(StatContinue StatContinue);
    public void visit(StatBreak StatBreak);
    public void visit(StatWhile StatWhile);
    public void visit(StatDesign StatDesign);
    public void visit(UnmatchedIfElse UnmatchedIfElse);
    public void visit(UnmatchedIf UnmatchedIf);
    public void visit(UnmatchedStat UnmatchedStat);
    public void visit(MatchedStat MatchedStat);
    public void visit(StatementListNo StatementListNo);
    public void visit(StatementListt StatementListt);
    public void visit(ArrayDerived2 ArrayDerived2);
    public void visit(ArrayDerived1 ArrayDerived1);
    public void visit(FormalParamDeclArray FormalParamDeclArray);
    public void visit(SingleFormalParamDecl SingleFormalParamDecl);
    public void visit(FormalParamDecls FormalParamDecls);
    public void visit(NoFormParam NoFormParam);
    public void visit(FormParams FormParams);
    public void visit(RetVoid1 RetVoid1);
    public void visit(RetType1 RetType1);
    public void visit(MethodTypeName MethodTypeName);
    public void visit(MethodDeclaration MethodDeclaration);
    public void visit(NoMethodDecl NoMethodDecl);
    public void visit(MethodDeclarations MethodDeclarations);
    public void visit(ManyVarDeclNo ManyVarDeclNo);
    public void visit(ManyVarDeclaration ManyVarDeclaration);
    public void visit(NoExtends NoExtends);
    public void visit(ExtendClass ExtendClass);
    public void visit(ClassDeclMethod ClassDeclMethod);
    public void visit(ClassDeclNoMethod ClassDeclNoMethod);
    public void visit(Type Type);
    public void visit(VarDeclError VarDeclError);
    public void visit(VarDeclOneSquare VarDeclOneSquare);
    public void visit(VarDeclOneNoSquare VarDeclOneNoSquare);
    public void visit(VarDecListOneElement VarDecListOneElement);
    public void visit(VarDeclarations VarDeclarations);
    public void visit(VarDeclaration VarDeclaration);
    public void visit(ConstDeclOneElementBool ConstDeclOneElementBool);
    public void visit(ConstDeclOneElementChar ConstDeclOneElementChar);
    public void visit(ConstDeclOneElementNumber ConstDeclOneElementNumber);
    public void visit(ConstDeclList_single ConstDeclList_single);
    public void visit(ConstDeclList_nadovezivanje ConstDeclList_nadovezivanje);
    public void visit(ConstType ConstType);
    public void visit(ConstDeclaration ConstDeclaration);
    public void visit(ConstVarClassDeclList_No ConstVarClassDeclList_No);
    public void visit(ConstVarClassDeclList_Class ConstVarClassDeclList_Class);
    public void visit(ConstVarClassDeclList_Var ConstVarClassDeclList_Var);
    public void visit(ConstVarClassDeclList_Const ConstVarClassDeclList_Const);
    public void visit(ProgName ProgName);
    public void visit(Program Program);

}
