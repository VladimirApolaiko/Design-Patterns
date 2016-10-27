package algorithm;

import java.util.Random;

/**
 * Created by vladimir on 10/25/16.
 */
public class ConcreteAlgorithm1 extends Algorithm {

    @Override
    public int stage1() {
        return new Random().nextInt();
    }
}
