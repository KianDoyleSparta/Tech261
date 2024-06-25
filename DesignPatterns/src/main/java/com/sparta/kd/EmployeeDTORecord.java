package com.sparta.kd;

import java.time.LocalDate;
import java.util.Objects;

public record EmployeeDTORecord(String name, Integer salary, LocalDate dob) {
    @Override
    public String toString() {
        return "EmployeeDTORecord{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", dob=" + dob +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmployeeDTORecord that = (EmployeeDTORecord) o;
        return Objects.equals(name, that.name) && Objects.equals(dob, that.dob) && Objects.equals(salary, that.salary);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, salary, dob);
    }
}
