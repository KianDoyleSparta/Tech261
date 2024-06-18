package com.sparta.kd;

import com.sun.source.tree.AssertTree;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

public class FizzBuzzTests {
    // Print numbers in order
    // If divisible by 3, print 'Fizz'
    // If divisible by 5, print 'Buzz'
    // If divisible by both 3 and 5, print 'FizzBuzz'
    @Test
    void givenInputOneFizzBuzzReturnsOne() {
        // Arrange
        int input = 1;
        String expected = "1";
        // Act
        String actual = FizzBuzz.getFizzBuzzFrom(input);
        // Assert
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({
            "1, 1",
            "2, 2",
            "3, Fizz",
            "4, 4",
            "5, Buzz",
            "7, 7",
            "15, FizzBuzz"
    })
    void givenInputsNotDivisibleByThreeOrFiveFizzBuzzReturnsThatNumber(int input, String expected) {
        String actual = FizzBuzz.getFizzBuzzFrom(input);
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @ValueSource(ints = {3, 6, 9})
    void givenInputThreeFizzBuzzReturnsFizz(int input) {
        String expected = "Fizz";

        String actual = FizzBuzz.getFizzBuzzFrom(input);

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @ValueSource(ints = {5, 10, 20})
    void givenInputFiveFizzBuzzReturnsBuzz(int input) {
        String expected = "Buzz";

        String actual = FizzBuzz.getFizzBuzzFrom(input);

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @ValueSource(ints = {15, 30, 45})
    void givenInputMultiple3And5FizzBuzzReturnsFizzBuzz(int input) {
        String expected = "FizzBuzz";

        String actual = FizzBuzz.getFizzBuzzFrom(input);

        Assertions.assertEquals(expected, actual);
    }

}



