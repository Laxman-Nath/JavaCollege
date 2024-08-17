import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PopupMenuExample {
    public static void main(String[] args) {
        // Create the frame
        JFrame frame = new JFrame("Popup Menu Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        // Create a text area (or any other component where you want the popup menu)
        JTextArea textArea = new JTextArea();
        frame.add(textArea);

        // Create a popup menu
        JPopupMenu popupMenu = new JPopupMenu();

        // Create menu items
        JMenuItem copyItem = new JMenuItem("Copy");
        JMenuItem pasteItem = new JMenuItem("Paste");
        JMenuItem cutItem = new JMenuItem("Cut");

        // Add menu items to the popup menu
        popupMenu.add(copyItem);
        popupMenu.add(pasteItem);
        popupMenu.add(cutItem);

        // Add action listeners to menu items
        copyItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textArea.copy(); // Perform copy action
            }
        });

        pasteItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textArea.paste(); // Perform paste action
            }
        });

        cutItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textArea.cut(); // Perform cut action
            }
        });

        // Add a mouse listener to the text area to show the popup menu
        textArea.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                showPopup(e);
            }

            public void mouseReleased(MouseEvent e) {
                showPopup(e);
            }

            private void showPopup(MouseEvent e) {
                if (e.isPopupTrigger()) {
                    popupMenu.show(e.getComponent(), e.getX(), e.getY());
                }
            }
        });

        // Make the frame visible
        frame.setVisible(true);
    }
}