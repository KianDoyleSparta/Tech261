package com.sparta.kd;

import com.sun.source.tree.AssertTree;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

public class FizzBuzzTests {
    @ParameterizedTest
    @CsvSource({
            "1, 1",
            "2, 2",
            "4, 4",
            "7, 7",
    })
    void givenInputsNotDivisibleByThreeOrFiveFizzBuzzReturnsThatNumber(int input, String expected) {
        String actual = FizzBuzz.getFizzBuzzFrom(input);
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({
            "3, Fizz",
            "6, Fizz",
            "9, Fizz"
    })
    void givenInputsDivisibleByThreeFizzBuzzReturnsFizz(int input, String expected) {
        String actual = FizzBuzz.getFizzBuzzFrom(input);
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({
            "5, Buzz",
            "10, Buzz",
            "20, Buzz"
    })
    void givenInputDivisibleByFiveFizzBuzzReturnsBuzz(int input, String expected) {
        String actual = FizzBuzz.getFizzBuzzFrom(input);
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({
            "15, FizzBuzz",
            "30, FizzBuzz",
            "45, FizzBuzz"
    })
    void givenInputDivisibleByThreeAndFiveFizzBuzzReturnsFizzBuzz(int input, String expected) {
        String actual = FizzBuzz.getFizzBuzzFrom(input);
        Assertions.assertEquals(expected, actual);
    }

}

