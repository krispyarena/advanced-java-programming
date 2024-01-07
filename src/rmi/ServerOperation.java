package rmi;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;

public class ServerOperation {
    public static void main(String[] args) {
        
        try{
            RemOperationImpl ri = new RemOperationImpl();
            Naming.rebind("rmi:///RemOperation", ri);
        }
        catch(RemoteException r){
            r.printStackTrace();
        }

        catch(MalformedURLException m){
            m.printStackTrace();
        }
    }
}
