package Abstraction_Interface;

public class Interface {
    public static void main(String[] args) {
        SBI sbi = new SBI();
        sbi.printGood();
        sbi.printIntersent();
        Bank.printHello();

        C c1 = new C();
        c1.printHello();
    }
}

// you can't create object of interface
interface Bank {
    static final int months = 12;

    // abstract method
    public void printIntersent();

    //after java 7, since java 8 interface can have static and default method
    public static void printHello() {
        System.out.println("hello");
    }

    public default void printGood() {
        System.out.println("good");
    }
}

class SBI implements Bank {
    // implementing abstract method
    public void printIntersent() {
        System.out.println(4);
    }
}

interface A{
    default void printHello(){
        System.out.println("hiiiiii");
    }
}

interface B{
    default void printHello(){
        System.out.println("hello");
    }
}

//multiple interface throw interface
class C implements A, B{
    @Override
    public void printHello() {
        A.super.printHello();
    }
}

