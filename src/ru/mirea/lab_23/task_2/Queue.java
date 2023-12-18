package ru.mirea.lab_23.task_2;

public interface Queue<Object> {
    public void clear();
    public void enqueue(Object elem);
    public Object element();
    public Object dequeue();
    public int size();
    public boolean isEmpty();
}
