package filehandling;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RAFDemo {

    /*
     * Random Access File in java.IO API allows us to move back and forth in the file and we can read or write content
     * in any required place/position of the file.
     * 
     * We can move to required position by calling seek() and find the vlue of current position by calling getPointer().
     */
    public static void main(String[] args) {
        try{

            RandomAccessFile raf = new RandomAccessFile("test.txt", "rw");

            raf.writeUTF("Hello World1");
            raf.writeUTF("Hi");

            raf.seek(0);
            System.out.println(raf.readUTF());

            long pos = raf.getFilePointer();
            System.out.println("Position : " + pos);

            System.out.println(raf.readUTF());

            raf.seek(0);
            System.out.println(raf.readUTF());

            raf.seek(14);
            System.out.println(raf.readUTF());

            System.out.println(raf.getFilePointer());

            raf.close();
        }

        catch (IOException e){
            e.printStackTrace();
        }

    }
}
