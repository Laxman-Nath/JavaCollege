//. Write a program to read an input string from the user and 
//write the vowels of that string in VOWEL.TXT and consonants
//in CONSOLNANT.TXT
package pkg2077fileio;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        /*       FileOutputStream vowels = new FileOutputStream("vowels.txt");
        FileOutputStream constants = new FileOutputStream("constants.txt");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string:");
        String str = sc.nextLine();

        for (int i = 0; i < str.length(); i++) {
             if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='o' || str.charAt(i)=='u'){
                 vowels.write(str.charAt(i));
             }
             else{
                 constants.write(str.charAt(i));
             }
        }
        vowels.close();
        constants.close(); */

//        FileInputStream fis=new FileInputStream("constants.txt");
//         int ch;
//        while((ch=fis.read())!=-1){
//            System.out.println((char) ch);
//        }
//  fis.close();
//Scanner sc=new Scanner(new FileInputStream("constants.txt"));
//
//        while(sc.hasNext()){
//            System.out.println(sc.next());
//        }
//     sc.close();
        FileReader fileReader = new FileReader("vowels.txt");
         int ch;
        while((ch=fileReader.read())!=-1){
            System.out.println((char) ch);
        }
//        FileWriter filewriter1 = new FileWriter("constants.txt");
//        FileWriter filewriter2 = new FileWriter("vowels.txt");
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter string:");
//        String str=sc.nextLine();
//        
//        for(int i=0;i<str.length();i++){
//            char ch=str.charAt(i);
//            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
//                filewriter2.write(ch);
//            }
//            else{
//                filewriter1.write(ch);
//            }
//        }
//
//       filewriter1.close();
//       filewriter2.close();
fileReader.close();
    }

}
