/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package filechooserexample;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.io.File;
public class FileChooserExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFileChooser fileChooser = new JFileChooser();
        
        // Optionally set a filter to only show certain file types
//        FileNameExtensionFilter filter = new FileNameExtensionFilter("Text Files", "txt");
//        fileChooser.setFileFilter(filter);
        
        // Show the open dialog
        int returnValue = fileChooser.showOpenDialog(null);
        
        // Check if the user selected a file
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            System.out.println("Selected file: " + selectedFile.getAbsolutePath());
        } else {
            System.out.println("File selection canceled.");
        }
    }
    
}
