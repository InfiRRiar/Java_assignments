package ru.mirea.lab_9.task_2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class QuickSort implements Comparator<Student> {

    private List<Student> points = new ArrayList<Student>();

    public List<Student> getPoints() {
        return points;
    }

    QuickSort() {
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            points.add(new Student(random.nextInt(70), random.nextInt(300)));
        }
    }

    public void quickSort(int low, int high) {
        if (points.size() == 0)
            return;//завершить выполнение, если длина массива равна 0

        if (low >= high)
            return;//завершить выполнение если уже нечего делить

        // выбрать опорный элемент
        int middle = low + (high - low) / 2;
        Student opora = points.get(middle);

        // разделить на подмассивы, который больше и меньше опорного элемента
        int i = low, j = high;
        while (i <= j) {
            while (compare(points.get(i), opora) < 0) {
                i++;
            }
            while (compare(points.get(j), opora) > 0) {
                j--;
            }

            if (i <= j) {//меняем местами
                Student temp = points.get(i);
                points.set(i, points.get(j));
                points.set(j, temp);
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

    @Override
    public int compare(Student o1, Student o2) {
        return Integer.compare(o2.getPoints(), o1.getPoints());
    }
}
