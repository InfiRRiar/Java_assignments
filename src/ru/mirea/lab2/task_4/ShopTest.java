package ru.mirea.lab2.task_4;

import java.util.Scanner;
public class ShopTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Shop obj = new Shop();
        String line;
        int ind;
        while (true)
        {
            System.out.println("1. Добавить компьютер");
            System.out.println("2. Убрать компьютер");
            System.out.println("3. Поиск компьютера");
            int count = sc.nextInt();

            System.out.println("Введите название пк: ");
            sc.nextLine();
            line = sc.nextLine();
            System.out.println(line);
            switch (count)
            {
                case 1:
                    obj.add_computer(line);
                    break;
                case 2:
                    obj.remove_computer(line);
                    break;
                case 3:
                    ind = obj.search(line);
                    if (ind == -1) System.out.println("Компьютер не найден");
                    else System.out.println("Компьютер найден под индексом " + ind);

                    break;
                default:
                    break;
            }
        }
    }
}
