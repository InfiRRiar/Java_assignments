package ru.mirea.lab_9.task_2;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        QuickSort res = new QuickSort();

        List<Student> array = res.getPoints();

        for (int i = 0; i < array.size(); i++)
        {
            System.out.print(array.get(i).getPoints() + " ");
        }
        System.out.println();

        res.quickSort(0, array.size() - 1);

        for (int i = 0; i < array.size(); i++)
        {
            System.out.print(array.get(i).getPoints() + " ");
        }
    }
}
