package ru.mirea.lab2.task_9;
import java.util.Scanner;

public class DeckTest {
    public static void main(String[] args) {
        Deck poker = new Deck();
        poker.generate_deck();
        System.out.println("Какое количество человек будет принимать участие в игре? ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        poker.card_draw(n);
    }
}
