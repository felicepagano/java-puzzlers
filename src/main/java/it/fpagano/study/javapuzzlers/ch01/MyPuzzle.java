package it.fpagano.study.javapuzzlers.ch01;

public class MyPuzzle {

    public static void main(String[] args) {
        int big = 1234567890;
        float approx = big;
        // https://docs.oracle.com/javase/specs/jls/se7/html/jls-5.html
        // it will print -46 due to loss of precision
        System.out.println(big - (int) approx);
    }
}