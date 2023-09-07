package ru.mirea.lab1;
import java.util.Scanner;
public class task_5 {

    public static void main(String[] args) {
        int count = Factorial(6);
        System.out.println(count);
    }

    private static int Factorial(int n) {
        int count = 1;
        for (int i = 2; i < n + 1; i++)
        {
            count *= i;
        }
        return count;
    }
}
