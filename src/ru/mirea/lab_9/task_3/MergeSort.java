package ru.mirea.lab_9.task_3;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class MergeSort{

    public List<Student> mergeSort(List<Student> arr1, List<Student> arr2) {

        List<Student> arr = new ArrayList<Student>(arr1);
        arr.addAll(arr2);

        if (arr.size() > 1) {
            int mid = arr.size() / 2;
            List<Student> left = new ArrayList<Student>();
            List<Student> right = new ArrayList<Student>();

            for (int i = 0; i < mid; i++) {
                left.add(arr.get(i));
            }
            for (int i = mid; i < arr.size(); i++) {
                right.add(arr.get(i));
            }

            left = mergeSort(left, new ArrayList<Student>());
            right = mergeSort(right, new ArrayList<Student>());

            int i = 0, j = 0, k = 0;
            while (i < left.size() && j < right.size()) {
                if (left.get(i).compareTo(right.get(j)) < 0) {
                    arr.set(k, left.get(i));
                    i++;
                } else {
                    arr.set(k, right.get(j));
                    j++;
                }
                k++;
            }

            while (i < left.size()) {
                arr.set(k, left.get(i));
                i++;
                k++;
            }

            while (j < right.size()) {
                arr.set(k, right.get(j));
                j++;
                k++;
            }
        }
        return arr;
    }
}
