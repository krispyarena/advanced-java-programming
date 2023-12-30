package oop;

public class Poly2 extends Poly1{


    void display(){
        super.display();
        System.out.println("Nischal");
    }
    public static void main(String[] args) {
        
        Poly1 p = new Poly1();
        p.display();

        Poly3 p1 = new Poly3();
        p1.display();
    }    
}
