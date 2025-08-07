package com.example.builder;

public class HTTPRequest {

	// Required fields
    private final String url;
    private final String method;

    // Optional fields
    private final String body;
    private final String contentType;
    private final int timeout;

    // Private constructor: Only Builder can access this
    private HTTPRequest(Builder builder) {
        this.url = builder.url;
        this.method = builder.method;
        this.body = builder.body;
        this.contentType = builder.contentType;
        this.timeout = builder.timeout;
    }

    // Getters (optional)
    public String getUrl() { return url; }
    public String getMethod() { return method; }
    public String getBody() { return body; }
    public String getContentType() { return contentType; }
    public int getTimeout() { return timeout; }

    // For easy printing
    @Override
    public String toString() {
        return "HttpRequest{" +
                "url='" + url + '\'' +
                ", method='" + method + '\'' +
                ", body='" + body + '\'' +
                ", contentType='" + contentType + '\'' +
                ", timeout=" + timeout +
                '}';
    }

    // 2. Static Nested Builder Class
    public static class Builder {
        // Required fields
        private final String url;
        private final String method;

        // Optional fields - initialized to default values
        private String body = "";
        private String contentType = "text/plain";
        private int timeout = 1000;

        // Builder constructor with required fields
        public Builder(String url, String method) {
            this.url = url;
            this.method = method;
        }

        // Setters for optional fields (return builder)
        public Builder body(String body) {
            this.body = body;
            return this;
        }

        public Builder contentType(String contentType) {
            this.contentType = contentType;
            return this;
        }

        public Builder timeout(int timeout) {
            this.timeout = timeout;
            return this;
        }

        // Build method to return the final HttpRequest object
        public HTTPRequest build() {
            return new HTTPRequest(this);
        }
    }
    
}
