package it.fpagano.study.javapuzzlers.ch01;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;

public class Puzzle02Test {

    @Test public void whenSubtractTwoDouble_ThenPrecisionIsLost() {
        assertNotEquals(0.9, Puzzle02.subtractTwoDouble(2.0, 1.1));
    }


    @Test public void whenSubtractTwoInt_ThenPrecisionIsOK() {
        assertEquals(90, Puzzle02.subtractTwoInt(200, 110));
    }


    @Test public void whenSubtractTwobigDecimal_ThenPrecisionIsOK() {
        assertEquals(new BigDecimal("0.9"), Puzzle02.subtractBigDecimal(new BigDecimal("2.0"), new BigDecimal("1.1")));
    }
}