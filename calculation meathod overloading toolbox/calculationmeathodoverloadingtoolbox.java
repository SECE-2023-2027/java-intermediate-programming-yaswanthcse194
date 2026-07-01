import java.util.Scanner;

class AreaCalculator {

    static double calculateArea(double radius) {   // Circle
        return Math.PI * radius * radius;
    }

    static double calculateArea(double length, double width) { // Rectangle
        return length * width;
    }

    static double calculateArea(int side) {   // Square
        return side * side;
    }
}

public class calculationmeathodoverloadingtoolbox {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter circle radius: ");
        double radius = sc.nextDouble();

        System.out.print("Enter rectangle length and width: ");
        double length = sc.nextDouble();
        double width = sc.nextDouble();

        System.out.print("Enter square side: ");
        int side = sc.nextInt();

        System.out.println(AreaCalculator.calculateArea(radius));
        System.out.println(AreaCalculator.calculateArea(length, width));
        System.out.println(AreaCalculator.calculateArea(side));
    }
}