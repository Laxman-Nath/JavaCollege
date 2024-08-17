/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication106;

import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;


public class JavaApplication106 extends JFrame {

    
   public JavaApplication106(){
       JButton b1=new JButton("click me");
       JTextField t1=new JTextField(20);
        JTextField t2=new JTextField(20);

        JTextField t3=new JTextField(20);

        JTextField t4=new JTextField(20);
        JTextField t5=new JTextField(20);
        
        setLayout(new FlowLayout());
        add(b1);
        add(t1);
        add(t2);
        add(t3);
        add(t4);
        add(t5);
        b1.addMouseListener(new MouseListener(){
            public void mousePressed(MouseEvent e){
                t1.setText("mouse pressed");
            }
            public void mouseClicked(MouseEvent e){
                t2.setText("Mouse clicked");
            }
            public void mouseReleased(MouseEvent e){
                t3.setText("Mouse released");
            }
            public void mouseEntered(MouseEvent e){
                t4.setText("MouseEntered");
            }public void mouseExited(MouseEvent e){
                t5.setText("MouseExited");
            }
            
        });
          
        setSize(400,400);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
       
   }
  
    public static void main(String[] args) {
        new JavaApplication106();
    }

        
}
