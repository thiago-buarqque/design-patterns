package design.patterns.behavioral.visitor;

public interface Element {
    public void accept(ElementVisitor elementVisitor);
}
