package design.patterns.behavioral.observer;

public interface GraphicElementSubject {
    public void attach(GraphicElementObserver observer);
    public void detach(GraphicElementObserver observer);
    public void notifyUpdate();
}
