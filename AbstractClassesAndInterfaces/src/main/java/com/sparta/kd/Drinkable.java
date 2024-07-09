package com.sparta.kd;

public interface Drinkable extends Sleepable {
    int max = 10; // interface variables are constant
    void drink();

    default void print() {
        printFromInterface();
    }

    private static void printFromInterface() {
        System.out.println("I am printing from an interface");
    }

    static void doSomething() {
        System.out.println("Static method from an interface");
    }
}
