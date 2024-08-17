package menudemo;

import java.awt.FlowLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.Image;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.ButtonGroup;

public class MenuDemo extends JFrame {

    JMenuBar menuBar;
    JMenu menu1;
    JMenu menu2;
    JMenu optionsMenu;
    JMenuItem i1;
    JMenuItem i2;
    JMenuItem i3;
    JMenuItem i4;
    JMenuItem i5;
    JMenuItem i6;
    JMenuItem i8;
    JMenuItem i9;
    ImageIcon img1;
    ImageIcon img2;

    public MenuDemo() {
//      img1=new ImageIcon("icons/new.png");
//      img2=new ImageIcon("icons/save.png");

        img1 = resizeIcon("icons/new.png", 16, 16);
        img2 = resizeIcon("icons/save.png", 16, 16);
        i1 = new JMenuItem("New", img1);
        i2 = new JMenuItem("Save", img2);
        i3 = new JMenuItem("Close");
        menu1 = new JMenu("File");
        menu1.add(i1);
        menu1.add(i2);
        menu1.add(i3);

        i4 = new JMenuItem("Cut");
        i5 = new JMenuItem("Copy");
        i6 = new JMenuItem("Paste");
        i4.setEnabled(false);
        menu2 = new JMenu("Edit");
        menu2.add(i4);
        menu2.add(i5);
        menu2.add(i6);
        
        JCheckBoxMenuItem checkBox1 = new JCheckBoxMenuItem("Option 1");
        JCheckBoxMenuItem checkBox2 = new JCheckBoxMenuItem("Option 2");
         optionsMenu=new JMenu("options");
         optionsMenu.add(checkBox1);
         optionsMenu.add(checkBox2);
         
        JMenu radioSubMenu = new JMenu("Choose One");
        optionsMenu.add(radioSubMenu);

        // Create radio button menu items
        JRadioButtonMenuItem radioButton1 = new JRadioButtonMenuItem("Choice 1");
        JRadioButtonMenuItem radioButton2 = new JRadioButtonMenuItem("Choice 2");
        JRadioButtonMenuItem radioButton3 = new JRadioButtonMenuItem("Choice 3");

        // Add radio button items to a ButtonGroup to ensure only one can be selected at a time
        ButtonGroup radioGroup = new ButtonGroup();
        radioGroup.add(radioButton1);
        radioGroup.add(radioButton2);
        radioGroup.add(radioButton3);

        // Add radio button items to the submenu
        radioSubMenu.add(radioButton1);
        radioSubMenu.add(radioButton2);
        radioSubMenu.add(radioButton3);



        menuBar = new JMenuBar();
        menuBar.add(menu1);
        menuBar.add(menu2);
        menuBar.add(optionsMenu);

        setLayout(new FlowLayout());
        setJMenuBar(menuBar);

        setSize(400, 400);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private static ImageIcon resizeIcon(String path, int width, int height) {
        ImageIcon icon = new ImageIcon(path);
        Image img = icon.getImage();
        Image resizedImage = img.getScaledInstance(width, height, Image.SCALE_SMOOTH);
        return new ImageIcon(resizedImage);
    }

    public static void main(String[] args) {
        new MenuDemo();
    }

}
