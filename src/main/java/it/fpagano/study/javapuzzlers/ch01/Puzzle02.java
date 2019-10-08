package it.fpagano.study.javapuzzlers.ch01;

import java.math.BigDecimal;

public class Puzzle02 {
    
    /**
     * Floating-point arithmetic provides good approximations over a wide range of
     * values but does not generally yield exact results. 
     * Binary floating-point is particularly ill-suited to monetary calculations, as it is 
     * impossible to represent 0.1—or any other negative power of 10—exactly as a 
     * finite-length binary fraction [EJ Item 31].
     */
    public static double subtractTwoDouble(double d1, double d2) {
        return d1 - d2;
    }

    /**
     * One way to solve the problem is to use an integral type, such as int or long, and to perform 
     * the computation in cents.
     */
    public static int subtractTwoInt(int i1, int i2) {
        return i1 - i2;
    }

    /**
     * Always use the BigDecimal(String) constructor, never BigDecimal(double). 
     * The latter constructor creates an instance with the exact value of its argument: 
     * new BigDecimal(.1) returns a BigDecimal representing 
     * 0.1000000000000000055511151231257827021181583404541015625. 
     * Using BigDecimal correctly, the program prints the expected result of 0.90
     */
    public static BigDecimal subtractBigDecimal(String b1, String b2) {
        return new BigDecimal(b1).subtract(new BigDecimal(b2));
    }

    
}