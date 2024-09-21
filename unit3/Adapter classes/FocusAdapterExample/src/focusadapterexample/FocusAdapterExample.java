/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package focusadapterexample;

import java.awt.FlowLayout;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import javax.swing.JTextField;
import javax.swing.JFrame;

public class FocusAdapterExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Focus Adapter Example");
        frame.setLayout(new FlowLayout());
        JTextField textField = new JTextField(20);
        textField.addFocusListener(new FocusAdapter() {
            public void focusGained(FocusEvent e) {
                System.out.println("Text field focused");
            }
        });
        frame.add(textField);
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}