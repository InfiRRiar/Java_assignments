package ru.mirea.lab_6.task_3;

public class Celcium implements Convertable{

    double value;

    Celcium(double value){
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
        return 9.0 / 5.0 * value + 32.0;
    }
}
