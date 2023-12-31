package netProgramming;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {
    
    public static void main(String[] args) {
        
        try{
            
            ServerSocket sSocket = new ServerSocket(2020);
            Socket cSocket = sSocket.accept();

            DataInputStream dis = new DataInputStream(cSocket.getInputStream());
            DataOutputStream dos = new DataOutputStream(cSocket.getOutputStream());

            float radius = Float.parseFloat(dis.readUTF());

            System.out.println("Radius received: " + radius);

            float area = 22*radius*radius/7 ;

            String result = Float.toString(area);
            dos.writeUTF(result);

            sSocket.close();

        } 
        
        catch (Exception e){
            System.out.println(e);
        }

    }
}
