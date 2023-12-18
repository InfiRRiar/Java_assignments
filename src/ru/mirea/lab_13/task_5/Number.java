package ru.mirea.lab_13.task_5;

public class Number {

    public String transformNumber(String line)
    {
        String result = "+";
        if (line.charAt(0) == '+')
        {
            result += line.charAt(1) + " " + line.substring(2, 5) + " " + line.substring(5, 8) + " " + line.substring(8);
        }
        else
        {
            result += '7' + " " + line.substring(1, 4) + " " + line.substring(4, 7) + " " + line.substring(7);
        }
        return result;

    }

}
