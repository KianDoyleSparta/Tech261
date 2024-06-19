import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class IntFromArrayTests {

    @Test
    public void checkIntArrayReturnsIntConversion() {
        int[] input = {1, 2, 3};
        int expected = 123;
        int actual = IntFromArray.convertArrayToInt(input);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void checkIntArrayReturnsIntConversionWithoutLeadingZero() {
        int[] input = {0, 0, 2, 3};
        int expected = 23;
        int actual = IntFromArray.convertArrayToInt(input);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void checkIntArrayReturnsIntConversionWithDoubleDigitInts() {
        int[] input = {1, 22, 3};
        int expected = 1223;
        int actual = IntFromArray.convertArrayToInt(input);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void checkIntArrayReturnsIntConversionWithDoubleDigitIntsAndNoLeadingZero() {
        int[] input = {1, 2, 3};
        int expected = 123;
        int actual = IntFromArray.convertArrayToInt(input);
        Assertions.assertEquals(expected, actual);
    }

}
