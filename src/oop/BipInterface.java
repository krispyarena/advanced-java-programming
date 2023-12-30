package oop;

public interface BipInterface {
    void sum(int a, int b);

    int s(int a);

}

interface KInterface {

    void sum(int a, int b);

    
}

interface NInterface extends KInterface, BipInterface{

}

class Kclass implements BipInterface, KInterface{

    @Override
    public void sum(int a, int b){
        System.out.println("Sum 2= "+ (a+b));
    }

    @Override
    public int s(int a){
        System.out.println("Sum 1= "+ a);
        return 0;
    }

    public static void main(String[] args) {
        Kclass k = new Kclass();
        k.s(12);
        k.sum(15, 20);
    }
}
