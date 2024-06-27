package com.sparta.kd;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        Lifter julius = new Lifter("Julius Maddox", Lifts.BENCH);
        Lifter erholove = new Lifter("Erholove John", Lifts.SQUAT, Lifts.BENCH, Lifts.DEADLIFT);

        if (erholove.isBenchOnly()) {
            System.out.println(erholove.getName() + " competes as a bench only athlete");
        } else {
            System.out.println(erholove.getName() + " competes as a full power athlete");
        }

        if (julius.isBenchOnly()) {
            System.out.println(julius.getName() + " competes as a bench only athlete");
        } else {
            System.out.println(julius.getName() + " competes as a full power athlete");
        }

    }
}
