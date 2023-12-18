package ru.mirea.lab_13.task_2;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.setSurname("Фамилиев");
        person.setName("Имя");
        System.out.println(person.format());
        person.setPatron("Отчествович");
        System.out.println(person.format());
    }
}
