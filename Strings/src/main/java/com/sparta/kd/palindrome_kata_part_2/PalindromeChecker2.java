package com.sparta.kd.palindrome_kata_part_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class PalindromeChecker2 {

    public static String cleanSentence(String input) {
        return input.replaceAll("[^\\dA-Za-z ]", "").replaceAll("[0-9]", "");
    }

    public static String toLowerCase(String input) {
        return input.toLowerCase();
    }

    public static String[] splitSentence(String input) {
        return input.split(" ");
    }

    public static boolean isPalindrome(String input) {
        String flippedInput = flipString(input);
        return input.equals(flippedInput);
    }

    public static String flipString(String input) {
        StringBuilder flippedInputBuilder = new StringBuilder(input);
        StringBuilder flippedInput = flippedInputBuilder.reverse();
        return String.valueOf(flippedInput);
    }

    public static ArrayList<String> getPalindromesAndRemoveSmallWords(String[] words) {
        ArrayList<String> wordsArray = new ArrayList<>(Arrays.asList(words));
        wordsArray.removeIf(word -> !isPalindrome(word));
        if (!wordsArray.isEmpty()) {
            wordsArray.removeIf(word -> word.length() < 3);
        }
        return wordsArray;
    }

    public static ArrayList<String> getLongestPalindrome(ArrayList<String> palindromes) {
        int longestPalindromeLength = Collections.max(palindromes).length();
        palindromes.removeIf(palindrome -> palindrome.length() < longestPalindromeLength);
        return palindromes;
    }

    public static ArrayList<String> removeDuplicates(ArrayList<String> palindromes) {
        ArrayList<String> cleanPalindromes = new ArrayList<>();
        for (String palindrome : palindromes) {
            if (!cleanPalindromes.contains(palindrome)) {
                cleanPalindromes.add(palindrome);
            }
        }

        return cleanPalindromes;
    }

    public static ArrayList<String> orderOfOperations(String sentence) {
        String cleanSentence = PalindromeChecker2.cleanSentence(sentence);
        String lowerCleanSentence = PalindromeChecker2.toLowerCase(cleanSentence);
        String[] words = PalindromeChecker2.splitSentence(lowerCleanSentence);
        ArrayList<String> palindromes = PalindromeChecker2.getPalindromesAndRemoveSmallWords(words);
        ArrayList<String> longestPalindromes = PalindromeChecker2.getLongestPalindrome(palindromes);
        ArrayList<String> cleanedPalindromes = PalindromeChecker2.removeDuplicates(longestPalindromes);

        return cleanedPalindromes;
    }

}
