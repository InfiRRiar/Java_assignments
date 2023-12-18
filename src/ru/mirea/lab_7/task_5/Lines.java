package ru.mirea.lab_7.task_5;

public class Lines implements LineWork{

    @Override
    public int lineLength(String line) {
        return line.length();
    }

    @Override
    public String odd_indxs(String line) {
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < line.length(); i++)
        {
            if (i % 2 == 0)
            {
                res.append(line.charAt(i));
            }
        }
        return res.toString();

    }

    @Override
    public String invert(String line) {
        StringBuilder res = new StringBuilder(line);
        res.reverse();
        return res.toString();

    }
}
