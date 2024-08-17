/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package scrollpaneexample;

import javax.swing.*;

public class ScrollPaneExample {
    public static void main(String[] args) {
        // Create a JFrame
        JFrame frame = new JFrame("JScrollPane Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        // Create a JTextArea with a lot of text
        JTextArea textArea = new JTextArea(20, 30);
        textArea.setText("This is a long text area...\n" + "Add more content here to make it scrollable.\n".repeat(50));

        // Create a JScrollPane and add the JTextArea to it
        JScrollPane scrollPane = new JScrollPane(textArea);

        // Add the JScrollPane to the JFrame
        frame.add(scrollPane);

        // Make the frame visible
        frame.setVisible(true);
    }
}
