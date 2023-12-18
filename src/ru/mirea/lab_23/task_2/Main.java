package ru.mirea.lab_23.task_2;

public class Main {
    public static void main(String[] args) {
        ArrayQueue queue = new ArrayQueue();
        queue.enqueue(1);
        queue.enqueue(2);
        System.out.println("Element: " + queue.element()); // 1
        System.out.println("Dequeued: " + queue.dequeue()); // 1
        System.out.println("Element: " + queue.element()); // 2
        System.out.println("Size: " + queue.size()); // 1
        System.out.println("Is Empty: " + queue.isEmpty());
        queue.clear();
        System.out.println("Is Empty: " + queue.isEmpty());
        System.out.println();


        LinkedQueue linkedQueue = new LinkedQueue();
        linkedQueue.enqueue(1);
        linkedQueue.enqueue(2);
        System.out.println("Element: " + linkedQueue.element()); // 1
        System.out.println("Dequeued: " + linkedQueue.dequeue()); // 1
        System.out.println("Element: " + linkedQueue.element()); // 2
        System.out.println("Size: " + linkedQueue.size()); // 1
        System.out.println("Is Empty: " + linkedQueue.isEmpty());
        linkedQueue.clear();
        System.out.println("Is Empty: " + linkedQueue.isEmpty());
        System.out.println();
    }
}
