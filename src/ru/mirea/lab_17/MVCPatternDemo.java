package ru.mirea.lab_17;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class MVCPatternDemo {

    public static void main(String[] args) {

        Student student = retrieveStudentFromDatabase();
        StudentView view = new StudentView();
        StudentController controller = new StudentController(student, view);

        JFrame frame = new JFrame("MVC Pattern Demo");
        JPanel grid = new JPanel(new GridLayout(3, 2));

        JTextField name = new JTextField();
        JTextField role = new JTextField();

        JButton set = new JButton("Set");
        JButton update = new JButton("Update");

        grid.add(name);
        grid.add(role);
        grid.add(set);
        grid.add(update);

        frame.add(grid);

        JTextArea output = new JTextArea();
        output.setEditable(false);
        frame.add(output, BorderLayout.SOUTH);
        set.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.updateView();
                output.setText(controller.getStudentName() + " " + controller.getStudentRollNo());
            }
        });

        update.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.setStudentName(name.getText());
                controller.setStudentRollNo(role.getText());
                controller.updateView();
            }
        });

        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    private static Student retrieveStudentFromDatabase() {
        Student student = new Student();
        student.setName("Student 1");
        student.setRollNo("Role 1");

        return student;
    }
}
