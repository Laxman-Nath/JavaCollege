package toolbarexample;
import javax.swing.*;
import java.awt.event.*;

public class ToolbarExample {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                JFrame frame = new JFrame("Toolbar Example");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setSize(400, 300);
                
                // Creating the toolbar
                JToolBar toolbar = new JToolBar();
                
                // Adding buttons to the toolbar
                JButton openButton = new JButton("Open");
                openButton.setToolTipText("Open a file (Ctrl+O)"); // Tooltip for the button
                openButton.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        System.out.println("Open button clicked");
                    }
                });
                
                JButton saveButton = new JButton("Save");
                saveButton.setToolTipText("Save the file (Ctrl+S)");
                saveButton.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        System.out.println("Save button clicked");
                    }
                });
                
                toolbar.add(openButton);
                toolbar.add(saveButton);
                
                // Adding the toolbar to the frame
                frame.add(toolbar, java.awt.BorderLayout.NORTH);
                
                frame.setVisible(true);
            }
        });
    }
}


Toolbars and Tooltips in Java Swing
In Java Swing, toolbars provide a set of commonly used actions that are presented as buttons or other components, typically aligned horizontally or vertically. Tooltips are small pop-up text messages that appear when a user hovers over a component, providing additional information about that component.

Creating a Toolbar
A toolbar in Swing is created using the JToolBar class. You can add various components like buttons, separators, and other controls to the toolbar.

Example of Creating a Toolbar:
java
Copy code
import javax.swing.*;
import java.awt.event.*;

public class ToolbarExample {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                JFrame frame = new JFrame("Toolbar Example");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setSize(400, 300);
                
                // Creating the toolbar
                JToolBar toolbar = new JToolBar();
                
                // Adding buttons to the toolbar
                JButton openButton = new JButton("Open");
                openButton.setToolTipText("Open a file (Ctrl+O)"); // Tooltip for the button
                openButton.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        System.out.println("Open button clicked");
                    }
                });
                
                JButton saveButton = new JButton("Save");
                saveButton.setToolTipText("Save the file (Ctrl+S)");
                saveButton.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        System.out.println("Save button clicked");
                    }
                });
                
                toolbar.add(openButton);
                toolbar.add(saveButton);
                
                // Adding the toolbar to the frame
                frame.add(toolbar, java.awt.BorderLayout.NORTH);
                
                frame.setVisible(true);
            }
        });
    }
}
/*
Explanation:
JToolBar toolbar = new JToolBar();:

Creates a new JToolBar object.
Adding Buttons to the Toolbar:

JButton openButton = new JButton("Open");
toolbar.add(openButton);
Buttons are created and added to the toolbar.
Tooltips:

openButton.setToolTipText("Open a file (Ctrl+O)");
Sets a tooltip for the "Open" button, which will display when the user hovers over the button.
Positioning the Toolbar:

frame.add(toolbar, java.awt.BorderLayout.NORTH);
Adds the toolbar to the top (north) of the frame.
/*