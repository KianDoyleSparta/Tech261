package com.sparta.kd;

import java.util.ArrayList;
import java.util.Arrays;

public class FunctionalExample {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>(Arrays.asList(
                "Leonardo",
                "Michelangelo",
                "Donatello",
                "Raphael"));

        // Something -> Stream -> Real
        names.stream()
                .map(String::toUpperCase)
//                .peek(name -> System.out.println(name))
                .filter(name -> name.contains("O"))
                .forEach(System.out::println);

    }
}
