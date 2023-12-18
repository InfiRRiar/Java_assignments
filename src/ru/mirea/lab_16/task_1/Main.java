package ru.mirea.lab_16.task_1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;
public class Main extends JFrame {
    private JTextField text = new JTextField("Попробуйте угадать число");
    private JTextField input = new JTextField();
    private JButton button;
    Random rand = new Random();
    private final int count = rand.nextInt(1, 21);
    private int status = 0;

    Main(){

        button = new JButton("Submit");
        button.addActionListener(new ButtonListener());

        text.setEditable(false);
        JPanel layout = new JPanel(new GridLayout(3, 1, 0, 10));
        layout.add(text);
        layout.add(input);
        layout.add(button);

        add(layout);
        addMouseListener(new Mouse());

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private class Mouse implements MouseListener
    {
        @Override
        public void mouseClicked(MouseEvent e) {
        }
        @Override
        public void mousePressed(MouseEvent e) {
        }
        @Override
        public void mouseReleased(MouseEvent e) {
        }
        @Override
        public void mouseEntered(MouseEvent e) {
            if (status == -1 || status == 3) {
                Point point = e.getPoint();
                if (point.x < getWidth() / 5) {
                    JOptionPane.showMessageDialog(new JFrame(), "Добро пожаловать в ЗАО");
                } else if (point.x > 4 * getWidth() / 5) {
                    JOptionPane.showMessageDialog(new JFrame(), "Добро пожаловать в ВАО");
                } else if (point.y < getHeight() / 5) {
                    JOptionPane.showMessageDialog(new JFrame(), "Добро пожаловать в САО");
                } else if (point.y > 4 * getHeight() / 5) {
                    JOptionPane.showMessageDialog(new JFrame(), "Добро пожаловать ЮАО");
                } else if (getHeight() / 5 * 2 < point.y && point.y < getHeight() / 5 * 3 && getWidth() / 5 * 2 < point.x && point.x < getWidth() / 5 * 3){
                    JOptionPane.showMessageDialog(new JFrame(), "Добро пожаловать в ЦАО");
                }
            }
        }
        @Override
        public void mouseExited(MouseEvent e) {
        }
    }

    private class ButtonListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (-1 < status && status < 3) {
                int num = Integer.parseInt(input.getText());
                System.out.println(count);
                if (count == num) {
                    text.setText("Поздравляем! Вы угадали.");
                    status = -1;
                } else if (count > num) {
                    text.setText("Настоящее число больше");
                    status++;
                } else {
                    text.setText("Настоящее число меньше");
                    status++;
                }
                if (status == 3)
                {
                    text.setText("Поздравляем! Вы проиграли");
                }
            }
        }
    }

    public static void main(String[] args) {
        new Main();
    }

}


