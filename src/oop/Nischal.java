package oop;

public class Nischal extends Kritan{
    int wealth;

    Nischal(int age, int wealth){
        super(age);
        this.wealth = wealth;
        System.out.println("Nischal wealth = "+ this.wealth);
    }
}

class Biplove {
    public static void main(String[] args) {
        new Kritan(12);

        System.out.println("Nischal Details: ");
        new Nischal(15, 1);
    }
}
