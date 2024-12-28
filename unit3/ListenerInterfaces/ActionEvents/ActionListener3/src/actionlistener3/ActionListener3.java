/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package actionlistener3;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

class Listener implements ActionListener{
    ActionListener3 a;
    public Listener(ActionListener3 lt){
        this.a=lt;
    }
    @Override
    public void actionPerformed(ActionEvent e){
        this.a.tf.setText("Welcome");
    }
}
public class ActionListener3 extends JFrame{
     JButton b1;
     JTextField tf;
    public ActionListener3(){
        b1=new JButton("Click me");
        tf=new JTextField(20);
        add(b1);
        add(tf);
        Listener l=new Listener(this);
        b1.addActionListener(l);
        setLayout(new FlowLayout());
        setSize(300,300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    public static void main(String[] args) {
        new ActionListener3();
    }
    
}
