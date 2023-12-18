package ru.mirea.lab_11.task_3;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Comparator;
import java.util.Date;
import java.util.Objects;

public class Student {
    String name;
    String surname;
    String profession;
    Calendar year;
    String group;
    int avg_points;

    Student(String name, String surname, String profession, Calendar year, String group, int avg_points)
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
    public Calendar getYear() {
        return year;
    }
    public void setYear(Calendar year) {
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


    public String formBirthday(String type)
    {

        Date birthday = new Date(getYear().getTimeInMillis());
        SimpleDateFormat sdf = new SimpleDateFormat();
        if (Objects.equals(type, "short")) {
            sdf = new SimpleDateFormat("yy.MM.dd");
        }
        else if (Objects.equals(type, "full"))
        {
            sdf = new SimpleDateFormat("yyyy MMMM dd");
        }
        return sdf.format(birthday);
    }
    public String toString(String type)
    {


        return "Student {\n" +
                "name: " + getName() +
                "\nsurname: " + getSurname() +
                "\nprofession: " + getProfession() +
                "\nBirthday: " + formBirthday(type) +
                "\ngroup: " + getGroup() +
                "\navg_points: " + getAvg_points() +
                 "\n}";
    }
}
