package filehandling;

import java.io.FileOutputStream;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args) throws IOException{
        
        FileOutputStream file = new FileOutputStream("d://abc.java");
        file.write("Hello World".getBytes());
        file.close();
    }
}
