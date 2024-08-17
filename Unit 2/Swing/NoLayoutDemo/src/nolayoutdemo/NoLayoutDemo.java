
package nolayoutdemo;

import javax.swing.JButton;
import javax.swing.JFrame;


public class NoLayoutDemo {

   
    public static void main(String[] args) {
        JFrame frame=new JFrame("No Layout demo");
        JButton b1=new JButton("A");
        b1.setBounds(2, 3, 10,10);
        frame.add(b1);
        frame.setLayout(null);
        frame.setSize(300,300);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
