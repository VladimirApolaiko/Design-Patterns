import algorithm.Algorithm;
import algorithm.ConcreteAlgorithm1;
import algorithm.ConcreteAlgorithm2;

/**
 * Created by vladimir on 10/25/16.
 */
public class Main {
    public static void main(String[] args) {
        Algorithm algorithm1 = new ConcreteAlgorithm1();
        Algorithm algorithm2 = new ConcreteAlgorithm2();

        algorithm1.execute();
        algorithm2.execute();

    }
}
