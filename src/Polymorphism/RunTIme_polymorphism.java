package Polymorphism;

import java.util.Scanner;

public class RunTIme_polymorphism {
    // in runtime polymorphism it's override method of parent class
    public static void main(String[] args) {
        Bank bank;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter bank number : ");
        int choice = sc.nextInt();
        if (choice == 1){
            bank = new SBI();
        } else {
            bank = new Kotak();
        }
        System.out.print("interest rate is : ");
        bank.getInterestRate();
    }
}
class Bank{
    String customerName;
    double balance;

    public void getInterestRate(){
        System.out.print(4);
    }
}

class SBI extends Bank{

}

class Kotak extends Bank{
    public void getInterestRate(){
        System.out.print(5);
    }
}
