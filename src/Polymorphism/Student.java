package Polymorphism;

public class Student {
    int age;
    String name;

    // in this we use same function printStudent() for different different purpose
    public void printStudent(int age){
        System.out.println(age);
    }
    public void printStudent(String name){
        System.out.println(name);
    }

    public void printStudent(int age, String name){
        System.out.println(age + " " + name);
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.age = 20;
        s1.name = "kartik";
        // in this we use same function for different different purpose
        s1.printStudent(s1.age);
        s1.printStudent(s1.name);
        s1.printStudent(s1.age, s1.name);

    }
}
