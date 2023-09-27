package ru.mirea.lab_6.task_1;

public class MovablePoint implements Movable{
    private int x, y;
    private final int xSpeed, ySpeed;


    MovablePoint(int x, int y, int xSpeed, int ySpeed)
    {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public String toString()
    {
        return "MovablePoint:{\n" + "x: " + x + "\ny: " + y + "\nxSpeed: " + xSpeed + "\nySpeed: " + ySpeed + "}";
    }

    @Override
    public void moveUp()
    {
        x += xSpeed;
    }
    @Override
    public void moveDown()
    {
        x -= xSpeed;
    }
    @Override
    public void moveRight()
    {
        y += ySpeed;
    }
    @Override
    public void moveLeft()
    {
        y -= ySpeed;
    }
}
