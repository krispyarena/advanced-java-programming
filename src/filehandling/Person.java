package filehandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Person implements Serializable{

    /*
     * Java Object Serialisation is an API that allows us to serialise Java Objects.
     * Serialisation is the process to convert objects into a variable byte stream.
     * Once converted into byte stream, these objects can be written to a file.
     * The reverse process is called de-serialisation.
     * 
     * ObjectInputStream & ObjectOutputStream classes are used to read/write java objects.
     */
    
    private String name;
    private int age;
    private String gender;

    Person(String name, int age, String gender){
        this.age = age;
        this.name = name;
        this.gender = gender;
    }

    @Override
    public String toString(){
        return "Name : "+ name + "\n Age = "+ age + "\nGender = "+gender;
    }
}

class RWObject{
    public static void main(String[] args) {
        Person p1 = new Person("ABC", 10, "Male");
        Person p2 = new Person("XYZ", 20, "Female");

        try{
            FileOutputStream fos = new FileOutputStream("myObjects.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(p1);
            oos.writeObject(p2);

            oos.close();
            fos.close();

            FileInputStream fis = new FileInputStream("myObjects.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);

            Person pr1 = (Person) ois.readObject();
            Person pr2 = (Person) ois.readObject();

            System.out.println(pr1.toString());
            System.out.println(pr2.toString());

            ois.close();
            fis.close();
        }

        catch(FileNotFoundException e){
            e.printStackTrace();
        }

        catch(Exception e){
            e.printStackTrace();
        }

    }
}
