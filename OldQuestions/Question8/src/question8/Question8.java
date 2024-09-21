/*
Using swing components design a form with three buttons with captions
RED,BLUE and GREEEN.write  a program to handle the event such that when 
the user click the button ,the color of the button will be same as it's
caption

 */
package question8;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Question8 extends JFrame {

    JButton red = new JButton("RED");
    JButton blue = new JButton("BLUE");
    JButton green = new JButton("GREEN");

    public Question8() {
        red.setBounds(180, 20, 100, 50);
        blue.setBounds(180, 80, 100, 50);
        green.setBounds(180, 140, 100, 50);
        add(red);
        add(blue);
        add(green);
        red.addActionListener((ActionEvent e) -> red.setBackground(Color.red));

        blue.addActionListener((ActionEvent e) -> blue.setBackground(Color.BLUE));
        green.addActionListener((ActionEvent e) -> green.setBackground(Color.GREEN));
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400);
    }

    public static void main(String[] args) {
        new Question8();
    }

}
