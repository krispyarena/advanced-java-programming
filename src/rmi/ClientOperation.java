package rmi;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.Scanner;

public class ClientOperation {
    public static void main(String[] args) {

        String host = "localhost";
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter two numbers: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        try{
            RemOperation r = (RemOperation) Naming.lookup("rmi://" + host + "/RemOperation");
            System.out.println("Sum : " + r.add(a, b));
            System.out.println("Product : " + r.product(a, b));
        }

        catch(RemoteException re){
            re.printStackTrace();
        }

        catch(NotBoundException nbe){
            nbe.printStackTrace();
        }

        catch(MalformedURLException m){
            m.printStackTrace();
        }


        scanner.close();
    }
}
