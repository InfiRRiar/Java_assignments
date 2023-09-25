package ru.mirea.lab_6;

public class Main {
    public static void main(String[] args) {
        MovableCircle circle = new MovableCircle(0, 0, 5, 5, 1);
        circle.moveUp();
        System.out.println(circle.toString());

    }
}
