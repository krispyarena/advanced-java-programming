package biplove;


public class Constructors {
    private int roll;
    private String name;
    private double percent;

    static void display(){
        System.out.println("Hello");
    }

// Name of constructor is same as the name of class in java
// Contructors are responsible for intialising the variables of that class

    public Constructors(int roll, String name, double percent){
        this.name = name;
        this.percent = percent;
        this.roll = roll;

        System.out.println("Name = "+ this.name);
        System.out.println("Roll = "+ this.roll);
        System.out.println("Percent = "+ this.percent);
    }
    public Constructors(){
        System.out.println("2nd constr.");
    }

    public void getRoll() {
        System.out.println(roll);
    }

    public String getName() {
        return name;
    }

    public double getPercent() {
        return percent;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public void subediName(String name) {
        this.name = name;
    }

    public void setPercent(double percent) {
        this.percent = percent;
    }

    
}
