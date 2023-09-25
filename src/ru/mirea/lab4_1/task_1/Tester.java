package ru.mirea.lab4_1.task_1;

public class Tester {
    public static void main(String[] args) {
        Shape shape = new Shape();
        shape.getType();

        Circle circle = new Circle(8);
        System.out.println(circle.getType());
        System.out.println("---------------------------");

        Rectangle rectangle = new Rectangle(10, 4.5);
        System.out.println(rectangle.getType());
        System.out.println("---------------------------");

        Square square = new Square(15);
        System.out.println(square.getType());
        System.out.println("---------------------------");

    }
}
