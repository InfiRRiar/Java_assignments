package ru.mirea.lab2.task_8;

import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {
        String storage;
        String[] line = { "массив", "будет", "имитировать", "речь", "мастера", "Йоды", "только", "ещё", "хуже"};
        for (int i = 0; i < line.length / 2; i++) {
            storage = line[i];
            line[i] = line[line.length - i - 1];
            line[line.length - i - 1] = storage;
        }
        System.out.println(Arrays.toString(line));
    }
}
