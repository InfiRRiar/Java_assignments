package ru.mirea.lab_22;

import java.util.Objects;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        List<Double> stack = new ArrayList<Double>();

        for (int i = 0; i < line.length(); i++) {
            if (is_digit(line.charAt(i))) {
                stack.add(Double.parseDouble(String.valueOf(line.charAt(i))));
            } else {
                if (stack.size() < 2){
                    System.out.println("Чисел меньше, чем надо");
                    return;
                }
                double a = stack.get(stack.size() - 2);
                double b = stack.get(stack.size() - 1);
                stack.remove(stack.size() - 1);
                stack.remove(stack.size() - 1);
                switch (line.charAt(i)) {
                    case '*':
                        stack.add(a * b);
                        break;
                    case '/':
                        stack.add(a / b);
                        break;
                    case '-':
                        stack.add(a - b);
                        break;
                    case '+':
                        stack.add(a + b);
                        break;
                    default:
                        System.out.println("Неверно введена операция");
                        return;
                }
            }
        }
        if (stack.size() != 1) System.out.println("Чисел больше, чем надо");
        else System.out.println(stack.get(0));
    }

    public static boolean is_digit(char line) {
        return !(Objects.equals(line, '*') | Objects.equals(line, '+') | Objects.equals(line, '-') | Objects.equals(line, '/'));
    }
}
