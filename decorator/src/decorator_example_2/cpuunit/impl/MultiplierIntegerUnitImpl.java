package decorator_example_2.cpuunit.impl;

import decorator_example_2.cpuunit.MultiplierIntegerUnit;

/**
 * Created by vladimir on 10/26/16.
 */
public class MultiplierIntegerUnitImpl implements MultiplierIntegerUnit {
    @Override
    public long multiply(long value1, long value2) {
        return value1 * value2;
    }
}
