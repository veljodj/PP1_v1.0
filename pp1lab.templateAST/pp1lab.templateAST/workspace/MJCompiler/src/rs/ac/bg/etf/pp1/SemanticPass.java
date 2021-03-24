package rs.ac.bg.etf.pp1;
import org.apache.log4j.Logger;

import rs.ac.bg.etf.pp1.ast.*;
import rs.etf.pp1.symboltable.*;
import rs.etf.pp1.symboltable.concepts.*; 

public class SemanticPass extends VisitorAdaptor {

	boolean errorDetected = false;
	int printCallCount = 0;
	Obj currentMethod = null;
				// kada ulancavamo lokalne simbole prosledjivacemo metodu u kojoj se trenutno nalazimo
	boolean returnFound = false;
	int nVars;

	Logger log = Logger.getLogger(getClass());

	 
	public void report_error(String message, SyntaxNode info) {
							// Ovo nije menjano
		errorDetected = true;
		StringBuilder msg = new StringBuilder(message);
		int line = (info == null) ? 0: info.getLine();
		if (line != 0)
			msg.append (" na liniji ").append(line);
		log.error(msg.toString());
	}

	public void report_info(String message, SyntaxNode info) {
							// Ovo nije menjano
		StringBuilder msg = new StringBuilder(message); 
		int line = (info == null) ? 0: info.getLine();
		if (line != 0)
			msg.append (" na liniji ").append(line);
		log.info(msg.toString());
	}
	 
	
	
	
	public void visit(Program program) {
		report_info("Usao sam u Program", program);
					// Menjano	
		nVars = Tab.currentScope.getnVars();
		Tab.chainLocalSymbols(program.getProgName().obj);
		Tab.closeScope(); 
	}
	public void visit(ProgName progName) {
		report_info("Usao sam u ProgName", progName);
					// Menjano	
		progName.obj = Tab.insert(Obj.Prog, progName.getPName(), Tab.noType); 
		Tab.openScope();      
	}

/*
//	public void visit(VarDecl varDecl) {
	public void visit(VarDeclOneNoSquare VarDeclOneNoSquare) {
		report_info("Deklarisana promenljiva "+ VarDeclOneNoSquare.getNameVarOne(), VarDeclOneNoSquare);
		Obj varNode = Tab.insert(Obj.Var, VarDeclOneNoSquare.getNameVarOne(), null);
															// Ovde fali
	}
	
*/
	
	public void visit(Type type) {
				// Menjano tj. nije
		Obj typeNode = Tab.find(type.getTypeName());
		if (typeNode == Tab.noObj) {
			report_error("Nije pronadjen tip " + type.getTypeName() + " u tabeli simbola", null);
			type.struct = Tab.noType;
		} 
		else {
			if (Obj.Type == typeNode.getKind()) {
				type.struct = typeNode.getType();
			} 
			else {
				report_error("Greska: Ime " + type.getTypeName() + " ne predstavlja tip ", type);
				type.struct = Tab.noType;
			}
		}  
	}
	
	
// Krecem redom po mjparser.cup, videcemo koliko ce to da traje


	@Override
	public void visit(ConstVarClassDeclList_Const ConstVarClassDeclList_Const) {
		// TODO Auto-generated method stub
		super.visit(ConstVarClassDeclList_Const);
	}
	 
	@Override
	public void visit(ConstDeclaration ConstDeclaration) {
		// TODO Auto-generated method stub
		super.visit(ConstDeclaration);
	}

	@Override
	public void visit(ConstType ConstType) {
		// TODO Auto-generated method stub
		super.visit(ConstType);
	}
	 
	@Override
	public void visit(ConstDeclOneElementNumber ConstDeclOneElementNumber) {
		// TODO Auto-generated method stub
		super.visit(ConstDeclOneElementNumber);
	}

	public void visit(MethodDecl methodDecl) {
		if (!returnFound && currentMethod.getType() != Tab.noType) {
			report_error("Semanticka greska na liniji " + methodDecl.getLine() + ": funcija " + currentMethod.getName() + " nema return iskaz!", null);
		}
		
		Tab.chainLocalSymbols(currentMethod);
		Tab.closeScope();
		
		returnFound = false;
		currentMethod = null;
	}

	/*

	public void visit(MethodTypeName methodTypeName) {
		currentMethod = Tab.insert(Obj.Meth, methodTypeName.getMethName(), methodTypeName.getType().struct);
		methodTypeName.obj = currentMethod;
		Tab.openScope();
		report_info("Obradjuje se funkcija " + methodTypeName.getMethName(), methodTypeName);
	}
 
	public void visit(Assignment assignment) {
		if (!assignment.getExpr().struct.assignableTo(assignment.getDesignator().obj.getType()))
			report_error("Greska na liniji " + assignment.getLine() + " : " + " nekompatibilni tipovi u dodeli vrednosti ", null);
	}

	public void visit(PrintStmt printStmt){
		printCallCount++;    	
	}

	public void visit(ReturnExpr returnExpr){
		returnFound = true;
		Struct currMethType = currentMethod.getType();
		if (!currMethType.compatibleWith(returnExpr.getExpr().struct)) {
			report_error("Greska na liniji " + returnExpr.getLine() + " : " + "tip izraza u return naredbi ne slaze se sa tipom povratne vrednosti funkcije " + currentMethod.getName(), null);
		}			  	     	
	}

	public void visit(ProcCall procCall){
		Obj func = procCall.getDesignator().obj;
		if (Obj.Meth == func.getKind()) { 
			report_info("Pronadjen poziv funkcije " + func.getName() + " na liniji " + procCall.getLine(), null);
			//RESULT = func.getType();
		} 
		else {
			report_error("Greska na liniji " + procCall.getLine()+" : ime " + func.getName() + " nije funkcija!", null);
			//RESULT = Tab.noType;
		}     	
	}    

	public void visit(AddExpr addExpr) {
		Struct te = addExpr.getExpr().struct;
		Struct t = addExpr.getTerm().struct;
		if (te.equals(t) && te == Tab.intType)
			addExpr.struct = te;
		else {
			report_error("Greska na liniji "+ addExpr.getLine()+" : nekompatibilni tipovi u izrazu za sabiranje.", null);
			addExpr.struct = Tab.noType;
		} 
	}

	public void visit(TermExpr termExpr) {
		termExpr.struct = termExpr.getTerm().struct;
	}

	public void visit(Term term) {
		term.struct = term.getFactor().struct;    	
	}

	public void visit(Const cnst){
		cnst.struct = Tab.intType;    	
	}
	
	public void visit(Var var) {
		var.struct = var.getDesignator().obj.getType();
	}

	public void visit(FuncCall funcCall){
		Obj func = funcCall.getDesignator().obj;
		if (Obj.Meth == func.getKind()) { 
			report_info("Pronadjen poziv funkcije " + func.getName() + " na liniji " + funcCall.getLine(), null);
			funcCall.struct = func.getType();
		} 
		else {
			report_error("Greska na liniji " + funcCall.getLine()+" : ime " + func.getName() + " nije funkcija!", null);
			funcCall.struct = Tab.noType;
		}

	}

	public void visit(Designator designator){
		Obj obj = Tab.find(designator.getName());
		if (obj == Tab.noObj) { 
			report_error("Greska na liniji " + designator.getLine()+ " : ime "+designator.getName()+" nije deklarisano! ", null);
		}
		designator.obj = obj;
	}
	
	*/
	public boolean passed() {
		return !errorDetected;
	}

}
