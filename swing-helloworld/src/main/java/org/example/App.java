package org.example;

import java.awt.*;

public class App {

    public static void main(String[] args) {
        // Create a frame
        Frame frame = new Frame("Hello, AWT World!");

        // Create a label to display the message
        Label label = new Label("Hello, AWT World!", Label.CENTER);

        // Set the label font size
        label.setFont(new Font("Arial", Font.PLAIN, 24));

        // Add the label to the frame
        frame.add(label);

        // Set frame size and visibility
        frame.setSize(400, 200);
        frame.setVisible(true);

        // Add window listener to close the application when the window is closed
        frame.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent we) {
                System.exit(0);
            }
        });
    }
}
