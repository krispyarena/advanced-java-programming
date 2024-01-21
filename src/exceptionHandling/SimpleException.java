package exceptionHandling;

public class SimpleException {
    public static void main(String[] args){
    
        try {
            try {
                int a = 12/0;
                a = a++;
            } catch (ArithmeticException e) {
                System.out.println("ArithmeticException");
            }
            int[] b = new int[5];
            b[10] = 20;
        }
        catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("ArrayIndexOutOfBoundsException");
        }
        
        finally{
            System.out.println("Finally Block always executes");;
        }
      
    
}
}