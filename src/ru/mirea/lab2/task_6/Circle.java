package ru.mirea.lab2.task_6;

public class Circle {

    double[] ctr_cords = new double[2];
    double radius;

    Circle() {
        ctr_cords[0] = 0;
        ctr_cords[1] = 0;
        radius = 0;
    }

    Circle(double radius, double x, double y) {
        ctr_cords[0] = x;
        ctr_cords[1] = y;
        this.radius = radius;
    }

    public double[] getCtr_cords() {
        return ctr_cords;
    }

    public void setCtr_cords(double[] ctr_cords) {
        this.ctr_cords = ctr_cords;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double square() {
        return Math.PI * Math.pow(radius, 2);
    }

    public double length() {
        return Math.PI * 2 * radius;
    }

    public void compare(Circle obj) {
        if (Double.compare(this.radius, obj.radius) == 1)
        {
            System.out.println("Окружность А больше");
            return;
        }
        if (Double.compare(this.radius, obj.radius) == -1)
        {
            System.out.println("Окружность B больше");
            return;
        }
        System.out.println("Окружности равны");

    }
}
