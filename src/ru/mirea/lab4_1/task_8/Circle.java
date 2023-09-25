package ru.mirea.lab4_1.task_2;

public class Circle extends Shape {

    private double radius;

    Circle() {radius = 1;}
    Circle(double radius){
        this.radius = radius;
    }
    Circle(double radius, String color, boolean filled)
    {
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea()
    {
        return Math.pow(radius, 2) * Math.PI;
    }
    @Override
    public double getPerimeter()
    {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString()
    {
        return "Circle" + "{\nArea: " + getArea() + "\nPerimeter: " + getPerimeter() + "\n}";
    }

}
