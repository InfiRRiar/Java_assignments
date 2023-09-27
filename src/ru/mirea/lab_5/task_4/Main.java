package ru.mirea.lab_5.task_4;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(new Dimension(500, 500));

        String line;
        String PATH = "C:\\Users\\sereb\\IdeaProjects\\MIREA_term_3\\src\\ru\\mirea\\lab_5\\task_4\\";
        int x = 1;

        Task_4 obj = new Task_4(PATH + "1.PNG");
        frame.add(obj);


        frame.setVisible(true);

        while (true) {
            x += 1;

            System.out.println(x);
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            line = x % 3 + 1 + ".PNG";
            obj.setPath(PATH + line);
            obj.repaint();

        }
    }
}
