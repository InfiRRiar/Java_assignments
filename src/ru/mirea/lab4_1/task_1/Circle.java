package ru.mirea.lab4_1.task_1;

public class Circle extends Shape{

    double radius;

    Circle(double radius){
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
    public String getType()
    {
        return "Circle";
    }
    @Override
    public String toString()
    {
        return getType() + "{\nArea: " + getArea() + "\nPerimeter: " + getPerimeter() + "\n}";
    }

}
