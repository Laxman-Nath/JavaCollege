
package javaapplication154;

import java.awt.FlowLayout;
import java.awt.event.ItemListener;
import javax.swing.JCheckBox;
import javax.swing.JFrame;


public class ItemEventDemo extends  JFrame{

    public ItemEventDemo(){
        JCheckBox yes=new JCheckBox("yes");

        hobbies.addItemListener(((e) -> {
            System.out.println("Item state changed");
        }));
        add(hobbies);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300,300);
        setVisible(true);
        setLayout(new FlowLayout());
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        new ItemEventDemo();
    }
    
}
