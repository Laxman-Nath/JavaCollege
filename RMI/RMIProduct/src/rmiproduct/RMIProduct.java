package rmiproduct;

import java.rmi.*;
import java.rmi.server.UnicastRemoteObject;
import java.rmi.registry.*;

public class RMIProduct {

    public static void main(String[] args) {
        // TODO code application logic here
    }

}

interface RemoteInterface extends Remote {

    int product(int x, int y) throws RemoteException;

}

class ServerImpl extends UnicastRemoteObject implements RemoteInterface {

    public ServerImpl() throws RemoteException {
    }

    public int product(int x, int y) throws RemoteException {
        return x * y;
    }
}

class Server {

    public static void main(String[] args) {
        try {
            ServerImpl s = new ServerImpl();
            LocateRegistry.createRegistry(1099);
            Naming.rebind("SERVICE", s);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

class Client{
    public static  void main(String [] args){
        try {
            RemoteInterface service=(RemoteInterface) Naming.lookup("rmi://localhost:1099/SERVICE");
            System.out.println("Product is:"+service.product(5, 4));
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
