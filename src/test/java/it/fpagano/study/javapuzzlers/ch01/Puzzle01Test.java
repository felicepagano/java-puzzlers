package it.fpagano.study.javapuzzlers.ch01;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

public class Puzzle01Test {

    @Test
    @DisplayName("if you compare the remainder with 1 the function will not works for negative numbers")
    public void whenNubersArePositive_ThenFirstOddVersionMustWorks() {
        assertTrue(Puzzle01.isOdd(3));
        assertFalse(Puzzle01.isOdd(2));
        assertFalse(Puzzle01.isOdd(-3));
        assertFalse(Puzzle01.isOdd(-2));
    }

    @Test
    @DisplayName("you should compare the remainder to be different from 0 in order to be able to use also negative numbers")
    public void fixedOddVersionMustWorksWithAllNumbers() {
        assertTrue(Puzzle01.isOddWorkWithNegativeNumber(3));
        assertFalse(Puzzle01.isOddWorkWithNegativeNumber(2));
        assertTrue(Puzzle01.isOddWorkWithNegativeNumber(-3));
        assertFalse(Puzzle01.isOddWorkWithNegativeNumber(-2));
    }

    @Test
    @DisplayName("bitwise operation is more performant than division. you can check if a number is odd just checking the last bit")
    public void performanceFixedOddVersionMustWorksWithAllNumbers() {
        assertTrue(Puzzle01.isOddPerformantVersion(3));
        assertFalse(Puzzle01.isOddPerformantVersion(2));
        assertTrue(Puzzle01.isOddPerformantVersion(-3));
        assertFalse(Puzzle01.isOddPerformantVersion(-2));
    }
}