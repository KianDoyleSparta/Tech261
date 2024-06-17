package com.sparta.kd;

// Read, maintain, test
public class Program {
    // A method in Java should do ONLY A SINGLE job
    // Refactoring - don't change what the code does - change the way it does it
    public static void main(String[] args) { // entry point - methods NOT functions
        int timeOfDay = 21; // strongly typed - variables MUST be declared with a type // statically typed - variables cannot have a mismatched type and value
        getGreeting(timeOfDay);
    }

    private static void getGreeting(int timeOfDay) {
        if (timeOfDay >= 5 && timeOfDay <= 12) { // if statement - control flow
            System.out.println("Good morning!");
        } else if (timeOfDay >= 12 && timeOfDay <= 18) {
            System.out.println("Good afternoon!");
        } else {
            System.out.println("Good evening!");
        }
    }
}