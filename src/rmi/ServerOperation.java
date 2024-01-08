package rmi;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class ServerOperation {
    public static void main(String[] args) {
        
        try{
            Operation op = new OperationImpl();
            Registry registry = LocateRegistry.createRegistry(8080);
            registry.rebind("Operation", op);
            System.out.println("Server Operation Ready !");
        }
        catch(RemoteException r){
            r.printStackTrace();
        }

        catch(Exception e){
            e.printStackTrace();
        }
    }
}
