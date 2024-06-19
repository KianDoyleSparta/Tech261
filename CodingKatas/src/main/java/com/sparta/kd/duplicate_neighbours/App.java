package com.sparta.kd.duplicate_neighbours;

public class App {

    public static void main(String[] args) {
        int[] input = {0, -1, 2, 3 , 4, 44};
        boolean duplicatesInArray = DuplicateNeighbours.containsDuplicates(input);
        System.out.println(duplicatesInArray);
    }

}
