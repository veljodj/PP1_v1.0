// generated with ast extension for cup
// version 0.8
// 23/3/2021 14:34:20


package rs.ac.bg.etf.pp1.ast;

public class NoExtends extends Extends {

    public NoExtends () {
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("NoExtends(\n");

        buffer.append(tab);
        buffer.append(") [NoExtends]");
        return buffer.toString();
    }
}
