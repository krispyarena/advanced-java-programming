package netProgramming;

import java.io.DataInputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
    
    public static void main(String[] args) throws Exception{
        
        ServerSocket serverSocket = new ServerSocket(8080);
        System.out.println("Waiting for the Client");

        Socket clientSocket = serverSocket.accept();
        System.out.println("Server is Connected Successfully");

        Scanner scanner = new Scanner(System.in);

        PrintWriter pw = new PrintWriter(clientSocket.getOutputStream());
        System.out.print("Enter message to send to client: ");
        String data = scanner.nextLine();
        pw.println(data);
        pw.flush();

        DataInputStream data1 = new DataInputStream(clientSocket.getInputStream());

        String msg = (String) data1.readUTF();
        System.out.println("Client : " + msg);
        

        scanner.close();

        serverSocket.close();
    }
}
