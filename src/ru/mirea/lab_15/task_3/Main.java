package ru.mirea.lab_15.task_3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Main extends JFrame{
    private JMenuBar bar = new JMenuBar();

    Main() {
        JMenu file = new JMenu("File");
        JMenu edit = new JMenu("Edit");
        JMenu help = new JMenu("Help");

        bar.add(file);
        bar.add(edit);
        bar.add(help);

        JMenuItem save = new JMenuItem("Сохранить");
        JMenuItem exit = new JMenuItem("Выйти");
        JMenu change = new JMenu("Правка");

        file.add(save);
        file.add(exit);
        file.add(change);

        JMenuItem copy = new JMenuItem("Копировать");
        JMenuItem cut = new JMenuItem("Вырезать");
        JMenuItem paste = new JMenuItem("Вставить");

        change.add(copy);
        change.add(cut);
        change.add(paste);

        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");


        add(bar, BorderLayout.NORTH);

        add(button1, BorderLayout.WEST);
        add(button2, BorderLayout.EAST);


        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Main();
    }
}
