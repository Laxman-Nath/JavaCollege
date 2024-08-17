/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tableexample;


 import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class TableExample {
    public static void main(String[] args) {
        // Column names
        String[] columnNames = {"ID", "Name", "Age"};

        // Data for the table
        Object[][] data = {
            {1, "Alice", 30},
            {2, "Bob", 25},
            {3, "Charlie", 35}
        };

        // Create the table model and table
        DefaultTableModel tableModel = new DefaultTableModel(data, columnNames);
        JTable table = new JTable(tableModel);

        // Create a frame to hold the table
        JFrame frame = new JFrame("JTable Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.add(new JScrollPane(table)); // Add the table to a scroll pane
        frame.setVisible(true);
    }
}
