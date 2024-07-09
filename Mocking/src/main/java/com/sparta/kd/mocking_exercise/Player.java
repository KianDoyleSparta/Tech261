package com.sparta.kd.mocking_exercise;

public record Player(String name,
                     String type,
                     int strength,
                     int speed,
                     int intelligence,
                     int max_hp,
                     int current_hp) {

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", strength=" + strength +
                ", speed=" + speed +
                ", intelligence=" + intelligence +
                ", max_hp=" + max_hp +
                ", current_hp=" + current_hp +
                '}';
    }
}
