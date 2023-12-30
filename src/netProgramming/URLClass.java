package netProgramming;

import java.net.MalformedURLException;
import java.net.URL;

public class URLClass {

    public static void main(String[] args) {
        
        try {
            URL obj = new URL("https://www.unacademy.com:60/index.html");

            System.out.println("Host : " + obj.getHost());
            System.out.println("Protocol : " + obj.getProtocol());
            System.out.println("Port : "+ obj.getPort());
            System.out.println("File : "+ obj.getFile());
            System.out.println("Path : " + obj.getPath());

        } 
        catch (MalformedURLException e) {
            e.printStackTrace();
        }

    }
}
