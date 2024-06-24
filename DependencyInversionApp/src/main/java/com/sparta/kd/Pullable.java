package com.sparta.kd;

public interface Pullable {
    void connect(String username, String password);
    void pull();
    void push();

}
