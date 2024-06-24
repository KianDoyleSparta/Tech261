package com.sparta.kd.palindrome_kata_part_2;

import com.sparta.kd.palindrome_kata.PalindromeChecker;

import java.util.ArrayList;
import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        String sentence = "This is a sentence that contains one palindrome: racecar, a false palindrome: race car, some special characters: !#*, a palindrome separated by special characters: pan!s#nap.";

        String sentenceEmpty = "";
        System.out.println(PalindromeChecker2.orderOfOperations(sentenceEmpty));

    }
}


