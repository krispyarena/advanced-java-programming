package filehandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOStream {



    /*
     * Simple Program to copy a file from input.txt to output.txt using these two classes
     * 
     * FileInputStream and FileOutputStream classes - related to ByteStream class
     */
    public static void main(String[] args) throws IOException{
        
        FileInputStream in = null;
        FileOutputStream out = null;

        try{
        
        in = new FileInputStream("input.txt");
        out = new FileOutputStream("output.txt");

        int c;

        while((c=in.read())!=-1){
            out.write(c);
        }

        }

        finally{
            in.close();
            out.close();
        }
    }
}
