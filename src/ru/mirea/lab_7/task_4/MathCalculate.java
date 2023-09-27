package ru.mirea.lab_7.task_4;

public interface MathCalculate {

    double PI = Math.PI;

    public default double cplx_module(double real, double imaginary)
    {
        return Math.pow(Math.pow(real, 2) + Math.pow(imaginary, 2), 0.5);
    };

    public double
}
