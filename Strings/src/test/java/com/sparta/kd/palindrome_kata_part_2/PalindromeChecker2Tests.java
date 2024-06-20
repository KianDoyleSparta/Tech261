package com.sparta.kd.palindrome_kata_part_2;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;

import java.util.ArrayList;
import java.util.Arrays;

public class PalindromeChecker2Tests {

    // Write a test to see if it returns a null array when given a null sentence
    // Write a test to see if it works on a single palindrome
    // Write a test to see if it works with two palindromes of a different length, returning the longest one
    // Write a test to see if it returns the longest palindrome in a sentence even when that palindrome is split by special characters
    // Write a test to see if it returns the longest palindrome in a sentence even when that palindrome is split by numbers
    // Write a test to see if it returns a empty when given a palindrome of numbers

    @Test
    @DisplayName("Checks to see if PalindromeChecker2 returns a null array when given a null sentence")
    public void checkPalindromeChecker2ReturnsNullWhenGivenNull() {
        String input = "";
        ArrayList<String> expected = new ArrayList<>();
        ArrayList<String> actual = PalindromeChecker2.orderOfOperations(input);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Checks to see if PalindromeChecker2 returns a palindrome")
    public void checkPalindromeChecker2ReturnsAPalindrome() {
        String input = "racecar";
        ArrayList<String> expected = new ArrayList<>(Arrays.asList("racecar"));
        ArrayList<String> actual = PalindromeChecker2.orderOfOperations(input);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Checks to see if PalindromeChecker2 returns the longest palindrome in the sentence")
        public void checkPalindromeChecker2ReturnsLongestPalindromInSentence() {
        String input = "racecar and manam";
        ArrayList<String> expected = new ArrayList<>(Arrays.asList("racecar"));
        ArrayList<String> actual = PalindromeChecker2.orderOfOperations(input);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Checks to see if PalindromeChecker2 returns the longest palindrome in the sentence even when split by special characters")
    public void checkPalindromeChecker2ReturnsLongestPalindromInSentenceWhenSplitWithSpecialChars() {
        String input = "race!#car and manam";
        ArrayList<String> expected = new ArrayList<>(Arrays.asList("racecar"));
        ArrayList<String> actual = PalindromeChecker2.orderOfOperations(input);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Checks to see if PalindromeChecker2 returns the longest palindrome in the sentence even when split by numbers")
    public void checkPalindromeChecker2ReturnsLongestPalindromInSentenceWhenSplitWithNumbers() {
        String input = "race1car and manam";
        ArrayList<String> expected = new ArrayList<>(Arrays.asList("racecar"));
        ArrayList<String> actual = PalindromeChecker2.orderOfOperations(input);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Checks to see if PalindromeChecker2 returns an empty list when given only numbers")
    public void checkPalindromeChecker2ReturnsEmptyWhenGivenNumbersOnly() {
        String input = "1111111111";
        ArrayList<String> expected = new ArrayList<>();
        ArrayList<String> actual = PalindromeChecker2.orderOfOperations(input);
        Assertions.assertEquals(expected, actual);
        Assertions.assertIterableEquals(expected, actual);
    }


}


