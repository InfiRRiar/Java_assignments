package ru.mirea.lab4_1.task_5;
import java.util.List;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Reader user = new Reader("Петров В. В.", 1, "Ravenclaw", "09.12.2004", 112);

        String[] vovasBooks = {"Приключения Электроника", "Понедельник начинается в субботу", "Властелин колец"};
        System.out.println(user.take_book(3, vovasBooks));
        System.out.println(user.return_book(3));
    }
}
