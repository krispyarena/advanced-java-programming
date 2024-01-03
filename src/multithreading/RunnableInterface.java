package multithreading;

class RunnableInterface implements Runnable
{
    String threadName;
    RunnableInterface(String threadName)
    {
        this.threadName = threadName;
        System.out.println("Creating "+ this.threadName);
    }
    

    @Override
    public void run() {
       System.out.println("Running: "+ threadName);
    try{
    
        for(int i=4;i>0;i--)
        {
            System.out.println("Thread: "+ threadName +" Printing :"+i);
            Thread.sleep(1000);
        }
    }
    catch (InterruptedException e)
    {
        System.out.println("Thread "+ threadName+" interrrupted");
    }
    System.out.println("Thread "+ threadName +" existing");
}

    public static void main(String[] args) {
        RunnableInterface R1 = new RunnableInterface("one");
        Thread t1 = new Thread(R1);
        t1.start();

        RunnableInterface R2 = new RunnableInterface("two");
        Thread t2 = new Thread(R2);
        t2.start();

        /*  Above code can also be written as:
         *  
         *  new Thread(new RunnableInterface("one")).start();
         *  new Thread(new RunnableInterface("two")).start();
         * 
         */

    }
}
