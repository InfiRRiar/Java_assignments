package ru.mirea.lab2.task_2;

public class TestBall {
    public static void main(String[] args) {
        Ball obj = new Ball();
        obj.setX(1);
        obj.setY(2);
        System.out.println(obj.getX());
        System.out.println(obj.getY());
        obj.setXY(5, 5);
        System.out.println(obj.getX());
        System.out.println(obj.getY());
        obj.move(1, 2);
        System.out.println(obj.toString());

    }
}
