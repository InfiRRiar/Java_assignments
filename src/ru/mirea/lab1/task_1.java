package ru.mirea.lab1;

public class task_1 {
    public static void main(String[] args) {
        int count = 0;
        int[] ms = {1, 2, 3, 4, 4, 5, 6, 18, 8, 29};
        for (int i = 0; i < 10; i++)
        {
            count += ms[i];
        }
        System.out.println(count + " " + count / 10.0);
    }
}
