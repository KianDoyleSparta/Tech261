package com.sparta.kd;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NameSorter {

    // Write a method that takes in an ArrayList of names
    // and returns another ArrayList containing
    // all the names containing exactly two vowels

    public static ArrayList<String> namesThatHaveOnlyTwoVowels(ArrayList<String> names) {

        List list = names.stream()
                .filter(name -> name.matches("([A-z^AEIOUaeiou]*[AEIOUaeiou]){1}[A-z^AEIOUaeiou]*([AEIOUaeiou]){1}[A-z^AEIOUaeiou]*"))
                .toList();

        return new ArrayList<String>(list);
    }

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>(Arrays.asList("Name", "Bran", "Goff", "Jake", "Anton"));

        System.out.println(namesThatHaveOnlyTwoVowels(names).toString());

    }
}
