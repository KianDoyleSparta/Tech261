public class IntFromArray {

    //Given an array of integers, convert them to a single int made up of the digits
    //for example the array:
    //int[] numbers = {1, 0, 2, 4}
    //should return the int 1024.
    //Use TDD and ask if you need any requirements clarified

    public static int convertArrayToInt(int[] input) {
        String output = "";
        for (int j : input) {
            output = output + Integer.toString(j);
        }

        return Integer.parseInt(output);
    }
}
