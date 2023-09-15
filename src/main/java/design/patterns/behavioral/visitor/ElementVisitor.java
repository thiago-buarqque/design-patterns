package design.patterns.behavioral.visitor;

public interface ElementVisitor {
    public void visitElementA(ConcreteElementA concreteElementA);
    public void visitElementB(ConcreteElementB concreteElementB);
}
