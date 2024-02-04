package core;

import java.util.Scanner;

public class Palindrome{
public static void main(String[] args) {

    Scanner sc= new Scanner(System.in);

    System.out.println("Enter  a number");
    var i=sc.nextInt();

    int r;
    int x=i;
    int rev=0;

    do{
        r= i%10;
        rev=10*rev+r;
        i=i/10;


    } while(i!=0);

    if (rev==x)
        System.out.println("palindrome");
    
        else
        System.out.println("not");

        sc.close();
    }

  
}



