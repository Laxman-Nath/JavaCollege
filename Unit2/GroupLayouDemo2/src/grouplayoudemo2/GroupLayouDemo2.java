/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package grouplayoudemo2;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GroupLayouDemo2 {
    
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        GroupLayout gl = new GroupLayout(panel);
        panel.setLayout(gl);
        JLabel nameLabel = new JLabel("Name:");
        JTextField nameField = new JTextField(20);
        
        JLabel emailLabel = new JLabel("Email:");
        JTextField emailField = new JTextField(20);
        
        JLabel phoneLabel = new JLabel("Phone:");
        JTextField phoneField = new JTextField(20);
        gl.setHorizontalGroup(gl.createSequentialGroup().addGroup(gl.createParallelGroup().addComponent(nameLabel).addComponent(emailLabel).addComponent(phoneLabel)).addGroup(gl.createParallelGroup().addComponent(nameField).addComponent(emailField).addComponent(phoneField)));
        gl.setVerticalGroup(gl.createSequentialGroup().addGroup(gl.createParallelGroup().addComponent(nameLabel).addComponent(nameField))
        .addGroup(gl.createParallelGroup().addComponent(emailLabel).addComponent(emailField))
        .addGroup(gl.createParallelGroup().addComponent(phoneLabel).addComponent(phoneField)));
        
        frame.add(panel);
        frame.pack();
        frame.setLocationRelativeTo(null);
            // Make the frame visible
        frame.setVisible(true);
          frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
}
