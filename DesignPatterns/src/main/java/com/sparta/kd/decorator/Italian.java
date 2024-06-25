package com.sparta.kd.decorator;

public class Italian extends Pizza {

    @Override
    public String getDescription() {
        return "Italian pizza";
    }

    @Override
    public double getCost() {
        return 20;
    }

}
