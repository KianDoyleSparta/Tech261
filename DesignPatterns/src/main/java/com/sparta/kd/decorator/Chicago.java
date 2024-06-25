package com.sparta.kd.decorator;

public class Chicago extends Pizza {

    @Override
    public String getDescription() {
        return "Chicago pizza";
    }

    @Override
    public double getCost() {
        return 30;
    }

}
