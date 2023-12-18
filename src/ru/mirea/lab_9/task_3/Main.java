package ru.mirea.lab_9.task_3;

import java.util.List;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        MergeSort res = new MergeSort();
        Random rand = new Random();

        List<Student> array1 = new ArrayList<Student>();
        List<Student> array2 = new ArrayList<Student>();
        for (int i = 0; i < 10; i++) {
            array1.add(new Student(rand.nextInt(70), rand.nextInt(300)));
            array2.add(new Student(rand.nextInt(70), rand.nextInt(300)));
        }

        List<Student> sorted_array = res.mergeSort(array1, array2);

        for (Student student : sorted_array) {
            System.out.print(student.getPoints() + " ");
        }
    }
}
