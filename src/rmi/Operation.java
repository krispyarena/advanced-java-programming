package rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Operation extends Remote{
    
    public int add (int a, int b) throws RemoteException;

    public int product(int a, int b) throws RemoteException;

}