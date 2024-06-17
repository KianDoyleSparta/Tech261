package com.sparta.kd;

// Read, maintain, test
public class Program {
    // A method in Java should do ONLY A SINGLE job
    // Refactoring - don't change what the code does - change the way it does it
    public static void main(String[] args) { // entry point - methods NOT functions
        int timeOfDay = 21; // strongly typed - variables MUST be declared with a type // statically typed - variables cannot have a mismatched type and value
        System.out.println(getGreeting(timeOfDay));
    }

    // Comments shouldn't explain what code does, they should be used to remind yourself of your work
    public static String getGreeting(int timeOfDay) {
        String greeting;
        if (timeOfDay < 0) {
            greeting = "Invalid value";
        } else if (timeOfDay >= 5 && timeOfDay < 12) {
          greeting = "Good morning!";
        } else if (timeOfDay >= 12 && timeOfDay <= 18) {
            greeting = "Good afternoon!";
        } else {
          greeting = "Good evening!";
        }
        return greeting;
    }
}
