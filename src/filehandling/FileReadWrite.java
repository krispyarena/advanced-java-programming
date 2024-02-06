package filehandling;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReadWrite {

    /*
     * Java FileReader and FileWriter classes are used to read and write data in text files.
     * These are character oriented classes used for file handling in java.
     */
    public static void main(String[] args) throws IOException{
        
        FileWriter writer = new FileWriter("g:/hello.text");
        writer.write("This is an example");
        writer.close();

        FileReader reader = new FileReader("g:/hello.text");
        
        char [] a = new char[50];
        
        reader.read(a);

        for(char c : a){
            System.out.println(c);
        }

        reader.close();
    }
}
