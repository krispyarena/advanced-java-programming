package rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class OperationImpl extends UnicastRemoteObject implements Operation{

    public OperationImpl() throws RemoteException{

        super();

        /*
         * Default constructor cannot handle RemoteException thrown by the 
         * implicit super constructor.
         * 
         * Thus, an explicit constructor is defined.
         */
    }


    @Override
    public int add(int a, int b) {
        return a+b ;
    }

    @Override
    public int product(int a, int b){
        return a*b ;
    }    
    
}
