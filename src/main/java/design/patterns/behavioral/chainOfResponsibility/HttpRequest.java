package design.patterns.behavioral.chainOfResponsibility;

import lombok.AllArgsConstructor;

import java.util.Map;

@AllArgsConstructor
public class HttpRequest {
    private Map<String, String> headers;
    private Map<String, Object> formData;

    public Map<String, String> getHeaders() {
        return headers;
    }

    public Map<String, Object> getFormData() {
        return formData;
    }
}
