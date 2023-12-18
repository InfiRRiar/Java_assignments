package ru.mirea.lab_24.task_2;

public class MagicalChairFactory implements ChairAbstractFactory {
    @Override
    public Chair createChair() {
        return new MagicalChair();
    }
}
