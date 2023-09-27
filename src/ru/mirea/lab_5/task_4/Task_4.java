package ru.mirea.lab_5.task_4;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class Task_4 extends JPanel {
    String path;

    Task_4(String image_path) {
        setSize(500, 500);
        path = image_path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Image image;
        try {
            image = ImageIO.read(new File(this.path));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        g.drawImage(image, 0, 0, null);

    }
}
