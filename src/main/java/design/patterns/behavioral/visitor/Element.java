package design.patterns.behavioral.visitor;

public interface Element {
    // methods
    public void accept(ElementVisitor elementVisitor);
}
