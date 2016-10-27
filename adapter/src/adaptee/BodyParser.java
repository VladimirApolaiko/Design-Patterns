package adaptee;


import java.nio.charset.Charset;

/**
 * Created by vladimir on 10/25/16.
 */
public class BodyParser {

    public String parseBody(byte[] body, Charset charset) {
        return new String(body, charset);
    }

}
