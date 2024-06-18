package com.sparta.kd;

public class App {
    public static void main(String[] args) {
        Dog dog = new Dog("Max", "Husky", 3);
        Cat cat = new Cat("Beans", "Tabby", 4);

        cat.play();
        dog.play();
        dog.play(cat.getName());
    }
}
