package decorator_example_2;

import decorator_example_2.cpu.IntegerCPU;
import decorator_example_2.cpuunit.impl.DivisionIntegerUnitImpl;
import decorator_example_2.cpuunit.impl.MultiplierIntegerUnitImpl;
import decorator_example_2.cpuunit.impl.SummatorIntegerUnitImpl;

/**
 * Created by vladimir on 10/26/16.
 */
public class Main {
    public static void main(String[] args) {
        IntegerCPU integerCPU = new IntegerCPU(new SummatorIntegerUnitImpl(), new MultiplierIntegerUnitImpl(), new DivisionIntegerUnitImpl());
    }
}
