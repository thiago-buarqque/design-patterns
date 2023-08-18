package design.patterns.creational.prototype.graphic.element;

import design.patterns.behavioral.observer.GraphicElementObserver;
import design.patterns.behavioral.observer.GraphicElementSubject;
import design.patterns.creational.prototype.Cloneable;

public interface GraphicElement extends Cloneable<GraphicElement>, GraphicElementObserver, GraphicElementSubject {
    public String getId();
    public String getName();
}
