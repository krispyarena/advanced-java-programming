package netProgramming;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class TCPClient {
    
    
    public static void main(String[] args) {

        try {
            Socket cSocket = new Socket("localhost", 2020);

            DataInputStream dis = new DataInputStream(cSocket.getInputStream());
            DataOutputStream dos = new DataOutputStream(cSocket.getOutputStream());

            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter radius of a circle: ");
            float r = scanner.nextFloat();

            String radius = Float.toString(r);
            dos.writeUTF(radius);

            String result = (String) dis.readUTF();
            System.out.println("Area of Circle : " + result);

            dis.close();
            dos.close();
            scanner.close();
            cSocket.close();
        }
        
        catch (Exception e) {
            System.out.println(e);
        }
    }
}
