/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package actionlistener1;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import javax.swing.*;
import java.awt.event.ActionListener;
public class ActionListener1 extends JFrame implements ActionListener{
   JButton b1;
   JTextField tf1;
   public ActionListener1(){
       b1=new JButton("Click here");
       tf1=new JTextField(10);
       setLayout(new FlowLayout());
       add(b1);
       add(tf1);
       b1.addActionListener(this);
       setSize(300,300);
       setVisible(true);
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

   }
   @Override
   public void actionPerformed(ActionEvent e){
       tf1.setText("Button is clicked");
}
    
    public static void main(String[] args) {
        new ActionListener1();
    }
    
}
