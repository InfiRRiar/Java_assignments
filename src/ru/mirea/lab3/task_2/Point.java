package ru.mirea.lab3.task_2;

public class Point {
    private int[] crds = new int[2];

    Point(int x, int y) {
        this.crds[0] = x;
        this.crds[1] = y;
    }


    public int[] getCrds() {
        return crds;
    }

    public void setCrds(int x, int y) {
        this.crds[0] = x;
        this.crds[1] = y;
    }
}
