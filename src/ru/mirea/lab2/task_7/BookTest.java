package ru.mirea.lab2.task_7;

public class BookTest {
    public static void main(String[] args) {
        Shelf obj = new Shelf();

        obj.add_book("Крещение огнём", "Сапковский", 1997);
        obj.add_book("Гарри Поттер и кубок огня", "Роулинг", 2000);
        obj.add_book("Гроза", "Островский", 1869);

        System.out.println(obj.youngest_book().getName());
        System.out.println(obj.oldest_book().getName());
        System.out.println("---------------------------------");
        obj.sort_books();
        obj.print_books();
    }
}
