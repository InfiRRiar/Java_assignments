package ru.mirea.lab4_1.task_8;

public class Rectangle extends Shape {
    protected double length, width;

    Rectangle()
    {
        length = 1;
        width = 1;
    }
    Rectangle(double a, double b){
        this.length = a;
        this.width = b;
    }
    Rectangle(double a, double b, String color, boolean filled)
    {
        this.length = a;
        this.width = b;
        this.color = color;
        this.filled = filled;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double getArea()
    {
        return length * width;
    }
    @Override
    public double getPerimeter()
    {
        return 2 * (length + width);
    }

    @Override
    public String toString()
    {
        return "Rectangle" + "{\nArea: " + getArea() + "\nPerimeter: " + getPerimeter() + "\n}";
    }
}
