package com.sparta.kd;

public abstract class Trainee implements Trainable, Teachable {

    private String name;
    private int age;
    private String email;
    private String phone;

    @Override
    public void study() {
        Trainable.super.study();
    }

    @Override
    public void train() {
        Trainable.super.train();
    }
}
