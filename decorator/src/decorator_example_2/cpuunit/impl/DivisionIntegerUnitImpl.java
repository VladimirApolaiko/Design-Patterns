package decorator_example_2.cpuunit.impl;

import decorator_example_2.cpuunit.DivisionIntegerUnit;

/**
 * Created by vladimir on 10/26/16.
 */
public class DivisionIntegerUnitImpl implements DivisionIntegerUnit {

    @Override
    public DevisionPair devide(long value1, long value2) {
        return new DevisionPair(value1 / value2, value1 % value2);
    }
}
