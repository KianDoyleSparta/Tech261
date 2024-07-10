package com.sparta.kd.findLowest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class App {

    public static int findLowestWithCollectionsSort(int[] arr) {

        ArrayList<Integer> list = new ArrayList<>();
        for (int i : arr) {
            list.add(i);
        }
        Collections.sort(list);

        return list.get(0);
    }

    public static int findLowestWithStream(int[] arr) {
        arr = Arrays.stream(arr).sorted().toArray();
        return arr[0];
    }

    public static int findLowestWithVanilla(int[] arr) {
        int lowest = arr[0];
        for (int i : arr) {
            if (i < lowest) {
                lowest = i;
            }
        }

        return lowest;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 9, 1, 4, 5, 3, -1};
        System.out.println(findLowestWithCollectionsSort(arr));
        System.out.println(findLowestWithStream(arr));
        System.out.println(findLowestWithVanilla(arr));
    }
}
