package Ninetin_march;

public class Aggregation {
    public static void main(String[] args) {
        Student s1 = new Student(1,"kartik",108,"dhramNagar","A.k. road","surat","gujarat",395006);
        s1.displayDetails();
    }
}
class Address{
    int hNo;
    String soc;
    String area;
    String city;
    String state;
    int pin;

    public Address(int hNo, String soc, String area, String city, String state, int pin) {
        this.hNo = hNo;
        this.soc = soc;
        this.area = area;
        this.city = city;
        this.state = state;
        this.pin = pin;
    }
}

class Student{
    int rNo;
    String name;
    Address address;

    public Student(int rNo, String name,int hNo, String soc, String area, String city, String state, int pin) {
        this.rNo = rNo;
        this.name = name;
        this.address = new Address(hNo,soc,area,city,state,pin);
    }

    public void displayDetails(){
        System.out.println("roll no : " + rNo);
        System.out.println("name : " + name);
        System.out.println("address : " + address.hNo + " " + address.soc + " " + address.area + " " + address.city + " " + address.state + " " + address.pin);
    }
}
