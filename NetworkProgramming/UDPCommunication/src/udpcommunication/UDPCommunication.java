package udpcommunication;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class UDPCommunication {

    public static void main(String[] args) {

    }

}

class Server {

    public static void main(String[] args) {
        try {
            DatagramSocket serverSocket = new DatagramSocket(8080);
            byte dataToSend[];
            byte dataToReceive[] = new byte[1024];
            Scanner sc = new Scanner(System.in);

            while (true) {
                DatagramPacket receivedPacket = new DatagramPacket(dataToReceive, dataToReceive.length);
                serverSocket.receive(receivedPacket);
                System.out.println("Message from client:"+ new String(receivedPacket.getData(), 0, receivedPacket.getLength()));

                System.out.println("Enter message for client");
                String response = sc.nextLine();
                dataToSend = response.getBytes();
                DatagramPacket sendPacket = new DatagramPacket(dataToSend, dataToSend.length, receivedPacket.getAddress(), receivedPacket.getPort());
                serverSocket.send(sendPacket);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

class Client {

    public static void main(String[] args) {
        try {
            DatagramSocket clientSocket = new DatagramSocket();
            InetAddress serverAddress = InetAddress.getByName("localhost");
            byte dataToSend[];
            byte dataToReceive[] = new byte[1024];
            Scanner sc = new Scanner(System.in);

            while (true) {
                System.out.println("Enter message for server");
                String response = sc.nextLine();
                dataToSend = response.getBytes();

                DatagramPacket sendPacket = new DatagramPacket(dataToSend, dataToSend.length, serverAddress, 8080);
                clientSocket.send(sendPacket);

                DatagramPacket receivedPacket = new DatagramPacket(dataToReceive, dataToReceive.length);
                clientSocket.receive(receivedPacket);
                System.out.println("Message from server:"+ new String(receivedPacket.getData(), 0, receivedPacket.getLength()));

            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
