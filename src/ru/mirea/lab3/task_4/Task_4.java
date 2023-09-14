package ru.mirea.lab3.task_4;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;


public class Task_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        List<Integer> counts = new ArrayList<Integer>();
        int n = scanner.nextInt();
        while (n <= 1) {
            System.out.println("Пожалуйста, повторите ввод");
            n = scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            counts.add(rand.nextInt(0, n + 1));
        }
        System.out.println(counts);
        System.out.println();
        List<Integer> even = new ArrayList<Integer>();
        for (Integer count : counts) {
            if (count % 2 == 0) {
                even.add(count);
            }
        }
        System.out.println(even);
    }
}
