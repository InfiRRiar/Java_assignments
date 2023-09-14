package ru.mirea.lab3.task_8;

public class Employee {
    private final String fullname;
    private final double salary;

    Employee(String fullname, double salary) {
        this.fullname = fullname;
        this.salary = salary;
    }

    public String getFullname() {
        return fullname;
    }

    public double getSalary() {
        return salary;

    }
}
