package ru.mirea.lab_9.task_3;

public class Student implements Comparable<Student>{
    private final int IDNumber;
    private final int points;
    Student(int IDNumber, int points)
    {
        this.points = points;
        this.IDNumber = IDNumber;
    }

    public int getIDNumber() {
        return IDNumber;
    }

    public int getPoints() {
        return points;
    }

    @Override
    public int compareTo(Student o) {
        return this.getPoints() - o.getPoints();
    }
}
