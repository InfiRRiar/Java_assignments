package ru.mirea.lab_8.task_8;

public class Recursion {
    public String recursion(String line, int step)
    {
        if (line.length() / 2 < step)
        {
            return "YES";
        }
        if (line.charAt(step) != line.charAt(line.length() - 1 - step))
        {
            return "NO";
        }
        return recursion(line, ++step);
    }
}
