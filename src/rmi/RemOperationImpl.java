package rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class RemOperationImpl extends UnicastRemoteObject implements RemOperation{

    public RemOperationImpl() throws RemoteException{

        /*
         * Default constructor cannot handle exception of type RemoteException
         * thrown by implicit super constructor.
         * 
         * Thus, an explicit constructor is defined.
         */
    }

    @Override
    public int add(int a, int b) {
        return (a+b);
    }

    @Override
    public int product(int a, int b){
        return (a*b);
    }

    
    
}
