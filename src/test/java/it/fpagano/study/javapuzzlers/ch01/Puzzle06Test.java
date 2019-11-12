package it.fpagano.study.javapuzzlers.ch01;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class Puzzle06Test {

    @Test
    public void signExtensionTest() {
        assertFalse(-1 == Puzzle06.puzzle(-1));
    }

}