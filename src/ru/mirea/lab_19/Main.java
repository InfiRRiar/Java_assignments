package ru.mirea.lab_19;

import java.util.Scanner;

public class Main {
    // пример корректного ИНН: 7727563778
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            String name;
            String document;
            System.out.println("Введите ФИО: ");
            name = scanner.nextLine();
            System.out.println("Введите номер ИНН: ");
            document = scanner.nextLine();
            if (!isValid(document)) {
                throw new NonValidDocument("ИНН некорректен");
            }
        } catch (NonValidDocument err) {
            System.out.println(err.getMessage());
        }
    }

    public static boolean isValid(String line) {
        if (line.length() == 10) {
            int[] cof = {2, 4, 10, 3, 5, 9, 4, 6, 8, 0};
            return checkDigit(cof, line, 9);
        } else if (line.length() == 12) {
            int[] cof1 = {7, 2, 4, 10, 3, 5, 9, 4, 6, 8, 0};
            int[] cof2 = {3, 7, 2, 4, 3, 5, 9, 4, 6, 8, 0};

            return checkDigit(cof1, line, 10) & checkDigit(cof2, line, 11);

        } else {
            return false;
        }
    }

    public static boolean checkDigit(int[] cof, String line, int ind) {
        int control = 0;
        for (int i = 0; i < cof.length; i++) {
            control += cof[i] * Integer.parseInt(String.valueOf(line.charAt(i)));
        }
        control = control % 11;
        control = control % 10;
        return Integer.parseInt(String.valueOf(line.charAt(ind))) == control;
    }
}
