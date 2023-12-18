package ru.mirea.lab_8.task_9;

public class Recursion {
    public int calculate(int a, int b, int last_count) {

        if ((last_count == 0 | a == 0) & b > 0)
        {
            return calculate(a, b - 1, 1);
        }

        if (b > 0 & last_count == 1 & a > 0)
        {
            return calculate(a - 1, b, 0) + calculate(a, b - 1, 1);
        }

        if (b == 0 & a > 0 & last_count == 1)
        {
            return calculate(a - 1, b, 0);
        }

        if (a == 0 & b == 0)
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }

}
