package multithreading;

class RunnableInterface implements Runnable
{
    String tname;
    RunnableInterface(String n)
    {
        tname = n;
        System.out.println("creating"+tname);
    }
    

    @Override
    public void run() {
       System.out.println("running: "+tname);
    try{
    
        for(int i=4;i>0;i--)
        {
            System.out.println("thread:"+ tname+"Printing :"+i);
            Thread.sleep(50);
        }
    }
    catch (InterruptedException e)
    {
        System.out.println("thread"+tname+"interrrupted");
    }
    System.out.println("Thread"+tname+"existing");
}

    public static void main(String[] args) {
        // RunnableInterface R1 = new RunnableInterface("one");
        Thread t1 = new Thread(new RunnableInterface("one"));
        t1.start();
         RunnableInterface R2 = new RunnableInterface("two");
        Thread t2 = new Thread(R2);
        t2.start();
        


    }
}
