package ru.mirea.lab_10;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        SortingStudentsByGPA sort = new SortingStudentsByGPA();


        sort.setArray(generateArray());
        sort.outArray();
        System.out.println();
        sort.setArray(sort.mergeSort(sort.getArray()));
        sort.outArray();

        System.out.println();
        System.out.println();


        sort.setArray(generateArray());
        sort.outArray();
        System.out.println();
        sort.quickSort(0, sort.getArray().size() - 1);
        sort.outArray();

        List<Student> arr = generateArray();
        arr.sort(new Student());

        System.out.println();
        System.out.println();

        for (Student student : arr) {
            System.out.print(student.getYear() + " ");
        }

    }
    public static List<Student> generateArray(){
        List<Student> arr = new ArrayList<Student>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            arr.add(new Student("Student" + Integer.toString(i), "Smith" + Integer.toString(i), "Profession" + Integer.toString(i), random.nextInt(1980, 2010),
                    "Group" + Integer.toString(i), random.nextInt(0, 101)));
        }
        Collections.shuffle(arr);
        return arr;
    }
}
