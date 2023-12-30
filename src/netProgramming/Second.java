package netProgramming;

import java.net.InetAddress;

public class Second {
    
    public static void main(String[] args) throws Exception {
        
        InetAddress ip = InetAddress.getByName("www.unacademy.com");

        System.out.println(ip.getHostName());
        System.out.println(ip.getHostAddress());
    }
}
