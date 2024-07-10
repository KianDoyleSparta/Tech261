package com.sparta.kd.persitence;

public class App {

    public static int[] toStringThenArray(long n) {
        String[] nums = String.valueOf(n).split("");
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            result[i] = Integer.parseInt(nums[i]);
        }
        return result;
    }

    public static int persistence(long n) {
        int result = 0;
        int count = 0;
        int[] digits = toStringThenArray(n);
        int length = digits.length;
        if (length == 1) {
            return count;
        } else {
            int newN = 1;
            for (int i = 0; i < length; i++) {
                newN *= digits[i];
            }
            count++;
            result = persistenceRecurse(newN, count);
        }

        return result;
    }

    public static int persistenceRecurse(long n, int count) {
        int counter = count;
        int[] digits = toStringThenArray(n);
        int length = digits.length;
        if (length == 1) {
            return counter;
        } else {
            int newN = 1;
            for (int i = 0; i < length; i++) {
                newN *= digits[i];
            }
            counter++;
            return persistenceRecurse(newN, counter);
        }
    }

    // Hi Manish! This is bad code! Look below for a much better, revised version of the code! - Kian

    private static int persistenceEfficient(long n) {
        long step = 1;
        long remainder = n;

        if (remainder / 10 == 0) {
            return 0;
        }

        for (remainder = n; remainder != 0; remainder /= 10) {
            step *= remainder % 10;
        }

        return persistenceEfficient(step) + 1;
    }

    public static void main(String[] args) {
        System.out.println(persistence(39));
        System.out.println(persistence(4));;
        System.out.println(persistenceEfficient(39));
        System.out.println(persistenceEfficient(4));
    }
}
