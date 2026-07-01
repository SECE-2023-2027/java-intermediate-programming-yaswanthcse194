package abstractShapeBlueprintStrategy;
import java.util.Scanner;
abstract class Shape {
    abstract double getArea();
}
class Circle extends Shape {
    double r;
    Circle(double r) {
        this.r = r;
    }
    double getArea() {
        return Math.PI * r * r;
    }
}
class Rectangle extends Shape {
    double l, b;
    Rectangle(double l, double b) {
        this.l = l;
        this.b = b;
    }
    double getArea() {
        return l * b;
    }
}
public class abstractShapeBlueprintStrategy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter circle radius: ");
        double r = sc.nextDouble();
        System.out.print("Enter rectangle length: ");
        double l = sc.nextDouble();
        System.out.print("Enter rectangle breadth: ");
        double b = sc.nextDouble();
        Shape s1 = new Circle(r);
        Shape s2 = new Rectangle(l, b);
        System.out.println(Math.round(s1.getArea()));
        System.out.println(s2.getArea());
    }
}