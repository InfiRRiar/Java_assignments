package ru.mirea.lab_23;

public class ArrayQueue {
    private Object[] elems;
    private int size;
    private int front_ind;

    ArrayQueue()
    {
        elems = new Object[10];
        size = 0;
        front_ind = 0;
    }

    public void clear()
    {
        for (int i = front_ind; i < front_ind + size; i++)
        {
            dequeue();
        }
        front_ind = 0;
    }

    public void enqueue(Object elem) {
        if ((front_ind + size) == elems.length) {
            System.out.println("Переполнение очереди, сброс данных");
            elems = new Object[10];
            size = 0;
        }
        elems[(front_ind + size) % elems.length] = elem;
        size++;
    }

    public Object element() {
        if (isEmpty()) {
            System.out.println("Очередь пуста");
            return null;
        }
        return elems[front_ind];
    }

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
    public int size()
    {
        return size;
    }
    public boolean isEmpty() {
        if (size == 0) {
            return true;
        }
        return false;
    }
}
