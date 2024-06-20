package com.sparta.kd;

public class StringExample {
    public static void main(String[] args) {
        String string1 = "Hello";
        string1 = string1.toUpperCase(); // Immutable
        System.out.println(string1);

        System.out.println(string1.toCharArray());

        String name = "Manish";
        System.out.println("Hello " + name); // Creates 3 Strings with these 2 lines, "Manish", "Hello", and "Hello Manish"

        StringBuilder stringBuilder = new StringBuilder(); // Creates and deletes Strings in memory behind the scenes - Gives the illusion of mutable strings
        StringBuffer stringBuffer = new StringBuffer(); // Only difference: this is thread safe - possible to use when multiple processes are acting on a string



    }
}
