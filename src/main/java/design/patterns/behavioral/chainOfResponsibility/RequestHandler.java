package design.patterns.behavioral.chainOfResponsibility;

public interface RequestHandler {
    public void setNext(RequestHandler requestHandler);
    public void handle(HttpRequest httpRequest) throws Exception;
}
