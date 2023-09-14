package ru.mirea.lab2.task_7;

import ru.mirea.lab3.task_2.Circle;

import java.util.ArrayList;
import java.util.Comparator;

public class Shelf {

    ArrayList<Book> books;
    int length;
    Shelf()
    {
        books = new ArrayList<Book>(10);
        length = 0;
    }

    public void add_book(String name, String author, int year)
    {
        books.add(new Book(name, author, year));
        length++;
    }

    public Book oldest_book() {
        if (length == 0) return null;
        Book elder = books.get(0);
        for (int i = 1; i < length; i++) {
            if (books.get(i).getYear() > elder.getYear()) {
                elder = books.get(i);
            }
        }
        return elder;
    }

    public Book youngest_book() {
        if (length == 0) return null;
        Book found = books.get(0);
        for (int i = 1; i < length; i++) {
            if (books.get(i).getYear() < found.getYear()) {
                found = books.get(i);
            }
        }
        return found;
    }

    public void sort_books() {
        ArrayList<Book> new_order = new ArrayList<Book>(10);
        books.sort(Comparator.comparingInt(Book::getYear));
    }
    public void print_books()
    {
        for (int i = 0; i < length; i++)
        {
            System.out.println(books.get(i).getName());
        }
    }


}

