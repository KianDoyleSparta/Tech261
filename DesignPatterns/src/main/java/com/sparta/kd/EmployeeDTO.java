package com.sparta.kd;

import java.time.LocalDate;
import java.util.Objects;

public class EmployeeDTO {

    private final String name;
    private final Integer salary;
    private final LocalDate dob;

    public EmployeeDTO(String name, int salary, LocalDate dob) {
        this.name = name;
        this.salary = salary;
        this.dob = dob;
    }

    public String getName() {
        return name;
    }

    public Integer getSalary() {
        return salary;
    }

    public LocalDate getDob() {
        return dob;
    }

    @Override
    public String toString() {
        return "EmployeeDTO{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", dob=" + dob +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmployeeDTO that = (EmployeeDTO) o;
        return Objects.equals(name, that.name) && Objects.equals(salary, that.salary) && Objects.equals(dob, that.dob);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, salary, dob);
    }
}
