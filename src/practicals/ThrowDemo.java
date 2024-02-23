package practicals;

import java.util.Scanner;

public class ThrowDemo {
 public static void main(String[] args) {
 int age;
 Scanner sc = new Scanner(System.in);
 System.out.println("Enter your age");
 age = sc.nextInt();
 sc.close();
 
 if(age>60)
 {
 try {
 throw new InvalidAgeEXception(age);
 } catch (InvalidAgeEXception ex) {
 System.out.println(ex.getMessage());
 }
 }
 else
 {
 System.out.println("your age is in Required Range " + age); 
 }

 }

}
class InvalidAgeEXception extends Exception
{
 int age ;
 public InvalidAgeEXception(int age) {
 super("Invalid !!! exceed your Age");
 this.age = age;
 
 }
 @Override
 public String getMessage()
 {
 return "Invalid Age Exception /"+ age;
 }
 
}

