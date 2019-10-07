package it.fpagano.study.javapuzzlers.ch01;

import org.junit.jupiter.api.Test;

import it.fpagano.study.javapuzzlers.ch01.Puzzle01;

import static org.junit.jupiter.api.Assertions.*; 

public class Puzzle01Test {

    @Test public void whenNubersArePositive_ThenFirstOddVersionMustWorks() {
        assertTrue(Puzzle01.isOdd(3));
        assertFalse(Puzzle01.isOdd(2));
    }

    @Test public void whenNubersAreNegative_ThenFirstOddVersionMustNotWorks() {
        assertFalse(Puzzle01.isOdd(-3));
        assertFalse(Puzzle01.isOdd(-2));
    }

    @Test public void fixedOddVersionMustWorksWithAllNumbers() {
        assertTrue(Puzzle01.isOddWorkWithNegativeNumber(3));
        assertFalse(Puzzle01.isOddWorkWithNegativeNumber(2));
        assertTrue(Puzzle01.isOddWorkWithNegativeNumber(-3));
        assertFalse(Puzzle01.isOddWorkWithNegativeNumber(-2));
    }

    @Test public void performanceFixedOddVersionMustWorksWithAllNumbers() {
        assertTrue(Puzzle01.isOddPerformantVersion(3));
        assertFalse(Puzzle01.isOddPerformantVersion(2));
        assertTrue(Puzzle01.isOddPerformantVersion(-3));
        assertFalse(Puzzle01.isOddPerformantVersion(-2));
    }
}