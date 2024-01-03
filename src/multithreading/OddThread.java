package multithreading;

public class OddThread extends Thread{
    @Override
    public void run(){
        for(int i = 101; i<150; i=i+2){
            System.out.println(i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("ODD THREAD COMPLETED");
    }
}
