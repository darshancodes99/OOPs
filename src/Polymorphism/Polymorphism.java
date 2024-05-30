package Polymorphism;

public class Polymorphism {
    // compile time polymorphism
    public static void main(String[] args) {
        sum(10,20, 30);
        sum(10.5,40.5);
    }
    public static void sum(int a, int b){
        int c = a + b;
        System.out.println(c);
    }

    public static void sum(int a, int b, int c){
        int d = a + b + c;
        System.out.println(d);
    }

    public static void sum(double a, double b){
        double d = a + b;
        System.out.println(d);
    }
}

