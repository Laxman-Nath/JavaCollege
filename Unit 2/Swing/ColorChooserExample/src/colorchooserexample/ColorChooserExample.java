import javax.swing.JOptionPane;
import java.awt.Color;
import javax.swing.JColorChooser;

public class ColorChooserExample {
    public static void main(String[] args) {
        // Open a color chooser dialog
        Color selectedColor = JColorChooser.showDialog(null, "Select a Color", Color.WHITE);
        
        // Check if a color was selected
        if (selectedColor != null) {
            // Display the selected color in a dialog
            JOptionPane.showMessageDialog(null, "Selected Color: " + selectedColor.toString(),
                                          "Color Selected", JOptionPane.INFORMATION_MESSAGE);
        } else {
            // If no color was selected, notify the user
            JOptionPane.showMessageDialog(null, "No color selected.",
                                          "No Color", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}