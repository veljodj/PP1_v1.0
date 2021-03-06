// generated with ast extension for cup
// version 0.8
// 3/3/2021 22:48:31


package rs.ac.bg.etf.pp1.ast;

public class ExprCondition implements SyntaxNode {

    private SyntaxNode parent;
    private int line;
    public rs.etf.pp1.symboltable.concepts.Struct struct = null;

    private ExprManjiProstiji ExprManjiProstiji;

    public ExprCondition (ExprManjiProstiji ExprManjiProstiji) {
        this.ExprManjiProstiji=ExprManjiProstiji;
        if(ExprManjiProstiji!=null) ExprManjiProstiji.setParent(this);
    }

    public ExprManjiProstiji getExprManjiProstiji() {
        return ExprManjiProstiji;
    }

    public void setExprManjiProstiji(ExprManjiProstiji ExprManjiProstiji) {
        this.ExprManjiProstiji=ExprManjiProstiji;
    }

    public SyntaxNode getParent() {
        return parent;
    }

    public void setParent(SyntaxNode parent) {
        this.parent=parent;
    }

    public int getLine() {
        return line;
    }

    public void setLine(int line) {
        this.line=line;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(ExprManjiProstiji!=null) ExprManjiProstiji.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(ExprManjiProstiji!=null) ExprManjiProstiji.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(ExprManjiProstiji!=null) ExprManjiProstiji.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("ExprCondition(\n");

        if(ExprManjiProstiji!=null)
            buffer.append(ExprManjiProstiji.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [ExprCondition]");
        return buffer.toString();
    }
}
