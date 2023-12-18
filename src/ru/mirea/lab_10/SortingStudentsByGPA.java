package ru.mirea.lab_10;

import java.util.*;

public class Main implements Comparator<Student> {
    List<Student> arr = new ArrayList<Student>();

    public void setArray(List<Student> arr)
    {
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            arr.add(new Student("Student" + Integer.toString(i), "Smith" + Integer.toString(i), "Profession" + Integer.toString(i), random.nextInt(1980, 2010),
                    "Group" + Integer.toString(i), random.nextInt(0, 101)));
        }
        Collections.shuffle(arr);
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

    @Override
    public int compare(Student o1, Student o2) {
        return Integer.compare(o2.getAvg_points(), o1.getAvg_points());
    }
}
