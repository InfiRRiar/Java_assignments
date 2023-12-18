package ru.mirea.lab_23.task_1;

public class ArrayQueueModule {
    private static Object[] elems = new Object[10];
    private static int size = 0;
    private static int front_ind = 0;

    public static void clear()
    {
        for (int i = front_ind; i < front_ind + size; i++)
        {
            dequeue();
        }
        front_ind = 0;
    }
    public static void enqueue(Object elem) {
        if ((front_ind + size) % elems.length == 0) {
            System.out.println("Переполнение очереди, сброс данных");
            elems = new Object[10];
            size = 0;
        }
        elems[(front_ind + size) % elems.length] = elem;
        size++;
    }

    public static Object element() {
        if (isEmpty()) {
            System.out.println("Очередь пуста");
            return null;
        }
        return elems[front_ind];
    }

    public static Object dequeue() {
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
    public static int size()
    {
        return size;
    }
    public static boolean isEmpty() {
        return size == 0;
    }

}
