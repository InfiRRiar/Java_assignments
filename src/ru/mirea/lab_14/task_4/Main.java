package ru.mirea.lab_14.task_4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        final String regex = "\\d+[ ]*\\+";
        final String[] lines = {"(1+8)–9/4","6/5–2*9"};

        final Pattern pattern = Pattern.compile(regex);
        Matcher matcher;

        for (String line : lines) {
            matcher = pattern.matcher(line);
            if (matcher.find()) System.out.println(line + " True");
            else System.out.println(line + " False");
        }
    }
}
