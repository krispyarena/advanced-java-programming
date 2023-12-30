package filehandling;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFileTest {
    public static void main(String[] args) throws IOException{
        FileWriter file = new FileWriter("d://hello.java", true);

        file.write("\nName : Ashish Khatri\n");
        file.write("College : ASCOL\n");

        file.close();
    }
}
