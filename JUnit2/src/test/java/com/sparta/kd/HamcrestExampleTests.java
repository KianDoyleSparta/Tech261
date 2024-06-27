package com.sparta.kd;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class HamcrestExampleTests {
    private Spartan manish;

    @BeforeEach
    void setup() {
        manish = new Spartan(1, "Manish", "Java", LocalDate.of(2000, 1, 1));
    }

    @Nested
    @DisplayName("Hamcrest Spartan Tests")
    class hamcrestSpartanTests {
        @Test
        @DisplayName("Check that spartan is called Manish")
        void checkThatSpartanIsCalledManish() {
            assertThat(manish.getName(), equalTo("Manish"));
        }

        @Test
        @DisplayName("Check that spartan has a field called name")
        void checkThatSpartanHasAFieldCalledName() {
            assertThat(manish, hasProperty("name"));
        }

        @Test
        @DisplayName("Check that spartan has a field called course set to Java")
        void checkThatSpartanHasAFieldCalledCourseSetToJava() {
            assertThat(manish, hasProperty("course", equalTo("Java")));
        }
    }

    @Nested
    @DisplayName("Hamcrest String Methods")
    class HamcrestStringMethods {
        @Test
        @DisplayName("Check that name is not empty or null")
        void checkThatNameIsNotEmptyOrNull() {
            assertThat(manish.getName(), is(not(emptyOrNullString())));
        }

        @Test
        @DisplayName("Check that name ends with ish")
        void checkThatNameEndsWithIsh() {
            assertThat(manish.getName(), endsWith("ish"));
        }
    }

}
