package ru.mirea.lab_10;

import java.util.Comparator;

public class Student implements Comparator<Student> {
    String name;
    String surname;
    String profession;
    int year;
    String group;
    int avg_points;

    Student(){}

    Student(String name, String surname, String profession, int year, String group, int avg_points)
    {
        this.name = name;
        this.surname = surname;
        this.profession = profession;
        this.year = year;
        this.group = group;
        this.avg_points = avg_points;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public int getAvg_points() {
        return avg_points;
    }

    public void setAvg_points(int avg_points) {
        this.avg_points = avg_points;
    }

    @Override
    public int compare(Student o1, Student o2) {
        return o1.year - o2.year;
    }
}
