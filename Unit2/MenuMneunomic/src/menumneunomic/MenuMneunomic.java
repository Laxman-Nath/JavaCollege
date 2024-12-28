package menumneunomic;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;
import java.awt.Event;
import java.awt.event.KeyAdapter;

public class MenuMneunomic extends JFrame {

    public MenuMneunomic() {

        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("File");
        menu.setMnemonic(KeyEvent.VK_F);
        
        JMenuItem copy = new JMenuItem("Copy");
        copy.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, Event.CTRL_MASK));
          copy.addActionListener((ActionEvent e)->{
            System.out.println("copy is selected");
        });
        
        JMenuItem paste=new JMenuItem("Paste");
        paste.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V,Event.CTRL_MASK));
          paste.addActionListener((ActionEvent e)->{
            System.out.println("paste is selected");
        });
        
        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                // Check if the F key is pressed
                if (e.getKeyCode() == KeyEvent.VK_F) {
                    System.out.println("F key pressed, opening menu...");
                    // Open the menu programmatically (this is a workaround)
                    menu.doClick();  // This simulates clicking the menu
                }
            }
        });
        
        menu.add(copy);
        menu.add(paste);
        
        menuBar.add(menu);
        
        setJMenuBar(menuBar);
        pack();
        setSize(400, 400);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
      new MenuMneunomic();
    }

}
