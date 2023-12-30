package netProgramming;

import java.net.InetAddress;

public class InetClass {
    
    public static void main(String[] args) throws Exception {
        
        InetAddress ip = InetAddress.getByName("www.fcbayern.com");


        InetAddress i = InetAddress.getLocalHost();


        System.out.println(ip.getHostName());
        System.out.println(ip.getHostAddress());
        System.out.println(i);
    
    
    }
}
