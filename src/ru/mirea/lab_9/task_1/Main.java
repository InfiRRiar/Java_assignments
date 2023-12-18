package ru.mirea.lab_9.task_1;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Sort res = new Sort();

        for (Student student : res.getIDs()) {
            System.out.print(student.getIDNumber() + " ");
        }
        System.out.println();
        res.sort();
        for (Student student : res.getIDs()) {
            System.out.print(student.getIDNumber() + " ");
        }
    }
}
