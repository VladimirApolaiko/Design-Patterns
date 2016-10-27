package adaptee;

import java.util.Map;

/**
 * Created by vladimir on 10/25/16.
 */
public class SimpleHttpRequest {

    public String method;
    public Map<String, String> headers;
    public String body;

    public SimpleHttpRequest(String method, Map<String, String> headers, String body) {
        this.method = method;
        this.headers = headers;
        this.body = body;
    }
}
