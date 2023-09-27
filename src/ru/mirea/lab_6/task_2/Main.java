package ru.mirea.lab_6.task_2;

import ru.mirea.lab4_1.task_1.Rectangle;
import ru.mirea.lab4_1.task_5.Reader;

public class Main {
    public static void main(String[] args) {
        MovableRectangle movableRectangle = new MovableRectangle(0, 5, 6, 0, 5, 5);
        movableRectangle.moveDown();
        System.out.println(movableRectangle);
    }
}
