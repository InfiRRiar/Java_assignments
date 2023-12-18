package ru.mirea.lab_16.task_2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main extends JFrame {

    JMenuBar bar = new JMenuBar();
    JMenu font = new JMenu("Шрифт");
    JMenu color = new JMenu("Цвет");

    JTextArea text = new JTextArea();

    Main() {
        text.setText("Там крч что-то про булочки и чай, чтобы все буквы проверить");
        text.setFont(new Font("Times New Roman", Font.PLAIN, 12));

        JMenuItem blue = new JMenuItem("Синий");
        JMenuItem red = new JMenuItem("Красный");
        JMenuItem black = new JMenuItem("Чёрный");
        color.add(blue);
        color.add(red);
        color.add(black);

        JMenuItem TNR = new JMenuItem("Times New Roman");
        JMenuItem MSSS = new JMenuItem("MS Sans Serif");
        JMenuItem CN = new JMenuItem("Courier New");
        font.add(TNR);
        font.add(MSSS);
        font.add(CN);

        TNR.addActionListener(new Choose());
        MSSS.addActionListener(new Choose());
        CN.addActionListener(new Choose());
        blue.addActionListener(new Choose());
        red.addActionListener(new Choose());
        black.addActionListener(new Choose());

        bar.add(font);
        bar.add(color);

        add(bar, BorderLayout.NORTH);
        add(text, BorderLayout.SOUTH);

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private class Choose implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String line = e.getActionCommand();
            System.out.println(line);
            switch (line) {
                case "Times New Roman":
                    text.setFont(new Font("Times New Roman", Font.PLAIN, 12));
                    break;
                case "MS Sans Serif":
                    text.setFont(new Font("MS Sans Serif", Font.PLAIN, 12));
                    break;
                case "Courier New":
                    text.setFont(new Font("Courier New", Font.PLAIN, 12));
                    break;
                case "Синий":
                    text.setForeground(new Color(30, 144, 255));
                    break;
                case "Чёрный":
                    text.setForeground(new Color(0, 0, 0));
                    break;
                case "Красный":
                    text.setForeground(new Color(248, 23, 62));
                    break;
            }
        }
    }

    public static void main(String[] args) {
        new Main();
    }


}
