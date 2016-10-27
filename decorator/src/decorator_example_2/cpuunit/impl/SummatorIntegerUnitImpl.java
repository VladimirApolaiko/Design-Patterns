package decorator_example_2.cpuunit.impl;

import decorator_example_2.cpuunit.SummatorIntegerUnit;

/**
 * Created by vladimir on 10/26/16.
 */
public class SummatorIntegerUnitImpl implements SummatorIntegerUnit{
    @Override
    public long add(long value1, long value2) {
        return value1 + value2;
    }
}
