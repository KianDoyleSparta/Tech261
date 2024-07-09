package com.sparta.kd;

public class Dog extends Animal {
    public Dog(String name, String breed, int age) {
        super(name, breed, age);
    }

    public void play(String name) {
        System.out.println(name + " wants to play with " + super.getName());
    }

    @Override
    public void eat() {
        System.out.println("Dog is eating");
    }

    @Override
    public void drink() {

    }

    @Override
    public String gotToSleep() {
        return "";
    }
}
