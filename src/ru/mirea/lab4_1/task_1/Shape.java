package ru.mirea.lab4_1.task_1;

public class Shape {
    public String getType() {
        return "shape";
    }
    public double getArea()
    {
        return 0;
    }
    public double getPerimeter()
    {
        return 0;
    }

    @Override
    public String toString()
    {
        return getType() + "{\nArea: " + getArea() + "\nPerimeter: " + getPerimeter() + "\n}";
    }




}
