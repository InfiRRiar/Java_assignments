package ru.mirea.lab4_1.task_2;

public class Square extends Rectangle {

    Square() {
        this.length = 1;
        this.width = 1;
    }

    Square(double a) {
        this.length = a;
        this.width = a;
    }

    Square(double a, String color, boolean filled) {
        this.length = a;
        this.width = a;
        this.color = color;
        this.filled = filled;
    }

    public double getSide() {
        return this.length;
    }
    public void setSide(double side)
    {
        this.length = side;
        this.width = side;
    }

    @Override
    public void setWidth(double a) {
        this.length = a;
        this.width = a;
    }

    @Override
    public void setLength(double a) {
        this.length = a;
        this.width = a;
    }

    @Override
    public String toString() {
        return "Square" + "{\nArea: " + getArea() + "\nPerimeter: " + getPerimeter() + "\n}";
    }
}
