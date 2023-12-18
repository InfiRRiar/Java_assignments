package ru.mirea.lab_15;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame {
    private JTextField display;
    private double firstOperand = 0;
    private String operator = "";
    private boolean isTyping = false;

    public Main() {
        setTitle("Калькулятор");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        display = new JTextField();
        display.setEditable(false);
        add(display, BorderLayout.NORTH);

        JPanel buttonPanel = new JPanel(new GridLayout(4, 4));
        String[] buttonLabels = {
                "7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "-",
                "0", ".", "=", "+"
        };

        for (String label : buttonLabels) {
            JButton button = new JButton(label);
            button.addActionListener(new ButtonClickListener());
            buttonPanel.add(button);
        }

        add(buttonPanel, BorderLayout.SOUTH);

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private class ButtonClickListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String command = e.getActionCommand();

            if (command.matches("[0-9.]")) {
                if (isTyping) {
                    display.setText(display.getText() + command);
                } else {
                    display.setText(command);
                    isTyping = true;
                }
            } else if (command.matches("[-+*/]")) {
                if (isTyping) {
                    firstOperand = Double.parseDouble(display.getText());
                    operator = command;
                    isTyping = false;
                }
            } else if (command.equals("=")) {
                if (isTyping) {
                    double secondOperand = Double.parseDouble(display.getText());
                    double result = 0;
                    switch (operator) {
                        case "+":
                            result = firstOperand + secondOperand;
                            break;
                        case "-":
                            result = firstOperand - secondOperand;
                            break;
                        case "*":
                            result = firstOperand * secondOperand;
                            break;
                        case "/":
                            if (secondOperand != 0) {
                                result = firstOperand / secondOperand;
                            } else {
                                display.setText("Ошибка");
                            }
                            break;
                    }
                    display.setText(String.valueOf(result));
                    isTyping = false;
                }
            }
        }
    }

    public static void main(String[] args) {
        new Main();
    }
}