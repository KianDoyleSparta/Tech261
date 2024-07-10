package com.sparta.kd;

import java.util.Optional;

public class App {
    public static void main(String[] args) {
        Optional<String> name = Optional.of("Hello");

        if (name.isPresent()) {
            System.out.println(name.get());
        }

        name.ifPresent(System.out::println);
    }
}
