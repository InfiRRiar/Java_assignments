package ru.mirea.lab2.task_10;

import java.util.Scanner;

public class HowMany {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String[] splitted = line.split(" +");
        System.out.println(splitted.length);
    }
}
