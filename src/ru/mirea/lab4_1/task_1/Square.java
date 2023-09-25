package ru.mirea.lab4_1.task_1;

public class Square extends Shape{
    double a;

    Square(int a){
        this.a = a;
    }
    @Override
    public double getArea()
    {
        return Math.pow(a, 2);
    }
    @Override
    public double getPerimeter()
    {
        return 4 * a;
    }

    @Override
    public String getType()
    {
        return "Square";
    }
    @Override
    public String toString()
    {
        return getType() + "{\nArea: " + getArea() + "\nPerimeter: " + getPerimeter() + "\n}";
    }
}
