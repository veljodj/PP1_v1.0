// generated with ast extension for cup
// version 0.8
// 26/3/2021 11:3:24


package rs.ac.bg.etf.pp1.ast;

public class StatReturn2 extends Matched {

    public StatReturn2 () {
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
        buffer.append("StatReturn2(\n");

        buffer.append(tab);
        buffer.append(") [StatReturn2]");
        return buffer.toString();
    }
}
