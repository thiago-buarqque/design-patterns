package design.patterns.behavioral.visitor;

public class ElementConcreteVisitor2 implements ElementVisitor {
    @Override
    public void visitElementA(ConcreteElementA concreteElementA) {
        // Do concrete visitor 2 stuff for concreteElementA
    }

    @Override
    public void visitElementB(ConcreteElementB concreteElementB) {
        // Do concrete visitor 2 stuff for concreteElementB
    }
}
