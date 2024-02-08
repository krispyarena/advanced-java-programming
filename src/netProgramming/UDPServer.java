package netProgramming;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPServer {
    public static void main(String[] args) throws IOException{
        
        byte[] buf = new byte[256];

        DatagramSocket socket = new DatagramSocket(8080);

        DatagramPacket packet = new DatagramPacket(buf, buf.length);

        socket.receive(packet);

        InetAddress address = packet.getAddress();
        int port = packet.getPort();
        
        String s = "Hello";
        buf = s.getBytes();

        packet = new DatagramPacket(buf, buf.length, address, port);
        socket.send(packet);

        socket.close();
    }
}
