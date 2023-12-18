package ru.mirea.lab_23.task_2;

import java.util.LinkedList;
import java.util.TreeMap;

public class LinkedQueue implements Queue{
    private LinkedList<Object> queue = new LinkedList<>();
    private int size = 0;

    @Override
    public void clear() {
        queue.clear();
        size = 0;
    }

    @Override
    public void enqueue(Object elem) {
        queue.add(elem);
        size++;
    }

    @Override
    public Object element() {
        if (isEmpty()) {
            return null;
        }
        return queue.getFirst();
    }

    @Override
    public Object dequeue() {
        if (isEmpty()) {
            return null;
        }
        Object first = queue.getFirst();
        queue.removeFirst();
        size--;
        return first;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }
}
