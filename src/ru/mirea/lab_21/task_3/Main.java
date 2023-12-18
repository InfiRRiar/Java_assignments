package ru.mirea.lab_21.task_3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Integer[] mas = {1, 2, 3, 4, 5};
        String[] mas1 = {"a", "b", "c", "d"};

        find(mas, 2);
        find(mas1, 2);
    }

    public static <Object> void find(Object[] mas, int i) {
        if (i > mas.length - 1 || i < 0) {
            System.out.println("Неверно введён индекс");
        } else {
            System.out.println(mas[i]);
        }
    }
}
