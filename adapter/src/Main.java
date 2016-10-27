import adaptee.BodyParser;
import adaptee.HeaderParser;
import adaptee.SimpleHttpRequest;
import adapter.AdapterInterface;
import adapter.impl.AdapterImpl;
import sun.nio.cs.UTF_32;

import java.util.List;
import java.util.Map;

import static java.util.Arrays.asList;

/**
 * Created by vladimir on 10/25/16.
 */
public class Main {
    public static void main(String[] args) {

        byte[] bytes = {0, 1, 0, 10, 0, 33, 44, 113, 4, 127};
        List<String> rawHeaders = asList("MimeType: text/plain");


        //To build from data above we need to convert it firstly
        String body = new BodyParser().parseBody(bytes, new UTF_32());
        Map<String, String> headers = new HeaderParser().parseHeaders(rawHeaders);
        SimpleHttpRequest request1 = new SimpleHttpRequest("GET", headers, body);

        //Here we don't need to convert data to other type,
        // here we can build SimpleHttpRequest with data as is
        AdapterInterface adapter = new AdapterImpl();
        SimpleHttpRequest request2 = adapter.buildRequest("POST", bytes, rawHeaders);
    }

}
