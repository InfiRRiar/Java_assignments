package ru.mirea.lab_6.task_3;

public class Main {
    public static void main(String[] args) {
        Celcium celcium = new Celcium(20);
        Fahrenheit fahrenheit = new Fahrenheit(68);

        System.out.println(celcium.convert());
        System.out.println(fahrenheit.convert());

    }
}
