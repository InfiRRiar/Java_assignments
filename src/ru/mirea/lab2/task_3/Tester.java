package ru.mirea.lab2.task_3;

public class Tester {
    public static void main(String[] args) {

        Circle[] geometry = {new Circle(2, 4.5, 20)};
        int count = 1;

        System.out.println("Радиус: " + geometry[0].getRadius());
        System.out.println("Центр: " + geometry[0].getPoint());
        System.out.println("----------------------------");
        geometry[0].setPoint(1, 1);
        geometry[0].setRadius(26.5);
        System.out.println("Новый радиус: " + geometry[0].getRadius());
        System.out.println("Новые корды: " + geometry[0].getPoint());
    }

}
