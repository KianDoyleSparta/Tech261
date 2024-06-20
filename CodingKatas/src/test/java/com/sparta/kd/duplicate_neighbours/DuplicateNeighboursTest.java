package com.sparta.kd.duplicate_neighbours;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class DuplicateNeighboursTest {

    @Test
    public void checkIfDuplicateNeighboursDetectsThreeInARow() {
        int[] input = {1, 1, 1, 0, 0, 3};
        boolean expected = true;
        boolean actual = DuplicateNeighbours.containsDuplicates(input);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void checkIfDuplicateNeighboursDetectsNoThreeInARow() {
        int[] input = {1, 1, 0, 0, 3};
        boolean expected = false;
        boolean actual = DuplicateNeighbours.containsDuplicates(input);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void checkIfDuplicateNeighboursDetectsThreeNegativesInARow() {
        int[] input = {7, -1, -1, -1, 0, 0, 3};
        boolean expected = true;
        boolean actual = DuplicateNeighbours.containsDuplicates(input);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void checkEmptyArrayReturnsFalse() {
        int[] input = {};
        boolean expected = false;
        boolean actual = DuplicateNeighbours.containsDuplicates(input);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void checkArrayOfTwoValuesReturnsFalse() {
        int[] input = {-1, -1};
        boolean expected = false;
        boolean actual = DuplicateNeighbours.containsDuplicates(input);
        Assertions.assertEquals(expected, actual);
    }


}
