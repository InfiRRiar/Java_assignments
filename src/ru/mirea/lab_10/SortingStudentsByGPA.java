package ru.mirea.lab_10;

import java.util.*;

public class SortingStudentsByGPA implements Comparator<Student> {
    private List<Student> arr;

    public List<Student> getArray() {
        return arr;
    }

    public void setArray(List<Student> arr)
    {
        this.arr = arr;
    }

    public void quickSort(int low, int high) {
        if (arr.isEmpty())
            return;//завершить выполнение, если длина массива равна 0

        if (low >= high)
            return;//завершить выполнение если уже нечего делить

        // выбрать опорный элемент
        int middle = low + (high - low) / 2;
        Student opora = arr.get(middle);

        // разделить на подмассивы, который больше и меньше опорного элемента
        int i = low, j = high;
        while (i <= j) {
            while (compare(arr.get(i), opora) < 0) {
                i++;
            }

            while (compare(arr.get(j), opora) > 0) {
                j--;
            }

            if (i <= j) {//меняем местами
                Student temp = arr.get(i);
                arr.set(i, arr.get(j));
                arr.set(j, temp);
                i++;
                j--;
            }
        }

        // вызов рекурсии для сортировки левой и правой части
        if (low < j)
            quickSort(low, j);

        if (high > i)
            quickSort(i, high);
    }

    public List<Student> mergeSort(List<Student> arr) {

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

            left = mergeSort(left);
            right = mergeSort(right);

            int i = 0, j = 0, k = 0;
            while (i < left.size() && j < right.size()) {
                if (compare(left.get(i), right.get(j)) < 0) {
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

    public void outArray()
    {
        for (Student student : arr) {
            System.out.print(student.getAvg_points() + " ");
        }
    }

    @Override
    public int compare(Student o1, Student o2) {
        return Integer.compare(o2.getAvg_points(), o1.getAvg_points());
    }
}
