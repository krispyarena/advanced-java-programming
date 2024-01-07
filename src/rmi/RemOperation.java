package rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface RemOperation extends Remote{
    
    public int add (int a, int b) throws RemoteException;

    public int product(int a, int b) throws RemoteException;

}