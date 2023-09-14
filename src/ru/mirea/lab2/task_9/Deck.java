package ru.mirea.lab2.task_9;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {
    String[] quality;
    String[] suits;
    ArrayList<String> deck;

    Deck() {
        quality = new String[]{"2", "3", "4", "5", "6", "7", "8", "9", "10",
                "Jack", "Queen", "King", "Ace"};
        suits = new String[]{"clubs", "diamonds", "hearts", "spades"};
        deck = new ArrayList<String>();
    }

    public void generate_deck() {
        for (String s : quality) {
            for (String suit : suits) {
                deck.add(s + " " + suit);
            }
        }
        Collections.shuffle(deck);
    }
    //14
    public void card_draw(int n) {
        String line = "";
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < n; j++) {
                line = deck.get(0);
                System.out.print(line);
                deck.remove(0);
                for (int k = 0; k < 16 - line.length(); k++) System.out.print(" ");
            }
            System.out.println();
        }
    }

}
