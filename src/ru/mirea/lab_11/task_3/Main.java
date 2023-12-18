package ru.mirea.lab_11.task_3;

import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        cal.set(2004, 8, 1);
        Student student = new Student("Michael", "Smith", "student", cal, "SomeGroup", 84);
        System.out.println(student.toString("short"));
        System.out.println();
        System.out.println(student.toString("full"));
    }
}
