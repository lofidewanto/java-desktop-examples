package org.example;

import javax.swing.*;

public class App {

    public static void main(String[] args) {
        // Create a new JFrame (window)
        JFrame frame = new JFrame("Hello, Swing World!");

        // Create a label to display the message
        JLabel label = new JLabel("Hello, Swing World!", SwingConstants.CENTER);

        // Set label font size
        label.setFont(new java.awt.Font("Arial", java.awt.Font.PLAIN, 24));

        // Add the label to the frame
        frame.add(label);

        // Set frame properties
        frame.setSize(400, 200);  // Set size of the window
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // Exit on close
        frame.setVisible(true);  // Make the window visible
    }
}
