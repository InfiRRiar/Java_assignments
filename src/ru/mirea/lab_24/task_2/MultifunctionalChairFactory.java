package ru.mirea.lab_24.task_2;

public class MultifunctionalChairFactory implements ChairAbstractFactory {
    @Override
    public Chair createChair() {
        return new MultifunctionalChair();
    }
}
