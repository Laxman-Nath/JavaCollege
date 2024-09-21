/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package first;

import java.io.FileOutputStream;
import java.util.Scanner;
import java.io.FileInputStream;
// StringBuilder,String,StringBuffer
/**
 *
 * @author Saitech
 */
public class First {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws  Exception{
        // TODO code application logic here
           System.out.println("Inside main");
        Scanner sc=new Scanner(System.in);
//        FileOutputStream fos1=new FileOutputStream("D://JavaCollege/vowels.txt");
//        FileOutputStream fos2=new FileOutputStream("D://JavaCollege/constants.txt");
         FileInputStream fis1=new FileInputStream("D://JavaCollege/vowels.txt");
//       System.out.println("Enter a string!");
//       String str=sc.nextLine();
      
//        for(int i=0;i<str.length();i++){
//            if(str.charAt(i)=='a' || str.charAt(i)=='e'|| str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u')
//            {                 fos1.write(i);
//         }
//            else{
//                fos2.write(i);
//            }
//        }
     int x;
      while((x=fis1.read())!=-1){
          System.out.println((char) x);
      }
//         fos1.close();
//         fos2.close();
         fis1.close();
    }
    
}
