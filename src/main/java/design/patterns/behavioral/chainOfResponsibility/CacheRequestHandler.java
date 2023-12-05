package design.patterns.behavioral.chainOfResponsibility;

public class CacheRequestHandler extends BaseRequestHandler {
    @Override
    public void handle(HttpRequest httpRequest) throws Exception {
        // checks for cache to speed up same requests

        handleNext(httpRequest);
    }
}
