package design.patterns.behavioral.visitor;

public class ConcreteElementA implements Element {
    @Override
    public void accept(ElementVisitor elementVisitor) {
        elementVisitor.visitElementA(this);
    }
}
