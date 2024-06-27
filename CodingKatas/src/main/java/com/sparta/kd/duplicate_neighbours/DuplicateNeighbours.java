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
            Logging.logger.info("The array contains duplicates and the program has found them");
        } else {
            Logging.logger.info("The array did not contain duplicates or the program has not found them");
        }

        return bool;
    }

}
