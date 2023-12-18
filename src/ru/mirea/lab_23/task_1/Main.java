package ru.mirea.lab_23;

public class Main {
    public static void main(String[] args) {
        ArrayQueueModule.enqueue(1);
        ArrayQueueModule.enqueue(2);
        System.out.println("Element: " + ArrayQueueModule.element()); // 1
        System.out.println("Dequeued: " + ArrayQueueModule.dequeue()); // 1
        System.out.println("Element: " + ArrayQueueModule.element()); // 2
        System.out.println("Size: " + ArrayQueueModule.size()); // 1
        System.out.println("Is Empty: " + ArrayQueueModule.isEmpty());
        ArrayQueueModule.clear();
        System.out.println("Is Empty: " + ArrayQueueModule.isEmpty());
        System.out.println();


        ArrayQueueADT queueADT = ArrayQueueADT.init();
        queueADT.enqueue(1);
        queueADT.enqueue(2);
        System.out.println("Element: " + queueADT.element()); // 1
        System.out.println("Dequeued: " + queueADT.dequeue()); // 1
        System.out.println("Element: " + queueADT.element()); // 2
        System.out.println("Size: " + queueADT.size()); // 1
        System.out.println("Is Empty: " + queueADT.isEmpty());
        queueADT.clear();
        System.out.println("Is Empty: " + queueADT.isEmpty());
        System.out.println();


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
    }
}
