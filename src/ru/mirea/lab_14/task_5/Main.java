package ru.mirea.lab_14.task_5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        final String regex = "((([0][1-9]|[1][0-9]|[2][0-9]|[3][0-1])/(01|03|05|07|08|10|12)/)|(([0][1-9]|[1][0-9]|[2][0-9]|[3][0])/(04|06|09|11)/))(([1][9]\\d\\d)|([2-9]\\d\\d\\d))|(29/02/)((([2468][048])|([13579][260]))\\d\\d)|([1-9]\\d([02468][048])|([13579][26]))";
        final String string = "29/02/2000\n"
                + "30/04/2003\n"
                + "31/05/2003\n"
                + "30-04-2003\n"
                + "01/01/1899";

        final Pattern pattern = Pattern.compile(regex);
        final Matcher matcher = pattern.matcher(string);

        while (matcher.find()) {
            System.out.println("Full match: " + matcher.group(0));
        }
    }
}
