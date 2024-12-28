import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PopupMenuExample extends JFrame {
    public PopupMenuExample() {
        // Create a JTextArea
        JTextArea textArea = new JTextArea();
        add(new JScrollPane(textArea));

        // Create a JPopupMenu
        JPopupMenu popupMenu = new JPopupMenu();

        // Create and add menu items to the popup menu
        JMenuItem cutItem = new JMenuItem("Cut");
        JMenuItem copyItem = new JMenuItem("Copy");
        JMenuItem pasteItem = new JMenuItem("Paste");

        // Add action listeners to the menu items
        cutItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.cut();
            }
        });
        copyItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.copy();
            }
        });
        pasteItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.paste();
            }
        });

        // Add items to the popup menu
        popupMenu.add(cutItem);
        popupMenu.add(copyItem);
        popupMenu.add(pasteItem);

        // Add a mouse listener to show the popup menu on right-click
        textArea.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
               
                    popupMenu.show(textArea, e.getX(), e.getY());
               
            }
            @Override
            public void mouseReleased(MouseEvent e) {
               
                    popupMenu.show(textArea, e.getX(), e.getY());
               
            }
        });

        // Frame setup
        setTitle("Popup Menu Example");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new PopupMenuExample();
    }
}
