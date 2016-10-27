package decorator_example_2.cpu;

import decorator_example_2.cpuunit.DivisionIntegerUnit;
import decorator_example_2.cpuunit.MultiplierIntegerUnit;
import decorator_example_2.cpuunit.SummatorIntegerUnit;

/**
 * Created by vladimir on 10/26/16.
 */
public class IntegerCPU implements SummatorIntegerUnit, MultiplierIntegerUnit, DivisionIntegerUnit {

    private final SummatorIntegerUnit summator;
    private final MultiplierIntegerUnit multiplier;
    private final DivisionIntegerUnit divisionIntegerUnit;

    public IntegerCPU(SummatorIntegerUnit summator,
                      MultiplierIntegerUnit multiplier,
                      DivisionIntegerUnit divisionIntegerUnit) {

        this.summator = summator;
        this.multiplier = multiplier;
        this.divisionIntegerUnit = divisionIntegerUnit;
    }

    @Override
    public long add(long value1, long value2) {
        return summator.add(value1, value2);
    }

    @Override
    public long multiply(long value1, long value2) {
        return multiplier.multiply(value1, value2);
    }

    @Override
    public DevisionPair devide(long value1, long value2) {
        return divisionIntegerUnit.devide(value1, value2);
    }

    public void sleep() throws InterruptedException {
        Thread.sleep(Long.MAX_VALUE);
    }
}
