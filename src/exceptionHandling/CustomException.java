package exceptionHandling;

import java.util.Scanner;

public class CustomException extends Exception{
    
    CustomException(String message){
        super(message);
    }
}

class TestCustomException{
    static void verifyAge(int age) throws CustomException{
        if (age<18){
            throw new CustomException("Ineligible to Vote");
        }
        else{
            System.out.println("Eligible to Vote");
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age : ");
        int age = scanner.nextInt();

        try{
        verifyAge(age);
        }

        catch(CustomException e){
            System.out.println(e.getMessage());
        }

        finally{
            System.out.println("Code of Finally block");
        }
        scanner.close();
    }
}