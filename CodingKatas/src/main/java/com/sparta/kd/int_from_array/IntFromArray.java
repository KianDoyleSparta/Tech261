package com.sparta.kd.int_from_array;

public class IntFromArray {

    public static int convertArrayToInt(int[] input) {
        String output = "";
        for (int j : input) {
            output += Integer.toString(Math.abs(j));
        }
        if (output.isEmpty()) {
            output = "0";
        }
        return Integer.parseInt(output);
    }

}
