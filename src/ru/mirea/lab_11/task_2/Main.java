package ru.mirea.lab_11.task_2;

import java.util.Calendar;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calendar cal = Calendar.getInstance();
        int unit;

        System.out.print("Год: ");
        unit = scanner.nextInt();
        cal.set(Calendar.YEAR, unit);

        System.out.print("Месяц: ");
        unit = scanner.nextInt();
        cal.set(Calendar.MONTH, unit - 1);


        System.out.print("День: ");
        unit = scanner.nextInt();
        cal.set(Calendar.DAY_OF_MONTH, unit);

        System.out.print("Час: ");
        unit = scanner.nextInt();
        cal.set(Calendar.HOUR_OF_DAY, unit);

        System.out.print("Минуты: ");
        unit = scanner.nextInt();
        cal.set(Calendar.MINUTE, unit);

        System.out.print("Секунды: ");
        unit = scanner.nextInt();
        cal.set(Calendar.SECOND, unit);

        if (cal.getTimeInMillis() < System.currentTimeMillis())
        {
            System.out.println("Введённое время меньше текущего");
        }
        else
        {
            System.out.println("Введённое время больше текущего");
        }

    }
}
