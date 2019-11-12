package it.fpagano.study.javapuzzlers.ch01;

public class Puzzle09 {
 
    /**
     * x +=y; is equivalent to x = (short) (x + y) 
     * compound assignment operator automatically cast to the type of the variable on their left-hand side.
     * this is different from x = x + y; because of the cast. in fact this expression will fails.
     * 
     * the result will silently lops off the two high-order bytes 
     */
    public static short compilerFAilure() {
        short x = 0;
        int y = 123456;
        //x = x + y; compilation error
        x +=y; //equivalent to x = (short) (x + y) compound assignment operator automatically cast to the to the type of the variable on their left-hand side
        return x;
    }
}