package ru.mirea.lab2.task_1;

import ru.mirea.lab2.task_1.Author;

public class TestAuthor {
    public static void main(String[] args) {
        Author obj = new Author("Ilya", "serebr911-1@yandex.ru", 'm');
        System.out.println(obj.getName());
        System.out.println(obj.getEmail());
        System.out.println(obj.getGender());
        System.out.println("----------------------------");
        obj.setEmail("serebrennikov.i.k@edu.mirea.ru");
        System.out.println(obj.getEmail());
        System.out.println("----------------------------");
        System.out.println(obj.toString());
    }
}
