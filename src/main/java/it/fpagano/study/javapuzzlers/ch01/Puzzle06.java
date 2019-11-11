package it.fpagano.study.javapuzzlers.ch01;

public class Puzzle06 {

    public static void main(String[] args) {
        char c = (char) -1;
        int i = c;
        System.out.println(i);
    }

    /**
     * The cast from byte to char is trickier because byte is a signed type and char unsigned.
     * It is usually possible to convert from one integral type to a wider one while preserving numerical value, 
     * but it is impossible to represent a negative byte value as a char
     * @return
     */
    public static int puzzle() {
        return (int) (char) (byte) -1;
    }

    public static int puzzle(int i) {
        return (int) (char) (byte) i;
    }
}