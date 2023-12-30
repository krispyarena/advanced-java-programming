package netProgramming;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    
    public static void main(String[] args) throws Exception{
    
        Socket clientSocket = new Socket("localhost", 8080);
        System.out.println("Client is connected successfully");

        BufferedReader br = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

        String data = br.readLine();
        System.out.println("Server : " + data);

        DataOutputStream data2 = new DataOutputStream(clientSocket.getOutputStream());

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter message to send to server: ");
        String msg = scanner.nextLine();
        data2.writeUTF(msg);
        scanner.close();


        data2.flush();
        data2.close();

        clientSocket.close();
    }
}
