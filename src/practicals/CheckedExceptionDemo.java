package practicals;

import java.io.FileWriter;
import java.io.IOException;

public class CheckedExceptionDemo {
 public static void main(String[] args) {
 try {

    FileWriter wr = new FileWriter("abc.txt");
    wr.write("hello World");
    wr.close();
 }
 catch (IOException ex) {
    System.out.println(ex);
 }
 }
}
