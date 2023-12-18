package ru.mirea.lab_23.task_2;

public abstract class AbstractQueue<E> implements Queue<E> {
    int size = 0;
    @Override
    public boolean isEmpty() {
        return size() == 0;
    }
    @Override
    public void clear() {
        while (!isEmpty()) {
            dequeue();
        }
    }
}