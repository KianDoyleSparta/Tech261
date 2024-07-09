package com.sparta.kd;

public interface Pullable {
    void connect(String name, String passKey);
    void pull();
    void push();

}


