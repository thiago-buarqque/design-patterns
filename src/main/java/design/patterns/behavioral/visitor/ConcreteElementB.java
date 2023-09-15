package design.patterns.behavioral.visitor;

public class ConcreteElementB implements Element {
    @Override
    public void accept(ElementVisitor elementVisitor) {
        elementVisitor.visitElementB(this);
    }
}
