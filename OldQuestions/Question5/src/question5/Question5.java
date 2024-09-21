
package question5;

import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.*;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Question5 extends  JFrame implements MouseListener{
     JPanel p1=new JPanel();
     JPanel p2=new JPanel();
     JPanel p3=new JPanel();
     JTextField t1=new JTextField(10);
     JTextField t2=new JTextField(10);
     JTextField t3=new JTextField(10);
     JLabel l1=new JLabel("a");
     JLabel l2=new JLabel("b");
     JLabel l3=new JLabel("result");
    public Question5() {
        p1.add(l1);
        p1.add(t1);
        p2.add(l2);
        p2.add(t2);
        p3.add(l3);
        p3.add(t3);
        add(p1);
        add(Box.createHorizontalStrut(98));
        add(p2);
        add(Box.createHorizontalStrut(71));
        add(p3);
        t3.addMouseListener(this);
        setLayout(new FlowLayout(FlowLayout.CENTER));
        setSize(300,300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    @Override
            public void mouseClicked(MouseEvent e) {
               System.out.println("Mouse clicked");
            }

            @Override
            public void mousePressed(MouseEvent e) {
              System.out.println("Mouse is pressed");
                 System.out.println("Mouse is Entered");
                 int num1 = Integer.parseInt(t1.getText());
                int num2=Integer.parseInt(t2.getText());
                t3.setText(Integer.toString(num1+num2));
            }

            @Override
            public void mouseReleased(MouseEvent e){
                 int num1=Integer.parseInt(t1.getText());
                 int num2=Integer.parseInt(t2.getText());
                 t3.setText("");
                 t3.setText(Integer.toString(num1-num2));
            }

            @Override
            public void mouseEntered(MouseEvent e) {
              
            }

            @Override
            public void mouseExited(MouseEvent e) {
               System.out.println("Mouse is Exited");
            }


  
    public static void main(String[] args) {
        // TODO code application logic here
        new Question5();
    }
    
}
