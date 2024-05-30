package Eleven_march;

public class Basic {

    public static void main(String[] args) {
        // Q1
        System.out.println("=====Q1=====");
        Student student = new Student();
        student.setStudDetails(1, "kartik", 100, 150, 160);
        student.calculateTotal();
        student.displayStudDetails();


        //Q2
        System.out.println("=====Q2=====");
        Account account1 = new Account(12345, "kartik", 200, 5);
        account1.calculateInterest();
        account1.displayAccountDetails();

        //Q3
        System.out.println("=====Q3=====");
        Account2 account2 = new Account2();
        account2.setAccountDetails(1245670, "kartik", 200);
        account2.withdraw(50);
        account2.deposit(100);
        account2.dispAccountDetails();

        //Q4
        System.out.println("=====Q4=====");
        StudentInfo student1 = new StudentInfo(1, "kartik", 50, 60, 70);
        StudentInfo student2 = new StudentInfo(2, "kishan", 90, 60, 70);
        StudentInfo student3 = new StudentInfo(3, "darshan", 50, 99, 70);
        StudentInfo student4 = new StudentInfo(4, "maulik", 50, 65, 70);
        StudentInfo student5 = new StudentInfo(5, "meet", 33, 60, 70);
        student1.calculateTotal();
        student2.calculateTotal();
        student3.calculateTotal();
        student4.calculateTotal();
        student5.calculateTotal();

        StudentInfo[] studentInformation = new StudentInfo[5];
        studentInformation[0] = student1;
        studentInformation[1] = student2;
        studentInformation[2] = student3;
        studentInformation[3] = student4;
        studentInformation[4] = student5;

//        for (int i = 0; i < studentInformation.length - 1; i++){
//            for (int j = 0; j < studentInformation.length - i - 1; j++){
//                if (studentInformation[j].calculateTotal() < studentInformation[j + 1].calculateTotal()){
//                    StudentInfo temp = studentInformation[j];
//                    studentInformation[j] = studentInformation[j + 1];
//                    studentInformation[j + 1] = temp;
//                }
//            }
//        }
//
//
//        for (int i = 0; i < studentInformation.length; i++) {
//            if (i < 3){
//                System.out.println(studentInformation[i].calculateTotal());
//            }
//        }

        // get top 3 students
        getTop3Student(studentInformation);
    }

    public static void getTop3Student(StudentInfo[] studentInformation){
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int max3 = Integer.MIN_VALUE;
        String name1 = "";
        String name2 = "";
        String name3 = "";

        for (int i = 0; i < studentInformation.length; i++) {
            if (studentInformation[i].calculateTotal() > max1) {
                max3 = max2;
                max2 = max1;
                max1 = studentInformation[i].calculateTotal();
                name1 = studentInformation[i].name;
            } else if (studentInformation[i].calculateTotal() > max2 && max1 != studentInformation[i].calculateTotal()) {
                max2 = studentInformation[i].calculateTotal();
                name2 = studentInformation[i].name;
            } else if (studentInformation[i].calculateTotal() > max3 && max2 != studentInformation[i].calculateTotal()) {
                max3 = studentInformation[i].calculateTotal();
                name3 = studentInformation[i].name;
            }
        }

        System.out.println("first : " + name1 + " " + max1);
        System.out.println("second : " + name2 + " " + max2);
        System.out.println("third : " + name3 + " " + max3);
    }

}

class Student {
    int rollNo;
    String name;
    int mark1;
    int mark2;
    int mark3;
    int totalMarks;

    public void setStudDetails(int rollNo, String name, int mark1, int mark2, int mark3) {
        this.rollNo = rollNo;
        this.name = name;
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
    }

    public void calculateTotal() {
        this.totalMarks = this.mark1 + this.mark2 + this.mark3;
    }

    public void displayStudDetails() {
        System.out.println(this.rollNo);
        System.out.println(this.name);
        System.out.println(this.totalMarks);
    }

}

class Account {
    int accountNumber;
    String customerName;
    int balance;
    int interestRate;

    Account(int accountNumber, String customerName, int balance, int interestRate) {
        this.accountNumber = accountNumber;
        this.customerName = customerName;
        this.balance = balance;
        this.interestRate = interestRate;
    }

    public void calculateInterest() {
        double interest = (this.balance * this.interestRate) / 100;
        this.balance = balance + (int) interest;
    }

    public void displayAccountDetails() {
        System.out.println(this.accountNumber);
        System.out.println(this.customerName);
        System.out.println(this.balance);
        System.out.println(this.interestRate);
    }

}

class Account2 {
    int accountNo;
    String customerName;
    int accountBalance;

    public void setAccountDetails(int accountNo, String customerName, int accountBalance) {
        this.accountNo = accountNo;
        this.customerName = customerName;
        this.accountBalance = accountBalance;
    }

    public void withdraw(int withdraw) {
        if (withdraw <= this.accountBalance){
            this.accountBalance = this.accountBalance - withdraw;
        }
    }

    public void deposit(int deposit) {
        this.accountBalance = this.accountBalance + deposit;
    }

    public void dispAccountDetails() {
        System.out.println(this.accountNo);
        System.out.println(this.customerName);
        System.out.println(this.accountBalance);
    }
}

class StudentInfo {
    int rollNo;
    String name;
    int marks1;
    int marks2;
    int marks3;

    StudentInfo(int rollNo, String name, int marks1, int marks2, int marks3) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks1 = marks1;
        this.marks2 = marks2;
        this.marks3 = marks3;
    }

    public int calculateTotal() {
        return this.marks1 + this.marks2 + this.marks3;
    }


}

