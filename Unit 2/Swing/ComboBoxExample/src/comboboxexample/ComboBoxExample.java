
package comboboxexample;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ComboBoxExample {
    public static void main(String[] args) {
        // Create a new JFrame
        JFrame frame = new JFrame("JComboBox Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

      String options[]={"opt1","opt2","opt3"};
      JComboBox<String> comboBox=new JComboBox<>(options);
      
      comboBox.addActionListener((ActionEvent e)->{
          JOptionPane.showMessageDialog(frame, "Selected option:"+comboBox.getSelectedItem());
      });
              

        // Add the combo box to the frame
        frame.getContentPane().add(comboBox);
        frame.setVisible(true);
    }
}