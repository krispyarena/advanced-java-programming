package multithreading;

public class B extends Thread{
    @Override
    public void run(){
        for(int i = 101; i<150; i=i+2){
            System.out.println(i);
        }
        System.out.println("ODD THREAD COMPLETED");
    }
}
