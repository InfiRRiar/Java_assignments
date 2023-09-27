package ru.mirea.lab4_1.task_5;

import java.util.List;
import java.util.List;

public class Reader {
    String name;
    int ticket_num;
    String department;
    String birthday;
    int telephone_number;

    Reader(String name, int ticket_num, String department, String birthday, int telephone_number)
    {
        this.name = name;
        this.ticket_num = ticket_num;
        this.department = department;
        this.birthday = birthday;
        this.telephone_number = telephone_number;
    }


    public String take_book(int n)
    {
        return name + " взял " + n +" книг(и)";
    }
    String take_book(int n, String[] books)
    {
        String line;
        line = name + " взял " + n + " книг(и):";
        for (String book : books)
        {
            line = line + " " + book;
        }
        return line;
    }

    String take_book(Book[] books)
    {
        String line;
        line = name + " взял книгу(и):";
        for (Book book : books)
        {
            line = line + " " + book.name;
        }
        return line;
    }


    public String return_book(int n)
    {
        return name + " вернул " + n +" книг(и)";
    }
    String return_book(int n, String[] books)
    {
        String line;
        line = name + " вернул " + n + " книг(и):";
        for (String book : books)
        {
            line = line + " " + book;
        }
        return line;
    }

    String return_book(Book[] books)
    {
        String line;
        line = name + " вернул книгу(и):";
        for (Book book : books)
        {
            line = line + " " + book.name;
        }
        return line;
    }
}
