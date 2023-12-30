package exhandle;

public class Excep {
    public static void main(String[] args){
    
        try {
            try {
                int a = 12/0;
                a = a++;
            } catch (Exception e) {
                System.out.println("Exception");
            }
            int b = 20/0;
            b = b++;
        }
        
        finally{
            System.out.println("Finally");;
        }
      
    
}
}