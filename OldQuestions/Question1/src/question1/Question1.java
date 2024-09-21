//. Describe the responsibility of Serializable interface  
//
//
//. Write a program to read an input string from the user and
//write the vowels of that string in VOWEL.TXT and consonants in CONSOLNANT.TXT (2+8)
package question1;

import java.util.Scanner;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class Question1 {

    public static void main(String[] args) throws FileNotFoundException, IOException {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a string");
//        String str = sc.nextLine();
//        FileOutputStream vowels = new FileOutputStream("D://JavaCollege/vowels.txt");
//           FileOutputStream constants = new FileOutputStream("D://JavaCollege/constants.txt");
//
//        for (int i = 0; i < str.length(); i++) {
//            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
//               vowels.write(str.charAt(i));
//            }
//            else{
//                constants.write(str.charAt(i));
//            }
//        }
//        System.out.println("Successfully written to the file!");
//        vowels.close();
//        constants.close();



  FileInputStream fis=new FileInputStream("D://JavaCollege/constants.txt");
  int x;
  
  while((x=fis.read())!=-1){
      System.out.println((char)x);
  }

    }

}
