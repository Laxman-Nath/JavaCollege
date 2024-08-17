/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package keylistener;

import java.awt.FlowLayout;
import java.awt.event.KeyEvent;
import javax.lang.model.util.ElementScanner14;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

/**
 *
 * @author Saitech
 */
public class KeyListener extends JFrame{

public KeyListener(){
     JTextField t4=new JTextField(20);
       JTextField t1=new JTextField(20);
        JTextField t2=new JTextField(20);

        JTextField t3=new JTextField(20);
        setLayout(new FlowLayout());
//        add(b1);
        add(t1);
        add(t2);
        add(t3);
        add(t4);
        t1.addKeyListener(new java.awt.event.KeyListener(){
         @Override
         public void keyTyped(KeyEvent e) {
          t2.setText("Key typed");
          
         }

         @Override
         public void keyPressed(KeyEvent e) {
            t3 .setText("Key pressed");
         }

         @Override
         public void keyReleased(KeyEvent e) {
           t4.setText("Key released");
         }
        });
        
        setSize(400,400);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
}
    public static void main(String[] args) {
        new KeyListener();
    }
    
}
