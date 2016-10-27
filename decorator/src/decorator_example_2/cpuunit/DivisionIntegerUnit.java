package decorator_example_2.cpuunit;

/**
 * Created by vladimir on 10/26/16.
 */
public interface DivisionIntegerUnit {

    DevisionPair devide(long value1, long value2);


    class DevisionPair {

        public DevisionPair(long remainderOfDivision, long integerPart) {
            this.remainderOfDivision = remainderOfDivision;
            this.integerPart = integerPart;
        }

        long remainderOfDivision;
        long integerPart;
    }
}
