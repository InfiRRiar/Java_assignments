package ru.mirea.lab_24.task_3;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class Window extends JFrame {
    public Window(ICreateDocument doc){
        JMenuBar bar = new JMenuBar();

        JMenu menu = new JMenu("File");

        JMenuItem create = new JMenuItem("Create");
        JMenuItem open = new JMenuItem("Open");
        JMenuItem save = new JMenuItem("Save");
        JMenuItem exit = new JMenuItem("Exit");

        create.addActionListener(new Listen(doc));
        open.addActionListener(new Listen(doc));
        save.addActionListener(new Listen(doc));
        exit.addActionListener(new Listen(doc));

        menu.add(create);
        menu.add(open);
        menu.add(save);
        menu.add(exit);

        bar.add(menu);
        add(bar, BorderLayout.NORTH);

        setSize(600, 400);
        setVisible(true);
        setLocationRelativeTo(null);
    }

    private static class Listen implements ActionListener {
        ICreateDocument create;
        IDocument document = null;
        Listen(ICreateDocument create)
        {
            this.create = create;
        }
        @Override
        public void actionPerformed(ActionEvent e) {
            String line = e.getActionCommand();
            System.out.println(line);
            switch (line)
            {
                case "Create":
                    try {
                        document = create.createNew();
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                    break;
                case "Open":
                    try {
                        document = create.createOpen();
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                    break;
                case "Save":
                    if (document == null) break;
                    document.save();
                    break;
                case "Exit":
                    document.exit();

            }
        }
    }

    public static void main(String [] args) throws IOException {
        ICreateDocument create = new CreateTextDocument();

        new Window(create);
    }
}
