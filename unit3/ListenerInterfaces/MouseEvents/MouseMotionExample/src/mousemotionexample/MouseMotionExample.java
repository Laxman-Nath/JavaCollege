/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mousemotionexample;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MouseMotionExample extends JFrame implements MouseMotionListener {

    private JLabel statusLabel;

    public MouseMotionExample() {
        // Set up the frame
        setTitle("Mouse Motion Listener Example");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Create a label to display the mouse position
        statusLabel = new JLabel("Move the mouse or drag it!", JLabel.CENTER);
        add(statusLabel, BorderLayout.SOUTH);

        // Add MouseMotionListener to the frame
        addMouseMotionListener(this);
    }

    // Called when the mouse is moved
    @Override
    public void mouseMoved(MouseEvent e) {
        statusLabel.setText("Mouse Moved: X=" + e.getX() + ", Y=" + e.getY());
    }

    // Called when the mouse is dragged
    @Override
    public void mouseDragged(MouseEvent e) {
        statusLabel.setText("Mouse Dragged: X=" + e.getX() + ", Y=" + e.getY());
    }

    public static void main(String[] args) {
        // Run the example on the Event Dispatch Thread (EDT)
        SwingUtilities.invokeLater(() -> {
            MouseMotionExample example = new MouseMotionExample();
            example.setVisible(true);
        });
    }
}