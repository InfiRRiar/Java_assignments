package ru.mirea.lab_5.task_1;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Task_1 {
    public static int scoreMadrid = 0, scoreMilan = 0;
    public static JLabel last_score = new JLabel("Last Scorer: N/A");
    public static JLabel winner = new JLabel("Winner: DRAW");

    public static void main(String[] args) {
        JFrame frame = new JFrame("Milan vs Madrid");
        frame.setSize(500, 500);

        JLabel score = new JLabel("0:0");

        JPanel match = new JPanel();
        match.setPreferredSize(new Dimension(500, 500));

        JButton buttonMilan = new JButton("Milan");
        JButton buttonMadrid = new JButton("Madrid");

        match.add(buttonMilan);
        match.add(score);
        match.add(buttonMadrid);

        match.add(last_score);
        match.add(winner);


        frame.add(match);

        frame.setLayout(new GridBagLayout());


        frame.setVisible(true);

        buttonMilan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                scoreMilan++;
                score.setText(scoreMilan + ":" + scoreMadrid);
                last_score.setText("Last Scorer: Milan");
                decide_winner();
            }
        });

        buttonMadrid.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                scoreMadrid++;
                score.setText(scoreMilan + ":" + scoreMadrid);
                last_score.setText("Last Scorer: Madrid");
                decide_winner();

            }
        });
        //JPanel panelMadrid = new JPanel();
        //JLabel labelMadrid = new JLabel();
    }

    public static void decide_winner() {
        if (scoreMadrid == scoreMilan) {
            winner.setText("Winner: DRAW");
        } else if (scoreMadrid > scoreMilan) {
            winner.setText("Winner: Madrid");
        } else {
            winner.setText("Winner: Milan");
            return;
        }
    }


}
