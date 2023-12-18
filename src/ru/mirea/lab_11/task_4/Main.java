package ru.mirea.lab_11.task_4;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        Scanner scanner = new Scanner(System.in);
        int unit;
        System.out.println("Введите время в формате YYYY MM DD");

        cal.set(Calendar.YEAR, scanner.nextInt());
        cal.set(Calendar.MONTH, scanner.nextInt() - 1);
        cal.set(Calendar.DAY_OF_MONTH, scanner.nextInt() - 1);

        System.out.println("Введите время в формате HH MM");
        cal.set(Calendar.HOUR_OF_DAY, scanner.nextInt());
        cal.set(Calendar.MINUTE, scanner.nextInt());

        Date time = new Date(cal.getTimeInMillis());
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd HH:mm");
        System.out.println(sdf.format(time));
    }
}
