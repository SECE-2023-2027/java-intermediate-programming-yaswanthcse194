import java.util.Scanner;
abstract class Appliance {
    String brand;
    Appliance(String brand) {
        this.brand = brand;
    }
    void turnOn() {
        System.out.println("Appliance is now powered on.");
    }
    abstract void makeWork();
}
class WashingMachine extends Appliance {
    WashingMachine(String brand) {
        super(brand);
    }
    void makeWork() {
        System.out.println("Washing machine is washing clothes.");
    }
}
public class abstractApplianceCatalogWorkflow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String brand = sc.nextLine();
        Appliance app = new WashingMachine(brand);
        app.turnOn();
        app.makeWork();
    }
}