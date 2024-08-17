package flowlayoutdemo;

import java.awt.Canvas;
import javax.swing.*;
import java.awt.FlowLayout;

public class FlowLayoutDemo extends JFrame {

    JLabel l1;
    JLabel l2;
    JLabel l3;
    JLabel l4;
    JLabel l5;

    JTextField t1;
    JTextField t2;

    JCheckBox c1;
    JCheckBox c2;
    JCheckBox c3;

    JRadioButton r1;
    JRadioButton r2;
    JRadioButton r3;
    JPanel radio;

    JPanel panel;

    JTextArea description;
    
     JScrollPane scrollPane ;
    ButtonGroup group;
    JButton b1;

    public FlowLayoutDemo() {
        super("Swing demo");
        l1 = new JLabel("Name");
        l2 = new JLabel("Address");
        l3 = new JLabel("Hobbies");
        l4 = new JLabel("Gender");
        l5 = new JLabel("Description");

        t1 = new JTextField(30);
        t2 = new JTextField(30);

        b1 = new JButton("OK");

        panel = new JPanel();
        panel.add(new JCheckBox("Playing"));
        panel.add(new JCheckBox("eating"));
        panel.add(new JCheckBox("reading"));

        r1 = new JRadioButton("Male");
        r2 = new JRadioButton("Female");
        r3 = new JRadioButton("Others");

        group = new ButtonGroup();
        radio = new JPanel();

//        description = new JTextArea(10, 30);
          description=new JTextArea();
           description.setText("This is a JTextArea inside a JScrollPane.\n"
                       + "You can add more text here...\n"
                       + "And the scrollbars will appear if the content is too large."
                   + "hjkfdslfgdkjlfhdfhkgfhgfhkgfsjkldfhjksfdfhk"
                   + "kdasfjjkdsjklfjkdljklfdskjlfadsj"
                   + "fdshkjafdjkadfskjkdsfhjfsdk"
                   + "fkjajkdjfsdkj");
        
        scrollPane=new JScrollPane(description);
       scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);  
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);  
        group.add(r1);
        group.add(r2);
        group.add(r3);
        radio.add(r1);
        radio.add(r2);
        radio.add(r3);
//        setLayout(new FlowLayout());
        setLayout(new FlowLayout(FlowLayout.CENTER, 30, 10));
        add(l1);
        add(t1);
        add(l2);
        add(t2);

        add(l3);
        add(panel);

        add(Box.createHorizontalStrut(80));

        add(l4);
        add(radio);

        add(Box.createHorizontalStrut(58));

        add(l5);
        add(scrollPane);
//        add(description);
        add(b1);
    }

    public static void main(String[] args) {
        FlowLayoutDemo f = new FlowLayoutDemo();
        f.setSize(500, 500);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
