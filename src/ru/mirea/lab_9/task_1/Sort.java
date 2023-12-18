package ru.mirea.lab_9.task_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class Test {

    List<Student> IDs = new ArrayList<Student>();
    public static void main(String[] args) {
        Random random = new Random();
        List<Student> IDs = new ArrayList<Student>();

        for (int i = 0; i < 10; i++) {
            IDs.add(new Student(random.nextInt(70)));
        }

        for (int i = 1; i < IDs.size(); i++)
        {
            for (int j = 0; j < i; j++)
            {
                if (IDs.get(i).compareTo(IDs.get(j)) < 0)
                {

                }
            }
        }
    }

    public List<Student> PutToInd(int numPos, int toInd)
    {

    }
}
