package ru.mirea.lab3.task_8;

import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<Employee>();

        Employee employee_1 = new Employee("Bob", 3.5);
        Employee employee_2 = new Employee("Jane", 3.56);
        Employee employee_3 = new Employee("Vasya", 9.99);
        employees.add(employee_1);
        employees.add(employee_2);
        employees.add(employee_3);

        Report.generate_report(employees);
    }
}
