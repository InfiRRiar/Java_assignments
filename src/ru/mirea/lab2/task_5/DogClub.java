package ru.mirea.lab2.task_5;

public class DogClub {
    Dog[] dogs = new Dog[10];
    int count = 0;

    void add_dog(String name, int age)
    {
        dogs[count] = new Dog(name, age);
        count++;
    }
}
