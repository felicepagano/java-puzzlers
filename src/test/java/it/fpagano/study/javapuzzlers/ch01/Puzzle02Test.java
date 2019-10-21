package it.fpagano.study.javapuzzlers.ch01;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import java.math.BigDecimal;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Puzzle02Test {

    @Test
    @DisplayName("subtracting two doubles will cause lost precision") 
    public void whenSubtractTwoDouble_ThenPrecisionIsLost() {
        assertNotEquals(0.9, Puzzle02.subtractTwoDouble(2.0, 1.1));
    }


    @Test 
    @DisplayName("integer or long could be a solution in order to perform a subtraction in cents")
    public void whenSubtractTwoInt_ThenPrecisionIsOK() {
        assertEquals(90, Puzzle02.subtractTwoInt(200, 110));
    }


    @Test 
    @DisplayName("BigDecimal is the right type in order to preserve precision. Use the string constructor")
    public void whenSubtractTwobigDecimal_ThenPrecisionIsOK() {
        assertEquals(new BigDecimal("0.9"), Puzzle02.subtractBigDecimal(new BigDecimal("2.0"), new BigDecimal("1.1")));
    }
}