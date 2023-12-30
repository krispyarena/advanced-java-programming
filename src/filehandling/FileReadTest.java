package filehandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReadTest {
    public static void main(String[] args) throws IOException {
        FileReader file = new FileReader("d://abc.java");

        BufferedReader br = new BufferedReader(file);

        String line;
        //br.readLine();

        while((line = br.readLine()) != null){
            System.out.println(line);
        }

        file.close();
    }
}
