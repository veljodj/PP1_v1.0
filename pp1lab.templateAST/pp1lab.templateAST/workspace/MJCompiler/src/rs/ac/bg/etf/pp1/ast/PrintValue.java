// generated with ast extension for cup
// version 0.8
// 3/3/2021 22:48:31


package rs.ac.bg.etf.pp1.ast;

public class PrintValue implements SyntaxNode {

    private SyntaxNode parent;
    private int line;
    private PrintValue PrintValue;
    private Integer value;

    public PrintValue (PrintValue PrintValue, Integer value) {
        this.PrintValue=PrintValue;
        if(PrintValue!=null) PrintValue.setParent(this);
        this.value=value;
    }

    public PrintValue getPrintValue() {
        return PrintValue;
    }

    public void setPrintValue(PrintValue PrintValue) {
        this.PrintValue=PrintValue;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value=value;
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
        if(PrintValue!=null) PrintValue.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(PrintValue!=null) PrintValue.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(PrintValue!=null) PrintValue.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("PrintValue(\n");

        if(PrintValue!=null)
            buffer.append(PrintValue.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(" "+tab+value);
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [PrintValue]");
        return buffer.toString();
    }
}
