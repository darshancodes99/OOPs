package Inheritance;

public class Inheritance {
    public static void main(String[] args) {
        System.out.println("===student====");
        Student s1 = new Student(1, "kartik", 21, 6);
        s1.printStudent();

        System.out.println("===professor====");
        Professor p1 = new Professor(1, "vivek", 27, 20000);
        p1.printProfessor();
        p1.addSubject("Math");
        p1.addSubject("Computer");
        p1.addSubject("Java");
        p1.PrintSubjects();

    }
}

class Person {
    String name;
    int age;
}

class Student extends Person {
    int sem;
    int rollNo;

    public Student(int rollNo, String name, int age, int sem) {
        this.name = name;
        this.rollNo = rollNo;
        this.age = age;
        this.sem = sem;
    }

    public void printStudent() {
        System.out.println(rollNo);
        System.out.println(name);
        System.out.println(age);
        System.out.println(sem);
    }

}

class Employee extends Person {
    int salary;
    int employeeId;
}

class Professor extends Employee {
    String[] subjects = new String[3];


    public Professor(int employeeId, String name, int age, int salary) {
        this.employeeId = employeeId;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public void printProfessor() {
        System.out.println(employeeId);
        System.out.println(name);
        System.out.println(age);
        System.out.println(salary);
    }

    public void addSubject(String subject) {
        for (int i = 0; i < subjects.length; i++) {
            if (subjects[i] == null) {
                subjects[i] = subject;
                break;
            }
        }
    }

    public void PrintSubjects() {
        System.out.println("subjects : ");
        for (int i = 0; i < subjects.length; i++) {
            System.out.println(subjects[i]);
        }
    }

}