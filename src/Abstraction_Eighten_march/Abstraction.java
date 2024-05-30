package Abstraction_Eighten_march;

public class Abstraction {
    public static void main(String[] args) {
        Bank b = new SBI();
        SBI sbi = new SBI();
        sbi.printInterset();
    }
}

// abstraction is 0 to 100% in abstraction class
// we can't create object of abstract class
abstract class Bank {
    int accountNo;
    String name;

    public void printHello() {
        System.out.println("hello");
    }

    // abstract method has no body
    abstract public void printInterset();
}

class SBI extends Bank {
    // if we extend abstract class we have to compulsory use the abstract method of abstract class
    public void printInterset() {
        System.out.println(5);
    }
}