package biplove;

public class MethodOverload {
    public static void main(String[] args) {

        MethodOverload mo = new MethodOverload();
        System.out.println(mo.sum(2.2, 9.1));
        System.out.println(mo.sum(2,3));
        System.out.println(mo.sum(1,2,4));
    }

    int sum(int a, int b){
        return a+b;
    }

    int sum(int a, int b, int c){
        return a+b+c;
    }

    double sum(double a, double b){
        return a+b;
    }
}
