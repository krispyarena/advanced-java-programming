package oop;

public abstract class AbsClass {

    // Abstrat class can contain both abstract and non abstract methods.
    // Interfaces can contain constants and abstract methods only.
    
    abstract void display();

    abstract int sum();
    
    void sum1(){
        System.out.println("Sum");
    }
}
