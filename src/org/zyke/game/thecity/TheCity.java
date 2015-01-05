package org.zyke.game.thecity;

import javax.swing.JFrame;

public class TheCity extends JFrame {

    public TheCity() {

        add(new TitleScreen());

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);
        setTitle("The City");
        setResizable(false);
        setVisible(true);
    }

    public static void main(String[] args) {
        new TheCity();
    }
}