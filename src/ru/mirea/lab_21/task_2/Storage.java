package ru.mirea.lab_21.task_2;

import java.util.ArrayList;
import java.util.List;

public class Storage<E> {
    List<E> storage;

    Storage() {
        storage = new ArrayList<E>();
    }

    public void add(E elem) {
        storage.add(elem);
    }
    public void print() {
        for (E i : storage) {
            System.out.println(i);
        }
    }
}
