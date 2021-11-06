package com.tinnova.soma_multiplos.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MultiplosTest {
    @Test
    void getSumMultiplos_shouldReturnSumMultiplos3or5_whenMaxNumber10Informed() {
        int value = 10;
        int expected = 23;

        int result = Multiplos.getSumMultiplos3or5(value);

        Assertions.assertEquals(expected, result);
    }
}
