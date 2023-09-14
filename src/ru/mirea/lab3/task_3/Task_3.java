package ru.mirea.lab3.task_3;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Random;

public class Task_3 {
    public static void main(String[] args) {
        Random rand = new Random();
        List<Integer> counts = new ArrayList<Integer>();
        for (int i = 0; i < 4; i++) {
            counts.add(rand.nextInt(10, 100));
            System.out.print(counts.get(i) + " ");
        }
        boolean flag = true;
        for (int i = 1; i < 4; i++) {
            if (counts.get(i) <= counts.get(i - 1)) {
                flag = false;
            }
        }
        System.out.println();
        if (flag) System.out.println("Последовательность строго возрастающая");
        else System.out.println("Последовательность не строго возрастающая");
    }
}
