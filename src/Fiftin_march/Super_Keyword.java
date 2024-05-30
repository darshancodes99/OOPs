package Fiftin_march;

public class Super_Keyword {
    public static void main(String[] args) {
        Student student = new Student("kartik","9876578567",21,1,4);
        System.out.println(student.getName());
        System.out.println(student.getContact());
        System.out.println(student.getAge());

        System.out.println(student.getRollNo());
        System.out.println(student.getSem());
    }
}

class Person{
    private String name;
    private String contact;
    private int age;

    public Person(String name, String contact, int age){
        this.name = name;
        this.contact = contact;
        this.age = age;
    }

    public String getName(){
        return name;
    }
    public String getContact(){
        return contact;
    }
    public int getAge(){
        return age;
    }

}

class Student extends Person{
    private int rollNo;
    private int sem;
    public Student(String name, String contact, int age, int rollNo, int sem) {
        super(name, contact, age);
        this.rollNo = rollNo;
        this.sem = sem;
    }

    public int getRollNo(){
        return rollNo;
    }

    public int getSem(){
        return sem;
    }
}