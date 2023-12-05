package design.patterns.behavioral.chainOfResponsibility;

public class SanitizeRequestHandler extends BaseRequestHandler {

    @Override
    public void handle(HttpRequest httpRequest) throws Exception {
        sanitize(httpRequest);

        handleNext(httpRequest);
    }

    private void sanitize(HttpRequest httpRequest) {
        // Do stuff
    }
}
