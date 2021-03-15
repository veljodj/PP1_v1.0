// generated with ast extension for cup
// version 0.8
// 15/2/2021 15:16:24


package rs.ac.bg.etf.pp1.ast;

public class DesignExpr extends IdentOrExpr {

    private IdentOrExpr IdentOrExpr;
    private Expr Expr;

    public DesignExpr (IdentOrExpr IdentOrExpr, Expr Expr) {
        this.IdentOrExpr=IdentOrExpr;
        if(IdentOrExpr!=null) IdentOrExpr.setParent(this);
        this.Expr=Expr;
        if(Expr!=null) Expr.setParent(this);
    }

    public IdentOrExpr getIdentOrExpr() {
        return IdentOrExpr;
    }

    public void setIdentOrExpr(IdentOrExpr IdentOrExpr) {
        this.IdentOrExpr=IdentOrExpr;
    }

    public Expr getExpr() {
        return Expr;
    }

    public void setExpr(Expr Expr) {
        this.Expr=Expr;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(IdentOrExpr!=null) IdentOrExpr.accept(visitor);
        if(Expr!=null) Expr.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(IdentOrExpr!=null) IdentOrExpr.traverseTopDown(visitor);
        if(Expr!=null) Expr.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(IdentOrExpr!=null) IdentOrExpr.traverseBottomUp(visitor);
        if(Expr!=null) Expr.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("DesignExpr(\n");

        if(IdentOrExpr!=null)
            buffer.append(IdentOrExpr.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(Expr!=null)
            buffer.append(Expr.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [DesignExpr]");
        return buffer.toString();
    }
}
