package com.sparta.kd.mocking;

import java.time.LocalDate;

public class Spartan {

    public int getId() {
        return 0;
    }

    public String getName() {
        return "";
    }

    public void setName(String name) {

    }

    public LocalDate getStartDate() {
        return null;
    }

    @Override
    public String toString() {
        return "Spartan{" +
                "id=" + getId() +
                ", name='" + getName() + '\'' +
                ", startDate=" + getStartDate() +
                '}';
    }
}
