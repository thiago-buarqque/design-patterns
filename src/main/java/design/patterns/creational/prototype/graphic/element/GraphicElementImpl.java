package design.patterns.creational.prototype.graphic.element;

import design.patterns.behavioral.observer.GraphicElementObserver;
import design.patterns.behavioral.observer.GraphicElementSubject;

import java.util.ArrayList;
import java.util.List;

public abstract class GraphicElementImpl implements GraphicElement {
    private final String name;
    private final String id;

    private final List<GraphicElementObserver> observers = new ArrayList<>();
    private GraphicElementSubject subject = null;

    protected GraphicElementImpl(String id, String name) {
        this.id = id;
        this.name = name;
    }

    protected GraphicElementImpl(String id, String name, GraphicElementSubject subject) {
        this.id = id;
        this.name = name;
        this.subject = subject;
    }

    protected GraphicElementImpl(GraphicElementImpl graphicElementImpl) {
        this.id = graphicElementImpl.id;
        this.name = graphicElementImpl.name;
        this.subject = graphicElementImpl.subject;

        if(this.subject != null) {
            this.subject.attach(this);
        }
    }

    @Override
    public String getId() {
        return this.id;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void attach(GraphicElementObserver observer) {
        this.observers.add(observer);
    }

    @Override
    public void detach(GraphicElementObserver observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notifyUpdate() {
        for (GraphicElementObserver observer : this.observers) {
            observer.update(this);
        }
    }

    @Override
    public void update(GraphicElementSubject subject) {
    }
}
