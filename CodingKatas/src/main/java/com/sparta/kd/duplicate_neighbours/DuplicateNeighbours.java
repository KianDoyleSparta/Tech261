package com.sparta.kd.duplicate_neighbours;

public class DuplicateNeighbours {

    public static boolean containsDuplicates(int[] input) {

        int counter = 0;
        boolean bool = false;

        for (int i = 1; i < input.length; i++) {
            if (input[i] == input[i-1]) {
                counter++;
            } else {
                counter = 0;
            }
            if (counter > 1) {
                break;
            }
        }

        if (counter > 1) {
            bool = true;
        }
        return bool;
    }

}
