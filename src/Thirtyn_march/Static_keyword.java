package Thirtyn_march;

public class Static_keyword {
    public static void main(String[] args) {
        Student student1 = new Student(1,"kartik",21);
        Student.schoolName = "Ncvb";
        student1.printGoodNight();
        student1.displayDetails();
        System.out.println(Student.schoolName);
    }
}

class Student{
    int rollNo;
    String name;
    int age;
    static String schoolName;

    // static block
    static {
        schoolName = "p.p. savani";
    }

    // you can't use non-static method in static method
    public static void printGoodMorning(){
        System.out.println("good morning");
    }

    // you can use static method in non-static method
    public void printGoodNight(){
        System.out.println("good night");
        // you can use static method in non-static method
        printGoodMorning();
    }
    Student(int rollNo, String name, int age){
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
    }

    public void displayDetails(){
        System.out.println(rollNo);
        System.out.println(name);
        System.out.println(age);
    }
}