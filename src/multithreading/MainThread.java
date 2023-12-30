package multithreading;

public class MainThread {
    public static void main(String[] args) {
        for(int i = 1; i<10; i++)
        System.out.println(i);

        System.out.println("MAIN THREAD COMPLETED");

    EvenThread a = new EvenThread();
    OddThread b = new OddThread();

    a.start();
    b.start();
    }
}
