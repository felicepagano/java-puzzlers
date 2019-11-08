package it.fpagano.study.javapuzzlers.ch01;

public class Puzzle05 {
    
    /**
     * Adds two hexadecimal literals and return the result in hex.
     * Consider that long can contains 16 exadecimal digits (2^63 -1 = 9223372036854775807 = 0x7FFFFFFFFFFFFFFF)
     * int = 2^31 - 1 = 2147483647 = 0x7FFFFFFF 
     * So overflow is not an issue.
     * Negative decimal constants are clearly identifiable by the presence of a minus sign.
     * Hex and octal literals are negative if their high-order bit is set.
     * In this case 0xcafebabe is an int with its high-order bit set, so it is negative -889275714.
     * Long.toHexString(0xcafebabe); ==> "ffffffffcafebabe"
     * 0xFFFFFFFF viewed as an int is -1
     * Long.toHexString(0xcafebabeL); ==> "cafebabe"
     * for 0x100000000L the high-order 32 bits is 1.
     * @return
     */
    public static String sumTwoHexString() {
        return Long.toHexString(0x100000000L + 0xcafebabe);
    }

    public static String sumTwoHexString(long i) {
        return Long.toHexString(i);
    }
}