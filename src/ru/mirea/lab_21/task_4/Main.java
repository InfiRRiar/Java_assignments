package ru.mirea.lab_21.task_4;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static <Object> List<Object> firstFive(Object[] ms) {
        List<Object> transformed = new ArrayList<>();
        for (int i = 0; i < ms.length; i++) {
            if (i < 5) {
                System.out.print(ms[i] + " ");
            }
            transformed.add(ms[i]);
        }
        System.out.println();
        return transformed;
    }

    public static void main(String[] args) {
        Integer[] ms1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        List<Integer> tr1 = firstFive(ms1);

        String[] ms2 = {"5", "4", "3", "2", "1", "6", "7", "8", "9"};
        List<String> tr2 = firstFive(ms2);
    }
}
