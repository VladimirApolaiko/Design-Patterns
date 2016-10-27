package adapter.impl;

import adaptee.BodyParser;
import adaptee.HeaderParser;
import adaptee.SimpleHttpRequest;
import adapter.AdapterInterface;
import sun.nio.cs.UTF_32;

import java.util.List;
import java.util.Map;

/**
 * Created by vladimir on 10/25/16.
 */
public class AdapterImpl implements AdapterInterface {

    private BodyParser bodyParser = new BodyParser();
    private HeaderParser headerParser = new HeaderParser();


    @Override
    public SimpleHttpRequest buildRequest(String method, byte[] bodyData, List<String> rawHeaders) {
        String body = bodyParser.parseBody(bodyData, new UTF_32());
        Map<String, String> headers = headerParser.parseHeaders(rawHeaders);

        return new SimpleHttpRequest("GET", headers, body);
    }

}
