package borderdemo;

import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.BorderFactory;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EtchedBorder;

public class BorderDemo extends JFrame {

    JLabel l1;
    JTextField t1;
    JButton btn1;
    JPanel p1;

    public BorderDemo() {
        l1 = new JLabel("Name");
        t1 = new JTextField(10);
        btn1 = new JButton("Submit");
        p1 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        p1.add(l1);
        p1.add(t1);
        p1.add(btn1);
//        p1.setBorder(BorderFactory.createLineBorder(Color.yellow,20));
//          p1.setBorder(BorderFactory.createTitledBorder( "Login"));
//        p1.setBorder(BorderFactory.createEmptyBorder(100, 5, 5, 5));
        p1.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
//         p1.setBorder(BorderFactory.createCompoundBorder(
//            BorderFactory.createLineBorder(Color.BLUE, 5),
//            BorderFactory.createEmptyBorder(10, 10, 10, 10)
//        ));
        add(p1);
        setLayout(new FlowLayout());
        setSize(400, 400);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new BorderDemo();
    }

}
