package ru.mirea.lab_17;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class StudentView extends JFrame{
    void printViewDetails(String name, String role) {
        System.out.println("Student details: ");
        System.out.println("Name: " + name);
        System.out.println("Role: " + role);
    }
}
