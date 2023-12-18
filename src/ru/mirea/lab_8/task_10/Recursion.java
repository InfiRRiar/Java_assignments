package ru.mirea.lab_8.task_10;

import java.rmi.MarshalException;

public class Recursion {

    public int recursion(int count, int res)
    {
        if (count == 0)
        {
            return res / 10;
        }
        return recursion(count / 10, (res + count % 10) * 10);
    }
}
