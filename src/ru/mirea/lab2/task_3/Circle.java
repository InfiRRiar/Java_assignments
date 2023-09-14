package ru.mirea.lab2.task_3;

public class Circle {
    Point ctr = new Point();
    private double radius = 0;

    Circle(double x, double y, double radius)
    {
        setPoint(x, y);
        setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setPoint(double x, double y)
    {
        ctr.setX(x);
        ctr.setY(y);
    }
    public String getPoint()
    {
        return ctr.getX() + " " + ctr.getY();
    }
}
