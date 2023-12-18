package ru.mirea.pr24.ex1;

public class MagicalChairFactory implements ChairAbstractFactory {
    @Override
    public Chair createChair() {
        return new MagicalChair();
    }
}
