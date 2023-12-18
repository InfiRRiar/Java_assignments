package ru.mirea.lab_21.task_2;

public class Main {

    public static void main(String[] args) {
        Storage<String> stringStorage = new Storage<>();
        stringStorage.add("line1");
        stringStorage.add("line2");
        stringStorage.print();

        System.out.println();

        Storage<Integer> intStorage = new Storage<>();
        intStorage.add(123);
        intStorage.print();
    }
}
