package ru.mirea.lab3.task_1;

import java.util.Arrays;
import java.util.Random;

public class Task_1 {
    public static void main(String[] args) {
        Random rand = new Random();
        double[] array = new double[10];
        for (int i = 0; i < array.length / 2; i++) {
            array[i] = rand.nextDouble();
        }
        for (int i = array.length / 2; i < array.length; i++) {
            array[i] = Math.random();
        }
        System.out.println(Arrays.toString(array));
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }


}
