package ru.mirea.lab_6.task_3;

public class Fahrenheit implements Convertable{

    double value;

    Fahrenheit(double value){
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    @Override
    public double convert() {
        return 5.0 / 9.0 * (value - 32.0);
    }
}
