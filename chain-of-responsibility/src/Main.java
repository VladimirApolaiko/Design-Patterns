import handler.IHandler;
import handler.impl.BaseHandler;
import handler.impl.OneNumberHandler;
import handler.impl.ThreeNumberHandler;
import handler.impl.TwoNumberHandler;

/**
 * Created by vladimir on 10/25/16.
 */
public class Main {
    public static void main(String[] args) {

        IHandler handlersChain = BaseHandler.buildChain(new TwoNumberHandler(), new OneNumberHandler(), new ThreeNumberHandler());

        System.out.println(handlersChain.handle("hello"));
    }
}
