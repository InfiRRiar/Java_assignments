package ru.mirea.lab3.task_2;

import java.util.Random;

public class Circle {
    Random rand = new Random();
    private final Point ctr = new Point(rand.nextInt(50), rand.nextInt(50));
    private final int radius = rand.nextInt(10);


    public Point getCtr() {
        return ctr;
    }

    public int getRadius() {
        return radius;
    }
}
