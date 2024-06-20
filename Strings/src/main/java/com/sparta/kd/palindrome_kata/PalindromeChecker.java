package com.sparta.kd.palindrome_kata;

public class PalindromeChecker {

    public static boolean isPalindrome(String input) {

        boolean isPalindrome = false;

        String lowerCaseInput = input.toLowerCase();
        String flippedInput = flipString(lowerCaseInput);

        if (lowerCaseInput.equals(flippedInput)) {
            isPalindrome = true;
        }

        if (lowerCaseInput.length() < 3 || lowerCaseInput.contains(" ") || lowerCaseInput.matches(".*[0-9].*")) {
            isPalindrome = false;
        }

        return isPalindrome;
    }

    public static String flipString(String input) {

//        StringBuilder flippedString = new StringBuilder();
//        char[] charArrayInput = input.toCharArray();
//
//        for (char letter: charArrayInput) {
//            flippedString.insert(0, letter);
//        }

        StringBuilder inputBuilder = new StringBuilder(input);

        StringBuilder flippedInputBuilder = inputBuilder.reverse();

        return String.valueOf(flippedInputBuilder);
    }

}
