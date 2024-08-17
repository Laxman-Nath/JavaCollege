package borderlayoutdemp;

import javax.swing.*;
import java.awt.BorderLayout;

public class BorderLayoutDemp {

    public BorderLayoutDemp() {
        JFrame frame = new JFrame("BorderLayout demo");
        frame.add(new JButton("EAST"), BorderLayout.EAST);
        frame.add(new JButton("WEST"), BorderLayout.WEST);
        frame.add(new JButton("NORTH"), BorderLayout.NORTH);
        frame.add(new JButton("SOUTH"), BorderLayout.SOUTH);
        frame.add(new JButton("CENTER"), BorderLayout.CENTER);
        frame.setSize(500, 500);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new BorderLayoutDemp();
    }

}
