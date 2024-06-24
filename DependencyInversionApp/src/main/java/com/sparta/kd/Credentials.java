package com.sparta.kd;

public class Credentials implements Pullable {
    public static String username = "Kian";
    public static String password = "pass";

    @Override
    public void connect(String username, String password) {
        if (username.equals(Credentials.username) && password.equals(Credentials.password)) {
            System.out.println("Access granted using username and password");
        }
    }

    @Override
    public void pull() {

    }

    @Override
    public void push() {

    }
}
