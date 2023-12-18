package ru.mirea.pr24.ex1;

public class ChairFactory {
    public static Chair getChair(ChairAbstractFactory chairAbstractFactory) {
        return chairAbstractFactory.createChair();
    }
}
