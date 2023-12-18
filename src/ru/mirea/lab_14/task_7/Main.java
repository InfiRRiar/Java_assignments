package ru.mirea.lab_14.task_7;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        final String contain = "(([a-zA-Z\\d_]*[a-z][a-zA-Z\\d_]*[A-Z][a-zA-Z\\d_]*[\\d][a-zA-Z\\d_]*)|([a-zA-Z\\d_]*[a-z][a-zA-Z\\d_]*[\\d][a-zA-Z\\d_]*[A-Z][a-zA-Z\\d_]*)|([a-zA-Z\\d_]*[\\d][a-zA-Z\\d_]*[a-z][a-zA-Z\\d_]*[A-Z][a-zA-Z\\d_]*)|([a-zA-Z\\d_]*[\\d][a-zA-Z\\d_]*[A-Z][a-zA-Z\\d_]*[a-z][a-zA-Z\\d_]*)|([a-zA-Z\\d_]*[A-Z][a-zA-Z\\d_]*[a-z][a-zA-Z\\d_]*[\\d][a-zA-Z\\d_]*)|([a-zA-Z\\d_]*[A-Z][a-zA-Z\\d_]*[\\d][a-zA-Z\\d_]*[a-z][a-zA-Z\\d_]*))";
        final String len = "^[A-Za-z\\d_]{8,}";
        final String[] lines = {"F032_Password","TrySpy1", "smart_pass", "A007"};

        final Pattern patternContain = Pattern.compile(contain, Pattern.MULTILINE);


        final Pattern patternLength = Pattern.compile(len, Pattern.MULTILINE);

        for (String line:lines)
        {
            final Matcher matcher1 = patternContain.matcher(line);
            final Matcher matcher2 = patternLength.matcher(line);

            if (matcher1.find() && matcher2.find()) System.out.println(line + " True");
            else System.out.println(line + " False");
        }
    }
}
