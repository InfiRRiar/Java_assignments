package ru.mirea.lab_11.task_1;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, 2023);
        cal.set(Calendar.MONTH, Calendar.SEPTEMBER);
        cal.set(Calendar.DAY_OF_MONTH, 7);
        cal.set(Calendar.HOUR, 18);
        cal.set(Calendar.MINUTE, 28);

        System.out.println("Серебренников");
        System.out.println(cal.getTime());

        Date date = new Date(System.currentTimeMillis());

        SimpleDateFormat sdf = new SimpleDateFormat("EEE MMM dd HH:mm:ss");

        System.out.println(sdf.format(date.getTime()));

    }
}
