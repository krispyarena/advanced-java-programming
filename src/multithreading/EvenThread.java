package multithreading;

public class A extends Thread{

    @Override
    public void run(){
        for(int i = 100; i<150; i=i+2){
            System.out.println(i);
        }
        System.out.println("EVEN COMPLETED");
    }
    
}