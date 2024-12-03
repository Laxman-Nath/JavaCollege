
package reverseechoserver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;


public class ReverseEchoServer {

    public static void main(String[] args) throws IOException {
        ServerSocket ss=new ServerSocket(2000);
        Socket cs=ss.accept();
        BufferedReader bfr=new BufferedReader(new InputStreamReader(cs.getInputStream()));
        PrintStream ps=new PrintStream(cs.getOutputStream());
//        StringBuilder response;
//        String msg;
        int a;
        int b;
         a=Integer.parseInt(bfr.readLine());
         b=Integer.parseInt(bfr.readLine());
//         ps.println(a+b);
int largest=a>b?a:b;
ps.println(largest);
//        do{
//          
//           response=new StringBuilder(msg);
//           response=response.reverse();
//           ps.println(response);
//           
//    }while(!msg.equalsIgnoreCase("end"));
         System.out.println("Program exited..........");
    }
   
}

class Client{
    public static void main(String [] args) throws IOException{
        Socket cs=new Socket("localhost",2000);
        BufferedReader bfrkey=new BufferedReader(new InputStreamReader(System.in));
        BufferedReader bfrserver=new BufferedReader(new InputStreamReader(cs.getInputStream()));
        PrintStream ps=new PrintStream(cs.getOutputStream());
//        String msg;
String a;
String  b;
//         do{
            a=bfrkey.readLine();
             ps.println(a);
             b=bfrkey.readLine();
             ps.println(b);

           System.out.println("From server :"+bfrserver.readLine());
           
//    }while(!msg.equalsIgnoreCase("dne"));
    }
}
