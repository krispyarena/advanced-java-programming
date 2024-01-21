package exceptionHandling;

public class ThrowsException {
    
    static void divide(int a, int b) throws ArithmeticException{
        int c = a/b;
        System.out.println("Answer : " + c);
    }

    public static void main(String[] args){
        try{
            divide(10,2);
            divide(12, 0);
        }
        catch(ArithmeticException e){
            e.printStackTrace();
        }
        finally{
            System.out.println("Finally Block");
        }
    }
}
