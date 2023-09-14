package ru.mirea.lab2.task_4;


public class Shop {
    Computer[] magazine = new Computer[10];
    int length = 0;

    public void add_computer(String name) {
        if (length == 10) return;
        magazine[length] = new Computer(name);
        length++;
    }

    public void remove_computer(String name) {
        int ind = search(name);
        if (ind == -1) return;

        magazine[ind] = magazine[length - 1];
        magazine[length - 1] = null;
    }

    public int search(String computer_name) {
        if (length == 0) {return -1;}
        for (int i = 0; i < length; i++) {
            if (computer_name.equals(magazine[i].name)) {
                return i;
            }
        }
        return -1;
    }

}
