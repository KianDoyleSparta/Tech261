package com.sparta.kd;

import com.sparta.kd.exceptions.CorruptedDateException;

public class ExceptionCreator {
    public static void getException() {
        System.out.println(1 / 0);
    }

    public static void getCheckedException() throws InterruptedException, CorruptedDateException {

    }
}