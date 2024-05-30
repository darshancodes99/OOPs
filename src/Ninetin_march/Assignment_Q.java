package Ninetin_march;

public class Assignment_Q {
    public static void main(String[] args) {
        System.out.println("===Bicycle====");
        Bicycle b1 = new Bicycle();
        b1.changeGear();
        b1.changeGear();
        b1.changeGear();


        System.out.println("===Bike====");
        Bike bike = new Bike();
        bike.changeGear();
        bike.changeGear();
        bike.changeGear();
        bike.changeGear();

        System.out.println("===Car====");
        Car c1 = new Car();
        c1.changeGear();
        c1.changeGear();
        c1.changeGear();
        c1.changeGear();
        c1.changeGear();
        c1.changeGear();

    }
}

interface Vehicle {
    public void changeGear();
}

class Bicycle implements Vehicle {
    int gear = 0;

    public void changeGear() {
        gear++;
        if (gear <= 2) {
            System.out.println("your bicycle in " + gear + " gear");
        } else {
            System.out.println("you can't change the gear");
        }
    }
}

class Bike implements Vehicle{
    int gear = 0;

    public void changeGear() {
        gear++;
        if (gear <= 3) {
            System.out.println("your bike in " + gear + " gear");
        } else {
            System.out.println("you can't change the gear");
        }
    }
}

class Car implements Vehicle{
    int gear = 0;
    public void changeGear() {
        gear++;
        if (gear <= 5) {
            System.out.println("your car in " + gear + " gear");
        } else {
            System.out.println("you can't change the gear");
        }
    }

}


