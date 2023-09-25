package ru.mirea.lab_5;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import javax.swing.*;

public class Task_3 extends JFrame {
    String path;

    Task_3(String image_path) {
        super("Damn task");
        setSize(1024, 768);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        path = image_path;
    }

    public void paint(Graphics g) {
        Image image;
        try {
            image = ImageIO.read(new File(this.path));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        g.drawImage(image, 0, 0, null);

    }
}
