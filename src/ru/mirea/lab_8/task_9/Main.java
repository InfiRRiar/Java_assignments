package ru.mirea.lab_8.task_9;

public class Main {
    public static void main(String[] args) {
        Recursion obj = new Recursion();
        // две единицы и два 0
        System.out.println(obj.calculate(2, 1, 1) + obj.calculate(1, 2, 0));
    }
}

