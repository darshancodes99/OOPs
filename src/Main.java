
public class Main {
    public static void main(String[] args) {
        Student student1 = new Student(1);
        student1.name = "kartik";
        student1.setRollNo(20);
        // copy student 1's property to student 2
        Student student2 = new Student(student1);
        System.out.println(student1.name + " " + student1.getRollNo() + " " + student1.getAge());
        System.out.println(student2.name + " " + student2.getRollNo() + " " + student2.getAge());

        //notebook object
        noteBook note = new noteBook(200, "white", "classMate");
        System.out.println(note.page);
        System.out.println(note.pageColor);
        System.out.println(note.getBrand());

    }
}

class Student {
    public String name;
    private int rollNo;
    private int age;

    //default constructor
    Student() {
    }

    // constructor
    Student(int age) {
        this.age = age;
    }

    // set rollNo for private
    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    // copy constructor
    Student(Student oldStudent) {
        this.name = oldStudent.name;
        this.age = oldStudent.age;
        this.rollNo = oldStudent.rollNo;
    }

    //get method for get
    public int getRollNo() {
        return rollNo;
    }

    //get age
    public int getAge() {
        return age;
    }
}

class noteBook {
    int page;
    String pageColor;
    private String brand;


    noteBook(int page, String pageColor, String brand) {
        this.page = page;
        this.pageColor = pageColor;
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }
}