package com.sparta.kd;

import java.util.ArrayList;
import java.util.Arrays;

public class Key implements Pullable {
    public static String key = "0!akM#0aslbKHB79LjbjOKN77#";
    public static ArrayList<String> allowedNames = new ArrayList<>(Arrays.asList("kian", "dev"));

    @Override
    public void connect(String name, String key) {
        if (key.equals(Key.key) && allowedNames.contains(name.toLowerCase())) {
            System.out.println("Access granted using key and name");
        }
    }

    @Override
    public void pull() {

    }

    @Override
    public void push() {

    }

}

