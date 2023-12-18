package ru.mirea.lab_24.task_2;

public class ChairFactory {
    public static Chair getChair(ChairAbstractFactory chairAbstractFactory) {
        return chairAbstractFactory.createChair();
    }
}
