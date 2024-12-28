// write a tcp java program in which client send two numbers to a server 
// and server returns sum of them.(2080)
package sumclientserver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class SumClientServer {

    
    public static void main(String[] args) throws Exception {
        ServerSocket ss=new ServerSocket(2000);
        Socket sc=ss.accept();
        BufferedReader bfr=new BufferedReader(new InputStreamReader(sc.getInputStream()));
        PrintStream ps=new PrintStream(sc.getOutputStream());
        
        int a=Integer.parseInt(bfr.readLine());
        System.out.println("From client a="+a);
        int b=Integer.parseInt(bfr.readLine());
        System.out.println("From client b="+b);
        ps.println("Sum of "+a +" and "+b +" is :"+(a+b));
        sc.close();
        ss.close();
        ps.close();
        ps.close();
        
    }
    
}

class Client{
    public static void main(String[] args) throws  Exception{
        Socket sc=new Socket("localhost",2000);
        BufferedReader bfr1=new BufferedReader(new InputStreamReader(System.in));
         BufferedReader bfr2=new BufferedReader(new InputStreamReader(sc.getInputStream()));
         PrintStream ps=new PrintStream(sc.getOutputStream());
         System.out.println("Enter first number:");
         ps.println(bfr1.readLine());
         System.out.println("Enter second number:");
         ps.println(bfr1.readLine());
         System.out.println(bfr2.readLine());
         sc.close();
         bfr1.close();
         bfr2.close();
         ps.close();
    }
    
    
}
