package ru.mirea.pr24.ex1;

public class VictorianChairFactory implements ChairAbstractFactory {
    @Override
    public Chair createChair() {
        return new VictorianChair();
    }
}
