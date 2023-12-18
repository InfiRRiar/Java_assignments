package ru.mirea.lab_20;

public class Main {
    public static void main(String[] args) {
        GenericBox<String, Integer, Double> obj = new GenericBox<>("line", 1, 3.0);
        obj.printValues();
    }
}
