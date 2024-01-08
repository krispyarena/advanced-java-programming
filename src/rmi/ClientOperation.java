package rmi;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;

public class ClientOperation {
    public static void main(String[] args) throws Exception{

        Registry registry = LocateRegistry.getRegistry("localhost", 8080);
        Operation op = (Operation) registry.lookup("Operation");
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter two numbers: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println("Sum : " + op.add(a, b));
        System.out.println("Product : " + op.product(a, b));


        scanner.close();
    }
}
