package multithreading;

public class EvenThread extends Thread{

    @Override
    public void run () {
        try{
        for(int i = 100; i<150; i=i+2){
            System.out.println(i);
            Thread.sleep(100);
        }
        System.out.println("EVEN THREAD COMPLETED");
    }
    catch(InterruptedException e){
        System.out.println("Interrupted Exception");
    }
    }
    
}