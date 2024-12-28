package gridbaglayout;

import java.awt.GridBagConstraints;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GridBagLayout {

    public static void main(String[] args) {
        JFrame frame = new JFrame("GridBagLayout demo");
        JPanel panel = new JPanel(new java.awt.GridBagLayout());

        GridBagConstraints c1 = new GridBagConstraints();
        c1.fill = GridBagConstraints.HORIZONTAL;
        c1.gridx=0;
        c1.gridy=1;
        panel.add(new JButton("A"),c1);
        
         GridBagConstraints c2 = new GridBagConstraints();
        c2.fill = GridBagConstraints.HORIZONTAL;
        c2.gridx=1;
        c2.gridy=1;
        panel.add(new JButton("B"),c2);
        
         GridBagConstraints c3 = new GridBagConstraints();
        c3.fill = GridBagConstraints.HORIZONTAL;
        c3.gridx=2;
        c3.gridy=1;
        panel.add(new JButton("C"),c3);
        
         GridBagConstraints c4 = new GridBagConstraints();
        c4.fill = GridBagConstraints.HORIZONTAL;
        c4.gridx=0;
        c4.gridy=2;
        panel.add(new JButton("D"),c4);
        
        frame.add(panel);

        frame.setSize(300, 300);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}
