package ru.mirea.lab_7.task_4;

public class MathFunc implements MathCalculate {

    @Override
    public double cplx_module(double real, double imaginary) {
        return Math.pow(Math.pow(real, 2) + Math.pow(imaginary, 2), 0.5);
    }

    @Override
    public double pow(double num, double count) {
        return Math.pow(num, count);
    }

    public double calculate_square(double radius)
    {
        return pow(radius, 2) * PI;
    }

}
