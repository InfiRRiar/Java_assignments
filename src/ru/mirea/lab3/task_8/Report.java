package ru.mirea.lab3.task_8;

import java.util.List;
import java.util.ArrayList;


public class Report {
    public static void generate_report(List<Employee> employees) {
        for (Employee employee : employees) {
            System.out.printf("%-10s %.2f \n", employee.getFullname(), employee.getSalary());
        }
    }
}
