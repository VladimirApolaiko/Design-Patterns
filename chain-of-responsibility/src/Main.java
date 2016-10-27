import handler.*;
import handler.impl.BaseHandler;
import handler.impl.OneNumberHandler;
import handler.impl.TwoNumberHandler;
import handler.impl.ThreeNumberHandler;

import static java.util.Arrays.asList;

/**
 * Created by vladimir on 10/25/16.
 */
public class Main {
    public static void main(String[] args) {

        IHandler handlersChain = BaseHandler.buildChain(asList(new TwoNumberHandler(), new OneNumberHandler(), new ThreeNumberHandler()));

        System.out.println(handlersChain.handle("hello"));
    }
}
