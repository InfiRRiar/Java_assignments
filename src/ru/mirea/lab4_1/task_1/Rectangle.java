package ru.mirea.lab4_1.task_1;

public class Rectangle extends Shape{
    double a, b;

    Rectangle(double a, double b){
        this.a = a;
        this.b = b;
    }
    @Override
    public double getArea()
    {
        return a * b;
    }
    @Override
    public double getPerimeter()
    {
        return 2 * (a + b);
    }

    @Override
    public String getType()
    {
        return "Rectangle";
    }
    @Override
    public String toString()
    {
        return getType() + "{\nArea: " + getArea() + "\nPerimeter: " + getPerimeter() + "\n}";
    }
}
