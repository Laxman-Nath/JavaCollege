/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package grouplayoutdemo;

//import java.awt.Container;
import javax.swing.*;


/**
 *
 * @author Saitech
 */
public class GroupLayoutDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create a new frame
        JFrame frame = new JFrame("GroupLayout Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Create a panel to hold the components
        JPanel panel = new JPanel();
        GroupLayout layout = new GroupLayout(panel);
        panel.setLayout(layout);
        
        // Automatically create gaps between components
        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);
        
        // Create components
        JLabel nameLabel = new JLabel("Name:");
        JTextField nameField = new JTextField(20);
        
        JLabel emailLabel = new JLabel("Email:");
        JTextField emailField = new JTextField(20);
        
        JLabel phoneLabel = new JLabel("Phone:");
        JTextField phoneField = new JTextField(20);
        
        JButton submitButton = new JButton("Submit");
        
        // Define the horizontal group
        layout.setHorizontalGroup(
            layout.createSequentialGroup()
              .addGroup(layout.createParallelGroup()
              .addComponent(nameLabel)
              .addComponent(emailLabel)
              .addComponent(phoneLabel))
              .addGroup(layout.createParallelGroup()
               .addComponent(nameField)
                .addComponent(emailField)
              .addComponent(phoneField)
              .addComponent(submitButton))
        );
        
        // Define the vertical group
        layout.setVerticalGroup(
            layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup()
                        .addComponent(nameLabel)
                        .addComponent(nameField))
                .addGroup(layout.createParallelGroup()
                        .addComponent(emailLabel)
                        .addComponent(emailField))
                .addGroup(layout.createParallelGroup()
                        .addComponent(phoneLabel)
                        .addComponent(phoneField))
                .addComponent(submitButton)
        );
        
        // Add the panel to the frame
        frame.add(panel);
        
        // Pack the frame to fit its content
        frame.pack();
        
        // Center the frame on the screen
        frame.setLocationRelativeTo(null);
        
        // Make the frame visible
        frame.setVisible(true);
    }
    
}
