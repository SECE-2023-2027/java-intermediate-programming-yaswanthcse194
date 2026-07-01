import java.util.*;

class Product {
    private String id, name;
    private double price;
    private int stock;

    Product(String id, String name, double price, int stock) {
        this.id = id;
        this.name = name;
        this.price = price < 0 ? 0.0 : price;
        this.stock = stock < 0 ? 0 : stock;
    }

    public double getPrice() { return price; }
    public int getStock() { return stock; }

    public void applyDiscount(double percent) {
        price -= price * percent / 100;
    }
}

public class productInventryEntityManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String id = sc.next();
        String name = sc.next();
        double price = sc.nextDouble();
        int stock = sc.nextInt();
        double discount = sc.nextDouble();

        Product p = new Product(id, name, price, stock);
        p.applyDiscount(discount);

        System.out.println(p.getPrice());
        System.out.println(p.getStock());
    }
}