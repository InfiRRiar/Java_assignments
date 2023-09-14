package ru.mirea.lab2.task_6;

import java.util.Arrays;

public class CircleTest {
    public static void main(String[] args) {

    Circle obj1 = new Circle(5, 2.5, 4);
    Circle obj2 = new Circle(10, 50, 42);

    System.out.println(Arrays.toString(obj1.getCtr_cords()));
    System.out.println(obj2.getRadius());

    obj1.compare(obj2);
    }
}
