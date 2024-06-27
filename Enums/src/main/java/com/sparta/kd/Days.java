package com.sparta.kd;

import java.util.Arrays;

public enum Days {
    MONDAY("MONDAY", 1),
    TUESDAY("TUESDAY", 2),
    WEDNESDAY("WEDNESDAY", 3),
    THURSDAY("THURSDAY", 4),
    FRIDAY("FRIDAY", 5),
    SATURDAY("SATURDAY", 6),
    SUNDAY("SUNDAY", 7);

//    public static void main(String[] args) {
//        Days dayOff = Days.FRIDAY;
//
//        System.out.println(dayOff.compareTo(SATURDAY));
//        System.out.println(Arrays.toString(Days.values()));
//    }

    private String name;
    private int noInWeek;

    Days(String name, int noInWeek) {
        this.name = name;
        this.noInWeek = noInWeek;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNoInWeek() {
        return noInWeek;
    }

    public void setNoInWeek(int noInWeek) {
        this.noInWeek = noInWeek;
    }
}
