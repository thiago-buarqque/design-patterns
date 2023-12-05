package design.patterns.behavioral.chainOfResponsibility;

public abstract class BaseRequestHandler implements RequestHandler{
    protected RequestHandler nextHandler;

    @Override
    public void setNext(RequestHandler requestHandler) {
        this.nextHandler = requestHandler;
    }

    protected void handleNext(HttpRequest httpRequest) throws Exception {
        if(this.nextHandler != null) {
            this.nextHandler.handle(httpRequest);
        }
    }
}
