package ru.mirea.lab_23.task_2;

public class ArrayQueue implements Queue{
    private Object[] elems;
    private int size;
    private int front_ind;

    ArrayQueue()
    {
        elems = new Object[10];
        size = 0;
        front_ind = 0;
    }

    @Override
    public void clear()
    {
        for (int i = front_ind; i < front_ind + size; i++)
        {
            dequeue();
        }
        front_ind = 0;
    }

    @Override
    public void enqueue(Object elem) {
        if ((front_ind + size) == elems.length) {
            System.out.println("Переполнение очереди, сброс данных");
            elems = new Object[10];
            size = 0;
        }
        elems[(front_ind + size) % elems.length] = elem;
        size++;
    }

    @Override
    public Object element() {
        if (isEmpty()) {
            System.out.println("Очередь пуста");
            return null;
        }
        return elems[front_ind];
    }

    @Override
    public Object dequeue() {
        if (isEmpty()) {
            System.out.println("Очередь пуста");
            return null;
        }
        Object first = elems[front_ind];
        elems[front_ind] = null;
        front_ind++;
        size--;
        return first;
    }
    @Override
    public int size()
    {
        return size;
    }
    @Override
    public boolean isEmpty() {
        return size == 0;
    }
}
