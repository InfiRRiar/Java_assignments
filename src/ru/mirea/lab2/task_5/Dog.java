package ru.mirea.lab2.task_5;

public class Dog {
    String name;
    int age;

    Dog(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int convert_to_human()
    {
        return age * 7;
    }
    @Override
    public String toString() {
        return "Dog {" +
                "\nname: " + name +
                "\nage: " + age +
                "\n}";
    }
}
