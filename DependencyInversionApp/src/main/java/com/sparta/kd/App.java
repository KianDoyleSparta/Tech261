package com.sparta.kd;

public class App {
    public static void main(String[] args) {
        String username = "Kian";
        String password = "pass";

        Credentials connectionWithCreds = new Credentials();

        connectionWithCreds.connect(username, password);

        String key = "0!akM#0aslbKHB79LjbjOKN77#";
        String name = "Kian";

        Key connectionWithKey = new Key();

        connectionWithKey.connect(key, name);
    }
}
