/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mnemonicsacceleratorsexample;

import java.awt.event.*;
import javax.swing.*;

public class MnemonicsAcceleratorsExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame frame = new JFrame("Mnemonics and Accelerators Example");
        JMenuBar menuBar = new JMenuBar();

        JMenu fileMenu = new JMenu("File");
        fileMenu.setMnemonic(KeyEvent.VK_F); // Alt + F to open File menu
//        fileMenu.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Y, ActionEvent.CTRL_MASK));

        JMenuItem openItem = new JMenuItem("Open");
        openItem.setMnemonic(KeyEvent.VK_O); // Alt + O to activate Open
        openItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, ActionEvent.CTRL_MASK)); // Ctrl + O

        JMenuItem saveItem = new JMenuItem("Save");
        saveItem.setMnemonic(KeyEvent.VK_S); // Alt + S to activate Save
        saveItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.CTRL_MASK)); // Ctrl + S
        saveItem.addActionListener((ActionEvent e) -> {
            System.out.println("Open menu item clicked!");
            });
        
        fileMenu.add (openItem);

            fileMenu.add (saveItem);

            menuBar.add (fileMenu);

            frame.setJMenuBar (menuBar);

            frame.setSize (400, 300);
            frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);

            frame.setVisible (true);
    }

}

/*You're correct that the setAccelerator method cannot be 
used directly with a JMenu; it is specifically designed for JMenuItem. 
However, if you want to add a keyboard shortcut to open a JMenu directly,
you would use a mnemonic instead. */
