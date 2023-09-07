package ru.mirea.lab1;

import java.util.Scanner;

public class task_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] ms = new int[10];
        int count;
        int sum = 0, i = 0, min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;

        do {
            count = sc.nextInt();
            ms[i] = count;
            sum += count;
            i++;
        }
        while (i < 9);

        i = 0;
        while (i < 10) {
            if (min > ms[i]) min = ms[i];
            if (max < ms[i]) max = ms[i];
            i++;
        }
        System.out.println("Sum: " + sum + " Min: " +min + " Max: " + max);
    }
}
