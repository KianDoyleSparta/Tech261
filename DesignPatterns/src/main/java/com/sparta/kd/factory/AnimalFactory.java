package com.sparta.kd.factory;

public class AnimalFactory {



    public static Speakable getAnimal(String animal) {
        return switch (animal) {
            case "Dog" -> new Dog();
            case "Cat" -> new Cat();
            case "Goldfish" -> new Goldfish();
            default -> null;
        };
    }

}
