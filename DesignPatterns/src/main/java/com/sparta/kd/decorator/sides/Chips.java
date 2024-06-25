package com.sparta.kd.decorator.sides;

import com.sparta.kd.decorator.Pizza;

public class Chips extends Sides {
    public Chips(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + " and chips";
    }

    @Override
    public double getCost() {
        return pizza.getCost() + 20;
    }
}
