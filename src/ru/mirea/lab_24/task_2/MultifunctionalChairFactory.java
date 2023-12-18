package ru.mirea.pr24.ex1;

public class MultifunctionalChairFactory implements ChairAbstractFactory {
    @Override
    public Chair createChair() {
        return new MultifunctionalChair();
    }
}
