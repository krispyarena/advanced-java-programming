package filehandling;

import java.io.File;

public class FileTest {
    public static void main(String[] args) {
        File file = new File("d://hello.java");

        System.out.println(file.isFile());

        // create a directory

        File folder = new File("g://Krispy");
        folder.mkdir();

        // get all filenames from folder

        folder.list();

    }
}
