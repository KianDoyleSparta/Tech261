package com.sparta.kd;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Lifter {

    private String name;
    private Lifts squat;
    private Lifts bench;
    private Lifts deadlift;

    public Lifter(String name, Lifts lift) {
        this.name = name;
        this.bench = lift;
    }

    public Lifter(String name, Lifts lift1, Lifts lift2, Lifts lift3) {
        this.name = name;
        this.squat = lift1;
        this.bench = lift2;
        this.deadlift = lift3;
    }

    public String getName() {
        return name;
    }

    public Lifts getSquat() {
        return squat;
    }

    public Lifts getBench() {
        return bench;
    }

    public Lifts getDeadlift() {
        return deadlift;
    }

    public boolean isBenchOnly() {
        if (this.getSquat() == null) {
            return true;
        }
        return false;
    }

    public boolean isThreeLift() {
        if (this.getSquat() != null) {
            return true;
        }
        return false;
    }

}
