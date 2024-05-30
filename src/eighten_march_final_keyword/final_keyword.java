package eighten_march_final_keyword;

public class final_keyword {
    public static void main(String[] args) {
        // we can't change final variable's value
        final int a = 10;
        System.out.println(a);


    }
}

class Bank{
    public final void printInterest(){
        System.out.println(4);
    }
    // we can't override final method's body
}
final class ABC extends Bank {
    // we can't extend final class
}