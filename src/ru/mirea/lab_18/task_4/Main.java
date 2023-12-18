package ru.mirea.lab_18.task_4;

import java.util.Scanner;

public class Main {
    public static void exceptionDemo() {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter an integer ");
        String intString = myScanner.next();
        try {
            int i = Integer.parseInt(intString);
            System.out.println(2 / i);
        } catch (NumberFormatException e) {
            System.out.println("Введено не целое число");
        }
        catch (ArithmeticException e) {
            System.out.println("Арифмитическая ошибка");
        }
        finally {
            System.out.println("Это сообщение финальное");
        }
    }

    public static void main(String[] args) {
        // qwerty -> NumberFormatException
        // 0 -> ArithmeticException
        // 1.2 -> NumberFormatException
        // 1. -> NumberFormatException
        exceptionDemo();
    }
}