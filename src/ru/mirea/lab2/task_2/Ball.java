package ru.mirea.lab2.task_2;

public class Ball {
    private double x;
    private double y;
    public Ball()
    {
        x = 0;
        y = 0;
    };
    public Ball(double x, double y)
    {
        this.x = x;
        this.y = y;
    }
    public double getX()
    {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }
    public void setXY(double x, double y){
        this.x = x;
        this.y = y;
    }
    public void move(double xDis, double yDis)
    {
        this.x += xDis;
        this.y += yDis;
    }

    @Override
    public String toString() {
        return "String{" +
                "\nx: " + x +
                "\ny: " + y + "\n}";
    }
}
