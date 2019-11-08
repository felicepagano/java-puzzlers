package it.fpagano.study.javapuzzlers.ch01;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class Puzzle05Test {

    @Test
    public void sumHexLiteralsMixing() {
        String result = Puzzle05.sumTwoHexString(0x100000000L + 0xcafebabe);
        String expectedResult = "1cafebabe";
        String wrongResult = "cafebabe";
        assertNotEquals(expectedResult, result);
        assertEquals(wrongResult, result);        
    }

    @Test
    public void sumHexLiteralsNoMixing() {
        // notice the L at the end of cafebabe
        String result = Puzzle05.sumTwoHexString(0x100000000L + 0xcafebabeL);
        String expectedResult = "1cafebabe";
        assertEquals(expectedResult, result);        
    }
}