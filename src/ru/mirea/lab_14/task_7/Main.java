package ru.mirea.lab_14.task_6;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Main {
    public static void main(String[] args) {
        final String regex = "[a-zA-z\\d\\.]+@(localhost|[a-z][A-z]+\\.[a-zA-z]+)";
        final String string = "user@example.com\n"
                + "root@localhost\n"
                + "myhost@@@com.ru\n"
                + "@my.ru,";

        final Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
        final Matcher matcher = pattern.matcher(string);

        while (matcher.find()) {
            System.out.println("Full match: " + matcher.group(0));

        }
    }
}
