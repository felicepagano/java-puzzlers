package it.fpagano.study.javapuzzlers.ch01;

public class Puzzle01 {

    /**
     * This version will not works correctly with negative numbers.
     * This is a consequence of the definition of Java’s remainder operator (%). 
     * It is defined to satisfy the following identity for all int values a and all nonzero int values b:
     * (a / b) * b + (a % b) == a   [JLS 15.17.3]
     * 
     * This identity makes perfect sense, but in combination with Java’s truncating integer division 
     * operator [JLS 15.17.2], it implies that when the remainder operation returns a nonzero result, 
     * it has the same sign as its left operand.
     * 
     * @param i
     * @return
     */
    public static boolean isOdd(int i) {
        return i % 2 == 1;
    }

    /**
     * This version will works correctly also with negative numbers.
     * @param i
     * @return
     */
    public static boolean isOddWorkWithNegativeNumber(int i) {
        return i % 2 != 0;
    }

    /**
     * This version will works correctly also with negative numbers
     * and will provide better performance.
     * 
     * As a general rule, the divide and remainder operations are slow compared to other arithmetic and logical operations
     * @param i
     * @return
     */
    public static boolean isOddPerformantVersion(int i) {
        return (i & 1) != 0;
    }
}