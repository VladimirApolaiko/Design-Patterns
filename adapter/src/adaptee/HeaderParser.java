package adaptee;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by vladimir on 10/25/16.
 */
public class HeaderParser {

    public Map<String, String> parseHeaders(List<String> headers) {
        return headers.stream().map(header -> header.split(":"))
                .collect(Collectors.toMap(entry -> entry[0], entry -> entry[1]));
    }
}
