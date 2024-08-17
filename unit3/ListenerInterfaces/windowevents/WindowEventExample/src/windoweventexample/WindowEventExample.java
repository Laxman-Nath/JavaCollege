package windoweventexample;
import javax.swing.*;
import java.awt.event.*;

public class WindowEventExample extends JFrame {

    public WindowEventExample() {
        // Set the title of the window
        setTitle("Window Event Example");

        // Set the size of the window
        setSize(400, 300);

        // Center the window on the screen
        setLocationRelativeTo(null);

        // Add a window listener using WindowAdapter
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowOpened(WindowEvent e) {
                System.out.println("Window opened");
            }

            @Override
            public void windowClosing(WindowEvent e) {
                System.out.println("Window closing");
                // Close the window and exit the application
                System.exit(0);
            }

            @Override
            public void windowClosed(WindowEvent e) {
                System.out.println("Window closed");
            }

            @Override
            public void windowIconified(WindowEvent e) {
                System.out.println("Window minimized");
            }

            @Override
            public void windowDeiconified(WindowEvent e) {
                System.out.println("Window restored");
            }

            @Override
            public void windowActivated(WindowEvent e) {
                System.out.println("Window activated");
            }

            @Override
            public void windowDeactivated(WindowEvent e) {
                System.out.println("Window deactivated");
            }
        });

        // Set default close operation (DO_NOTHING_ON_CLOSE)
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
    }

    public static void main(String[] args) {
        // Create and show the window
        SwingUtilities.invokeLater(() -> {
            WindowEventExample window = new WindowEventExample();
            window.setVisible(true);
        });
    }
}