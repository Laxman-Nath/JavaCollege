/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dialogdemo;
import javax.swing.JOptionPane;
/**
 *
 * @author Saitech
 */
public class DialogDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        JOptionPane.showMessageDialog(null, "Hello, this is a message dialog!");

//       int response = JOptionPane.showConfirmDialog(null, "Do you want to continue?", "Confirmation", JOptionPane.YES_NO_OPTION);
//        if (response == JOptionPane.YES_OPTION) {
//            System.out.println("You selected Yes");
//        } else {
//            System.out.println("You selected No");
//        }


//        String name = JOptionPane.showInputDialog("Enter your name:");
//        System.out.println("Your name is: " + name);
             
            Object[] options = {"Option 1", "Option 2", "Option 3"};
        int selectedOption = JOptionPane.showOptionDialog(null, "Choose an option", "Option Dialog",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,
                null, options, options[0]);

        System.out.println("You selected: " + options[selectedOption]);
    }
    
}
/*
The JOptionPane.showMessageDialog(null, "Hello, this is a message dialog!"); line of code creates a simple message dialog in a Java Swing application. Here's a breakdown of what it does:

JOptionPane.showMessageDialog: This is a static method of the JOptionPane class that is used to display a message dialog.

null: The first parameter represents the parent component of the dialog. Passing null means that the dialog will be centered on the screen.

"Hello, this is a message dialog!": This is the message that will be displayed in the dialog box.

*/