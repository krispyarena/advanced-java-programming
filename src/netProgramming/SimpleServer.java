package netProgramming;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class SimpleServer {
    
    public static void main(String[] args) throws IOException {
        
        int port = 8080;

        // Create a server socket
        ServerSocket serverSocket = new ServerSocket(port);

        System.out.println("Server started on port : "+ port);

        // Wait for client connection
        Socket clientSocket = serverSocket.accept();

        // Create Input and Output Stream for the socket

        DataInputStream inputStream = new DataInputStream(clientSocket.getInputStream());
        DataOutputStream outputStream = new DataOutputStream(clientSocket.getOutputStream());

        String message = inputStream.readUTF();

        while (message != null){
            System.out.println("Client : " + message);

            outputStream.writeUTF("Server Received : " + message);
        }

        clientSocket.close();
        serverSocket.close();

        System.out.println("Server Closed");
    }
}
