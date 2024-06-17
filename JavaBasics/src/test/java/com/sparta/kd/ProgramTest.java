package com.sparta.kd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ProgramTest {
    @Test
    @DisplayName("Given a time of 21, then the greeting should be Good Evening!")
    void checkThat21GivesGoodEvening() {
        int time = 21;
        String expectedGreeting = "Good evening!";
        String actualGreeting = Program.getGreeting(time);
        Assertions.assertEquals(expectedGreeting, actualGreeting);
    }

    @Test
    @DisplayName("Given a time of 8, then the greeting should be Good morning!")
    void checkThat8GivesGoodMorning() {
        int time = 8;
        String expectedGreeting = "Good morning!";
        String actualGreeting = Program.getGreeting(time);
        Assertions.assertEquals(expectedGreeting, actualGreeting);
    }

    @Test
    @DisplayName("Given a time of 17, then the greeting should be Good Afternoon")
    void check17GivesGoodAfternoon() {
        int time = 17;
        String expectedGreeting = "Good afternoon!";
        String actualGreeting = Program.getGreeting(time);
        Assertions.assertEquals(expectedGreeting, actualGreeting);
    }

    @Test
    @DisplayName("Given a time of 12, then the greeting should be Good Afternoon")
    void check12GivesGoodAfternoon() {
        int time = 12;
        String expectedGreeting = "Good afternoon!";
        String actualGreeting = Program.getGreeting(time);
        Assertions.assertEquals(expectedGreeting, actualGreeting);
    }

    @Test
    @DisplayName("Given negative time value, then an error message should be thrown")
    void checkTimeAsANegativeValue() {
        int time = -1;
        //invalid time test
        String expectedGreeting = "error";
        String actualGreeting = Program.getGreeting(time);
        Assertions.assertEquals(expectedGreeting, actualGreeting);
    }

}

