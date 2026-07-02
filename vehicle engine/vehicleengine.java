import java.util.Scanner;

class Vehicle {
    String startEngine() {
        return "Vehicle engine started";
    }
}

class Car extends Vehicle {
    String startEngine() {
        return "Car engine roars";
    }
}

class Motorcycle extends Vehicle {
    String startEngine() {
        return "Motorcycle engine revs";
    }
}

public class vehicleengine
 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Vehicle[] v = new Vehicle[2];

        v[0] = new Car();
        v[1] = new Motorcycle();

        for (Vehicle vehicle : v) {
            System.out.println(vehicle.startEngine());
        }
    }
}