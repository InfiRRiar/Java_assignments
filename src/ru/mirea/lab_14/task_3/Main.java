package ru.mirea.lab_14.task_3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        final String regex = "(^| )\\d+([.][\\d]{0,2})?\\s(USD|EU|RUB)";
        final String string = "25.98 USD 25 RUB 44 ERR 0.004 EU 44 EU ";

        final Pattern pattern = Pattern.compile(regex);
        final Matcher matcher = pattern.matcher(string);

        while (matcher.find()) {
            System.out.println("Full match: " + matcher.group(0));
        }
    }
}
