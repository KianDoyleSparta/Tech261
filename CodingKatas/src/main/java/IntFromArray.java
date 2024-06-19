public class IntFromArray {

    public static int convertArrayToInt(int[] input) {
        String output = "";
        for (int j : input) {
            output = output + Integer.toString(j);
        }

        return Integer.parseInt(output);
    }

}
