package rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class OperationImpl extends UnicastRemoteObject implements Operation{


    @Override
    public int add(int a, int b) {
        return a+b ;
    }

    @Override
    public int product(int a, int b){
        return a*b ;
    }

    public OperationImpl() throws RemoteException{

        super();

        /*
         * Default constructor cannot handle exception of type RemoteException
         * thrown by implicit super constructor.
         * 
         * Thus, an explicit constructor is defined.
         */
    }

    
    
}
