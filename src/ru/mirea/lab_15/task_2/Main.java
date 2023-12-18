package ru.mirea.lab_15.task_2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame {
    private JComboBox countries;
    private JTextArea display;
    public Main() {
        setTitle("Урок географии");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        display = new JTextArea();
        display.setEditable(false);
        add(display, BorderLayout.CENTER);

        String[] countriesList = {
                "Australia",
                "China",
                "England",
                "Russia"
        };
        countries = new JComboBox(countriesList);
        add(countries, BorderLayout.NORTH);
        countries.addActionListener(new ClickListener());


        pack();
        setPreferredSize(new Dimension(500, 500));
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private class ClickListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JComboBox selected = (JComboBox) e.getSource();
            String country = (String) selected.getSelectedItem();
            switch (country) {
                case "Russia":
                    display.setText("Россия - первое по площади государство в мире.\nСтолица: Москва\nПолностью окружает автора программы со всех сторон");
                    break;
                case "Australia":
                    display.setText("Австралия - шестое по площади государство в мире.\nСтолица: Канберра");
                    break;
                case "England":
                    display.setText("Англия - ну, довольно небольшое государство.\nСтолица: Лондон");
                    break;
                case "China":
                    display.setText("Китай - четвертое по площади государство в мире.\nСтолица: Шанхай");
                    break;
                default:
                    break;
            }
        }
    }

    public static void main(String[] args) {
        new Main();
    }

}


