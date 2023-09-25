package ru.mirea.lab4_1.task_8;

public class Tester {
    public static void main(String[] args) {

        Circle circle = new Circle(8);
        System.out.println(circle.toString());
        System.out.println("---------------------------");

        Rectangle rectangle = new Rectangle(10, 4.5);
        System.out.println(rectangle.toString());
        System.out.println("---------------------------");

        Square square = new Square(15);
        System.out.println(square.toString());
        System.out.println("---------------------------");

    }
}
