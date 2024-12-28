
package gridlayoutdemo;


import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;


public class GridLayoutDemo {
public GridLayoutDemo(){
      JFrame frame = new JFrame("BorderLayout demo");
        frame.add(new JButton("A"));
        frame.add(new JButton("B"));
        frame.add(new JButton("C"));
        frame.add(new JButton("D"));
        frame.add(new JButton("E"));
        frame.add(new JButton("F"));
        frame.setLayout(new GridLayout(3,2));
        frame.setSize(500, 500);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}

    public static void main(String[] args) {
        new GridLayoutDemo();
    }
    
}
