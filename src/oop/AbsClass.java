package oop;

public abstract class AbsClass {

    // Abstrat class can contain both abstract and non abstract methods.
    // Interfaces can contain constants and abstract methods only.

    // Abstract class can't be instantiated as it is incomplete thus we cant create an object of that class.
    
    abstract void display();

    abstract int sum();
    
    void sum1(){
        System.out.println("Sum");
    }
}
