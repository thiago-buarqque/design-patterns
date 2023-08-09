package design.patterns.creational.prototype;

public interface Cloneable<T> {
    public T makeClone() throws CloneNotSupportedException;
}
