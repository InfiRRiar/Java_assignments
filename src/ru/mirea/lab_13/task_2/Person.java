package ru.mirea.lab_13.task_2;

public class Person {
    private String name = null;
    private String surname = "";
    private String patron = null;

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setPatron(String patron) {
        this.patron = patron;
    }

    public String format() {
        String line = surname + " ";
        if (name != null) {
            line += name.charAt(0) + ". ";
        } else {
            line += "X. ";
        }

        if (patron != null) {
            line += patron.charAt(0) + ".";
        } else {
            line += "X.";
        }

        return line;
    }

}
