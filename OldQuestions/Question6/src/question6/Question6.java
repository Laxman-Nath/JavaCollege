//. Design a GUI form using swing with a text field, a text label for displaying 
//the input message “Input any String”, and three buttons with caption CheckPalindrome,
//Reverse, FindVowels. Write a complete program for above scenario and for 
//checking palindrome in first button, reverse it after clicking second button and
//extract the vowels from it after clicking third button. (10)
package question6;

import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Question6 extends JFrame {

    JTextField inputText = new JTextField(20);
    JTextField outputText = new JTextField(20);
    JLabel inputLabel = new JLabel("Input any string");
    JButton checkPalindrome = new JButton("checkPalindrome");
    JButton reverse = new JButton("reverse");
    JButton extractVowel = new JButton("extractVowel");

    public Question6() throws HeadlessException {
        inputLabel.setBounds(20, 30, 100, 50);
        inputText.setBounds(150, 30, 200, 50);
        checkPalindrome.setBounds(150, 100, 150, 50);
        reverse.setBounds(150, 160, 150, 50);
        extractVowel.setBounds(150, 220, 150, 50);
        outputText.setBounds(150, 280, 150, 50);
        add(inputLabel);
        add(inputText);
        add(checkPalindrome);
        add(reverse);
        add(extractVowel);
        add(outputText);

        checkPalindrome.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String data = inputText.getText();
             
                if (data.equals(reverseString(data))) {
                    outputText.setText("True");
                } else {
                    outputText.setText("False");
                }
                
                /*
                System.out.println(data);
                int mid = data.length() / 2;
                char[] reversedArray = new char[data.length()];
                boolean isPalindrome = true;
                int i = 0;
                int j = data.length() - 1;
                while (i <= mid && j >= mid) {
                    if (data.charAt(i) == data.charAt(j)) {
                        i++;
                        j--;
                    } else {
                        isPalindrome = false;
                        break;
                    }
                }
                if (isPalindrome) {
                    outputText.setText("True");
                } else {
                    outputText.setText("False");
                } */
            }
        });

        reverse.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String data = inputText.getText();
                 outputText.setText(reverseString(data));
                 
                 
     /*           char [] reversedArray=new char[data.length()];
                int i = 0;
                int j = data.length() - 1;
                while (i <=data.length()-1 && j>=0) {
                   reversedArray[i]=data.charAt(j);
                   i++;
                   j--;
                    
                }
                
                String reversedData=new String(reversedArray);
                 outputText.setText(reversedData);
                System.out.println(reversedArray); */
            }
        });

        extractVowel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String data = inputText.getText();
                char vowelData[] = new char[data.length()];
                for (int i = 0; i < data.length(); i++) {
                    if (data.charAt(i) == 'a' || data.charAt(i) == 'e' || data.charAt(i) == 'i' || data.charAt(i) == 'o' || data.charAt(i) == 'u') {
                        vowelData[i] = data.charAt(i);
                    }
                }
                outputText.setText(new String(vowelData));
            }

        });

        setSize(400, 400);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static String reverseString(String data) {
        StringBuilder str = new StringBuilder(data);
        String reversedData = str.reverse().toString();

        return reversedData;
    }

    public static void main(String[] args) {
        new Question6();
    }

}
