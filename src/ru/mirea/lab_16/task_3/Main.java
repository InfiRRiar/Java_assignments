package ru.mirea.lab_16.task_3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Main extends JFrame{
    JPanel grid = new JPanel(new GridBagLayout());
    GridBagConstraints c = new GridBagConstraints();
    Main(){

        c.insets = new Insets(5, 5, 5, 5);


        c.fill = GridBagConstraints.NONE;
        c.weightx = 0.5;
        c.gridx = 0;
        c.gridy = 0;
        JLabel text1 = new JLabel("Service: ");
        c.anchor = GridBagConstraints.LINE_END;
        grid.add(text1, c);

        c.weightx = 2;
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 1;
        JTextField input1 = new JTextField();
        c.anchor = GridBagConstraints.LINE_START;
        input1.setEditable(false);
        grid.add(input1, c);

        c.weightx = 1;
        c.fill = GridBagConstraints.NONE;
        c.gridx = 0;
        c.gridy = 1;
        JLabel text2 = new JLabel("Username: ");
        c.anchor = GridBagConstraints.LINE_END;
        grid.add(text2, c);

        c.weightx = 2;
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 1;
        JTextField input2 = new JTextField();
        c.anchor = GridBagConstraints.LINE_START;
        input1.setEditable(false);
        grid.add(input2, c);

        c.weightx = 1;
        c.fill = GridBagConstraints.NONE;
        c.gridx = 0;
        c.gridy = 2;
        JLabel text3 = new JLabel("Password: ");
        c.anchor = GridBagConstraints.LINE_END;
        grid.add(text3, c);


        c.weightx = 2;
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 1;
        JTextField input3 = new JTextField();
        c.anchor = GridBagConstraints.LINE_START;
        input1.setEditable(false);
        grid.add(input3, c);


        add(grid, BorderLayout.CENTER);

        pack();
        setPreferredSize(new Dimension(500, 500));
        //setLocationRelativeTo(null);
        setVisible(true);

    }

    public static void main(String[] args) {
        new Main();
    }
}
