package ru.mirea.lab2.task_5;

public class DogTest {
    public static void main(String[] args) {
        DogClub obj = new DogClub();
        obj.add_dog("Фестус", 7);
        System.out.println(obj.dogs[0].toString());
        obj.dogs[0].setName("Фестус II");
        System.out.println("--------------");
        System.out.println(obj.dogs[0].getName());
        System.out.println(obj.dogs[0].getAge());
        System.out.println(obj.dogs[0].convert_to_human());
    }
}
