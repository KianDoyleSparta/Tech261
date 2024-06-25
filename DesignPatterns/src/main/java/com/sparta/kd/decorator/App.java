package com.sparta.kd.decorator;

import com.sparta.kd.decorator.sides.Chips;
import com.sparta.kd.decorator.sides.Salad;

public class App {

    public static void main(String[] args) {
        Italian italian = new Italian();
        System.out.println(italian.getDescription() + " Cost: " + italian.getCost());

        Salad salad = new Salad(italian);
        System.out.println(salad.getDescription() + " Cost: " + salad.getCost());

        Chips chips = new Chips(salad);
        System.out.println(chips.getDescription() + " Cost: " + chips.getCost());

    }
}
