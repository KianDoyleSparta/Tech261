package com.sparta.kd;

public class App {
    public static void main(String[] args) {
        Animal dog = new Dog("Max", "Husky", 3);
        Animal cat = new Cat("Beans", "Tabby", 4);

        Animal[] animals = {dog, cat};

        cat.play();
        dog.play();

    }
}