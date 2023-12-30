package netProgramming;

import java.io.*;
import java.net.*;

public class SimpleClient {

    public static void main(String[] args) throws IOException {
        String host = "localhost"; // Server's host name or IP address
        int port = 8080; // Server's port

        // Create a client socket
        Socket clientSocket = new Socket(host, port);

        // Create input and output streams for the socket
        DataInputStream inputStream = new DataInputStream(clientSocket.getInputStream());
        DataOutputStream outputStream = new DataOutputStream(clientSocket.getOutputStream());

        String message;

        // Send message to server
        message = "Hello from the client!";
        outputStream.writeUTF(message);

        // Receive response from server
        message = inputStream.readUTF();
        System.out.println("Server says: " + message);

        // Close the socket connection
        clientSocket.close();

        System.out.println("Client closed");
    }
}

