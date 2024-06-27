package com.sparta.kd;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

import java.time.LocalDate;
import java.util.stream.Stream;

public class SpartanTests {

//    @RepeatedTest(value = 10, name = "{displayName} repetition {currentRepetition} of {totalRepetitions}")
//    @DisplayName("Simple test")
//    void simpleTest() {
//        Assertions.assertEquals(1, 1);
//    }
//
//    @Test
////    @Disabled("Method to be completed")
//    @DisplayName("Check name of spartan")
//     void checkNameOfSpartan() {
//        Assumptions.assumeTrue(false);
//        Assertions.assertEquals(1, 1);
//    }

    private static Spartan manish;

    @BeforeAll
    static void setupAll(TestInfo testInfo) {
        manish = new Spartan(1, "Manish", "Java", LocalDate.now());
        System.out.println(testInfo.getDisplayName());
    }

    @BeforeEach
    void setup(TestInfo testInfo) {
        System.out.println(testInfo.getDisplayName());

    }

    @Test
//    @Disabled("Method to be completed")
    @DisplayName("Check name of spartan")
    void checkNameOfSpartan() {
        Assertions.assertEquals(1, 1);
    }

    @AfterEach
    void tearDown(TestInfo testInfo) {
        System.out.println(testInfo.getDisplayName());

    }

    @AfterAll
    static void tearDownAll(TestInfo testInfo) {
        System.out.println(testInfo.getDisplayName());

    }

    @ParameterizedTest
    @NullAndEmptySource
//    @CsvFileSource
//    @ValueSource
    @MethodSource("getListOfNames")
    void checkLengthOfString(String name) {
        Assertions.assertEquals(5, name.length());
    }

    public static Stream<Arguments> getListOfNames() {
        return Stream.of(
                Arguments.of("This", 2),
                Arguments.of("That", 4)
        );
    }


}
