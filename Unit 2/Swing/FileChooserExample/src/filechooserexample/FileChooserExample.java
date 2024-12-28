/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package filechooserexample;
import javax.swing.JFileChooser;

import java.io.File;
import javax.swing.JOptionPane;
public class FileChooserExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFileChooser fileChooser=new JFileChooser();
        fileChooser.showOpenDialog(null);
        
        JOptionPane.showMessageDialog(null,"Selected file:"+fileChooser.getSelectedFile(),"File Selection",JOptionPane.INFORMATION_MESSAGE);
    }
    
}
