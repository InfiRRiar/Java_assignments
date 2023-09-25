package ru.mirea.lab_5;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Task2_1 extends JFrame {
    Task2_1() {
        super("Damn task");
        setSize(500, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        Random rand = new Random();
        Color[] colors = new Color[]{Color.BLACK, Color.BLUE, Color.RED, Color.CYAN, Color.GREEN};
        for (int i = 0; i < 20; i++) {
            int choice = rand.nextInt(1, 4);

            switch (choice) {
                case 1 -> g.drawOval(rand.nextInt(50, 450), rand.nextInt(50, 450),
                        rand.nextInt(20, 40), rand.nextInt(20, 40));
                case 2 -> g.drawRect(rand.nextInt(50, 450), rand.nextInt(50, 450),
                        rand.nextInt(20, 40), rand.nextInt(20, 40));
                case 3 -> g.drawLine(rand.nextInt(50, 450), rand.nextInt(50, 450),
                        rand.nextInt(5, 450), rand.nextInt(5, 450));
            }

            g.setColor(colors[rand.nextInt(0, 5)]);
        }
    }
}
