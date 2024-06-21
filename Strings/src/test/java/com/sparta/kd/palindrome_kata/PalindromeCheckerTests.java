package com.sparta.kd.palindrome_kata;

import org.testng.annotations.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;

public class PalindromeCheckerTests {

    @Test
    @DisplayName("Checks if isPalindrome returns true if the input is a palindrome")
    public void checkIfIsPalindromeReturnsTrueIfPalindrome() {
        String input = "racecar";
        boolean expected = true;
        boolean actual = PalindromeChecker.isPalindrome(input);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Checks if isPalindrome returns false if the input is not a palindrome")
    public void checkIfIsPalindromeReturnsFalseIfNotPalindrome() {
        String input = "hello";
        boolean expected = false;
        boolean actual = PalindromeChecker.isPalindrome(input);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Checks if isPalindrome returns false if the input is a palindrome but contains spaces")
    public void checkIfIsPalindromeReturnsFalseIfPalindromeButContainsSpaces() {
        String input = "race car";
        boolean expected = false;
        boolean actual = PalindromeChecker.isPalindrome(input);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Checks if isPalindrome returns false if the input is empty")
    public void checkIfIsPalindromeReturnsFalseIfInputIsEmpty() {
        String input = "";
        boolean expected = false;
        boolean actual = PalindromeChecker.isPalindrome(input);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Checks if isPalindrome returns true if the input is a palindrome")
    public void checkIfIsPalindromeReturnsFalseIfInputIsLessThanThree() {
        String input = "aa";
        boolean expected = false;
        boolean actual = PalindromeChecker.isPalindrome(input);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Checks if isPalindrome returns false if the input is a palindrome but contains spaces")
    public void checkIfIsPalindromeReturnsFalseIfPalindromeButContainsSpacesAtEvenIntervals() {
        String input = "maa aam";
        boolean expected = false;
        boolean actual = PalindromeChecker.isPalindrome(input);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Checks if isPalindrome returns false if the input contains numbers")
    public void checkIfIsPalindromeReturnsFalseIfInputContainsNumbers() {
        String input = "77777";
        boolean expected = false;
        boolean actual = PalindromeChecker.isPalindrome(input);
        Assertions.assertEquals(expected, actual);
    }
}
