package oop;

public class Poly3 extends AbsClass{
    
    @Override
    void display(){
        System.out.println("Nischal");
    }

    @Override
    int sum() {
        throw new UnsupportedOperationException("Unimplemented method 'sum'");
    }
}
