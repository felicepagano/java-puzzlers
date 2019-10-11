package it.fpagano.study.javapuzzlers.ch01;

/**
 * Long division
 */
public class Puzzle03 {

    /**
     The problem is that the computation of the constant MICROS_PER_DAY does overflow. 
     Although the result of the computation fits in a long with room to spare, it doesn’t fit in an int

     Java Does not have a <i>target typing</i>
    */
    private static final long MILLIS_PER_DAY = 24 * 60 * 60 * 1000 * 1000;
    private static final long MICROS_PER_DAY = 24 * 60 * 60 * 1000;

    private final static long MILLIS_PER_DAY_RIGHT_VALUE = 24L * 60 * 60 * 1000 * 1000;

    /**
     * @return this operation will return 5 because MILLIS_PER_DAY overflow
     */
    public long divisionWithOverflowInt() {
        return MICROS_PER_DAY / MILLIS_PER_DAY;
    }

    /**
     * @return this operation will return 1000. no overflow here.
     */
    public long divisionWithRightvalue() {
        return MICROS_PER_DAY / MILLIS_PER_DAY_RIGHT_VALUE;
    }
}