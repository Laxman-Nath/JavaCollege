package question4;

import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.geom.Path2D;
import javax.lang.model.util.ElementScanner14;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Saitech
 */
public class Question4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // using grid layout
        JFrame frame = new JFrame("Calc");
        JPanel panel = new JPanel();
//        frame.setLayout(new GridLayout(3, 1));
        JTextField t1 = new JTextField(10);
        JTextField t2 = new JTextField(10);
        JTextField t3 = new JTextField(10);
        panel.add(new JLabel("First number"));
        panel.add(t1);
        panel.add(new JLabel("Second number"));
        panel.add(t2);
        panel.add(new JLabel("Result"));

        panel.add(t3);
        panel.setLayout(new GridLayout(3, 1));
        t3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int num1 = Integer.parseInt(t1.getText());
                int num2=Integer.parseInt(t2.getText());
                t3.setText(Integer.toString(num1+num2));
            }
        });
         t3.addMouseListener(new MouseListener(){
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
        
    });
        frame.add(panel, BorderLayout.CENTER);
        frame.setSize(400, 400);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
