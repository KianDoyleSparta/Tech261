package com.sparta.kd;

import java.util.Objects;

public class Spartan {
    private String firstName;
    private String lastName;

    public Spartan(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }

        return (object instanceof Spartan otherSpartan) // Are these both Spartan objects?
                && getFirstName().equals(otherSpartan.getFirstName()) // Do they have the same first name?
                && getLastName().equals(otherSpartan.getLastName()); // Do they have the same last name?

    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName);
    }

}
