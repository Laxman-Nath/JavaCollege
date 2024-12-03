package swingwithjdbc;

import javax.swing.*;
import java.awt.*;
import java.sql.*;

public class SwingWithJDBC extends JFrame {

    Connection connection;
    Statement statement;

    public SwingWithJDBC() {
        // Set the layout manager to FlowLayout
        setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10)); // Center alignment, 10px horizontal and vertical gaps

        // Create components
        JLabel nameLabel = new JLabel("Name");
        JTextField nameField = new JTextField(20); // 20 columns wide
        JLabel passwordLabel = new JLabel("Password");
        JPasswordField passwordField = new JPasswordField(20); // 20 columns wide
        JButton submitButton = new JButton("SUBMIT");

        // Add components to the frame
        add(nameLabel);
        add(nameField);
        add(passwordLabel);
        add(passwordField);
        add(submitButton);

        // Using a lambda expression for the action listener
        submitButton.addActionListener(e -> {
            String name = nameField.getText();
            String password = passwordField.getText();
            if (insertData(name, password)) {
                System.out.println("data is inserted successfully");
            } else {
                System.out.println("error inserting");
            }

        });

        // Frame settings
        setTitle("Swing with JDBC");
        setSize(400, 300);  // Set a reasonable window size (adjust as needed)
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);  // Center window on the screen
        setVisible(true);  // Make frame visible
    }

    public boolean insertData(String username, String userpassword) {
        try {
            connection = getConnection();
            statement = connection.createStatement();
            if (statement.executeUpdate("INSERT INTO swing (name,password) VALUES ('" + username + "','" + userpassword + "')")>0) {
                return true;
            }
            return false;

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return false;
    }

    public Connection getConnection() {
        // Handle the form submission (e.g., print input)
        Connection conn = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/exam_db", "root", "siddha@123");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }

    public static void main(String[] args) {
        new SwingWithJDBC();
    }
}
