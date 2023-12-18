package ru.mirea.lab_9.task_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class Sort {

    private List<Student> IDs = new ArrayList<Student>();

    Sort()
    {
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            IDs.add(new Student(random.nextInt(70)));
        }
    }
    public void sort() {
        for (int i = 1; i < IDs.size(); i++)
        {
            for (int j = 0; j < i; j++)
            {
                if (IDs.get(i).getIDNumber() < IDs.get(j).getIDNumber())
                {
                    IDs = this.PutToInd(i, j);
                }
            }
        }
    }

    public List<Student> getIDs() {
        return IDs;
    }

    public List<Student> PutToInd(int numPos, int toInd)
    {
        Student num = IDs.get(numPos);
        for (int i = numPos; i > toInd; i--)
        {
            IDs.set(i, IDs.get(i - 1));
        }
        IDs.set(toInd, num);
        return IDs;
    }
}
