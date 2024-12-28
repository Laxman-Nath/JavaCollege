// write a java program that send messages with each other using tcp socket.(2079)
package messaging2079;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Messaging2079 {

    public static void main(String[] args) throws Exception {
        ServerSocket ss = new ServerSocket(2000);
        Socket sc = ss.accept();
        BufferedReader bfr = new BufferedReader(new InputStreamReader(sc.getInputStream()));
        PrintStream ps = new PrintStream(sc.getOutputStream());
        String clientMessage;
        do {
            clientMessage = bfr.readLine();
             System.out.println(clientMessage);
            if (clientMessage.contains("hello")) {
//                System.out.println(clientMessage);
                ps.println("From Server:" + "hi");
                System.out.println("Inside hello");
            } else if (clientMessage.contains("how are you")) {
                ps.println("From Server:" + "I m fine and you");
                System.out.println("Inside how are you");
            }
          else{
                System.out.println("Inside bye");
                 ps.println("From Server:" + "bye");
            }
            System.out.println(!clientMessage.contains("bye"));
        } while (!clientMessage.contains("bye"));
        System.out.println("Message ended from server side..............");
        ss.close();
      sc.close();
      bfr.close();
      ps.close();
    }

}

class Client {

    public static void main(String[] args) throws Exception {
        Socket sc = new Socket("localhost", 2000);
        BufferedReader bf1 = new BufferedReader(new InputStreamReader(sc.getInputStream()));
        BufferedReader bf2 = new BufferedReader(new InputStreamReader(System.in));
        PrintStream ps = new PrintStream(sc.getOutputStream());
        String serverMessage;
        String messageForClient;

        do {
            System.out.println("Input message for server:");
            messageForClient = bf2.readLine();
             
            ps.println("From client:" + messageForClient);
            serverMessage = bf1.readLine();
            System.out.println(serverMessage);
            
          

        } while ( !serverMessage.contains("bye"));
        System.out.println("Message ended from client side..............");
      sc.close();
      bf1.close();
      bf2.close();
      ps.close();
    }
}
