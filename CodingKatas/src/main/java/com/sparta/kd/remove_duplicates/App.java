package com.sparta.kd.remove_duplicates;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class App {

    public static int[] removeDuplicatesWithLinkedHashSet(int[] nums) {
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for (int i : nums) {
            set.add(i);
        }

        int[] output = new int[set.size()];
        Iterator<Integer> iterator = set.iterator();
        for (int i = 0; i < set.size(); i++) {
            output[i] = iterator.next();
        }

        return output;
    }

    public static int[] removeDuplicatesWithStream(int[] nums) {
        return Arrays.stream(nums).distinct().toArray();
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7,8,9,8,5,4,9,1,2,3,0,0,0,4,3,1,5};
        System.out.println(Arrays.toString(removeDuplicatesWithLinkedHashSet(nums)));
        System.out.println(Arrays.toString(removeDuplicatesWithStream(nums)));
    }
}
