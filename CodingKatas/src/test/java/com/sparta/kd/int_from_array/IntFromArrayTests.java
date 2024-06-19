package com.sparta.kd.int_from_array;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class IntFromArrayTests {

    @Test
    public void checkIntArrayReturnsIntConversion() {
        int[] input = {1, 2, 3};
        int expected = 123;
        int actual = IntFromArray.convertArrayToInt(input);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void checkIntArrayReturnsIntConversionWithoutLeadingZero() {
        int[] input = {0, 0, 2, 3};
        int expected = 23;
        int actual = IntFromArray.convertArrayToInt(input);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void checkIntArrayReturnsIntConversionWithDoubleDigitInts() {
        int[] input = {1, 22, 3};
        int expected = 1223;
        int actual = IntFromArray.convertArrayToInt(input);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void checkIntArrayReturnsIntConversionWithDoubleDigitIntsAndNoLeadingZero() {
        int[] input = {1, 0, 31};
        int expected = 1031;
        int actual = IntFromArray.convertArrayToInt(input);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void checkIntArrayReturnsIntConversionWithNegatives() {
        int[] input = {1, 3, -5};
        int expected = 135;
        int actual = IntFromArray.convertArrayToInt(input);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void checkIntArrayReturnsIntConversionAsZeroWhenEmptyInput() {
        int[] input = {};
        int expected = 0;
        int actual = IntFromArray.convertArrayToInt(input);
        Assertions.assertEquals(expected, actual);
    }

    // There are quite a few more parameters that I should have asked ICL, even just the seemingly obvious ones
}
