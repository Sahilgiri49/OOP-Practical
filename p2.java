import java.util.ArrayList;
import java.util.Scanner;

class Product {
    int productId;
    String name;
    double price;
    int quantity;

    Product(int productId, String name, double price, int quantity) {
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    Product(String name, double price) {
        this.productId = 0;
        this.name = name;
        this.price = price;
        this.quantity = 1;
    }

    Product(String name) {
        this.productId = 0;
        this.name = name;
        this.price = 0;
        this.quantity = 1;
    }

    double getCost() {
        return price * quantity;
    }
}

class Order {
    ArrayList<Product> products = new ArrayList<>();

    void addProduct(Product product) {
        products.add(product);
    }

    double calculateTotal() {
        double total = 0;

        for (Product p : products) {
            total += p.getCost();
        }

        return total;
    }

    void generateInvoice() {
        double total = calculateTotal();
        double discount = 0;

        if (total > 1000) {
            discount = total * 0.15;
        } else if (total > 500) {
            discount = total * 0.10;
        }

        double quantityDiscount = 0;

        for (Product p : products) {
            if (p.quantity > 10) {
                quantityDiscount += p.getCost() * 0.05;
            }
        }

        double finalAmount = total - discount - quantityDiscount;

        System.out.println("\n----- E-COMMERCE INVOICE -----");

        for (Product p : products) {
            System.out.println(
                "ID: " + p.productId +
                " | Name: " + p.name +
                " | Price: " + p.price +
                " | Quantity: " + p.quantity +
                " | Cost: " + p.getCost()
            );
        }

        System.out.println("Total Cost: " + total);
        System.out.println("Order Discount: " + discount);
        System.out.println("Quantity Discount: " + quantityDiscount);
        System.out.println("Final Amount: " + finalAmount);
    }
}

public class EcommerceOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Order order = new Order();

        Product p1 = new Product(101, "Laptop", 50000, 1);
        Product p2 = new Product("Mouse", 800);
        Product p3 = new Product("Keyboard");

        order.addProduct(p1);
        order.addProduct(p2);
        order.addProduct(p3);

        System.out.print("Enter product ID: ");
        int id = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter product name: ");
        String name = sc.nextLine();

        System.out.print("Enter product price: ");
        double price = sc.nextDouble();

        System.out.print("Enter product quantity: ");
        int quantity = sc.nextInt();

        Product userProduct = new Product(id, name, price, quantity);
        order.addProduct(userProduct);

        order.generateInvoice();

        sc.close();
    }
}