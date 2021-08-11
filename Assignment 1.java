import java.util.*;

class Phone { 
    private String name;
    private double price;
    private int qty;

    Phone() {}

    Phone(String name, double price, int qty) {
        setPhone(name, price, qty);
    }

    public String getName() {
        return this.name;
    }

    public double getPrice() {
        return this.price;
    }

    public int getQty() {
        return this.qty;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }


    private void setPhone(String name, double price, int qty) {
        this.name = name;
        this.price = price;
        this.qty = qty;
    }
}

// Main class
public class revision1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Phone p1 = new Phone();
        Phone p2 = new Phone();
        Phone p3 = new Phone();

        String name;
        double price;
        int qty;

        // Task 1, 2
        System.out.println("\nWelcome to iPhone online services");
        System.out.println("---------------------------------");
        System.out.println("Enter three iPhones to be sold");
        
        System.out.printf("1. ");
        p1.setName(input.nextLine());

        System.out.printf("2. ");
        p2.setName(input.nextLine());

        System.out.printf("3. ");
        p3.setName(input.nextLine());

        System.out.println("");

        System.out.printf("Enter the quantities and price of %s: ",p1.getName());
        p1.setQty(input.nextInt());
        p1.setPrice(input.nextDouble());

        System.out.printf("Enter the quantities and price of %s: ",p2.getName());
        p2.setQty(input.nextInt());
        p2.setPrice(input.nextDouble());

        System.out.printf("Enter the quantities and price of %s: ",p3.getName());
        p3.setQty(input.nextInt());
        p3.setPrice(input.nextDouble());

        System.out.println("");

        System.out.println("Summary of iPhones");
        System.out.println("------------------\n");
        System.out.printf("%-20s%-10s%10s%n", "iPhone", "Quantity", "Price");
        System.out.printf("-------------------------------------------%n");
        System.out.printf("%-20s%-10s%10s%n", p1.getName(), p1.getQty(), p1.getPrice());
        System.out.printf("%-20s%-10s%10s%n", p2.getName(), p2.getQty(), p2.getPrice());
        System.out.printf("%-20s%-10s%10s%n", p3.getName(), p3.getQty(), p3.getPrice());
        System.out.printf("-------------------------------------------%n");
        System.out.println("");

        // End Task 1, 2

        // Task 3
        String tmpName = p1.getName();
        double tmpPrice = p1.getPrice();
        int tmpQty = p1.getQty();

        p1.setName(p2.getName()); 
        p1.setPrice(p2.getPrice()); 
        p1.setQty(p2.getQty()); 

        p2.setName(tmpName); 
        p2.setPrice(tmpPrice); 
        p2.setQty(tmpQty); 

        System.out.println("Summary of iPhones after the swaps");
        System.out.println("--------------------------------\n");
        System.out.printf("%-20s%-10s%10s%n", "iPhone", "Quantity", "Price");
        System.out.printf("-------------------------------------------%n");
        System.out.printf("%-20s%-10s%10s%n", p1.getName(), p1.getQty(), p1.getPrice());
        System.out.printf("%-20s%-10s%10s%n", p2.getName(), p2.getQty(), p2.getPrice());
        System.out.printf("%-20s%-10s%10s%n", p3.getName(), p3.getQty(), p3.getPrice());
        System.out.printf("-------------------------------------------%n%n");


        System.out.println("Place your order");
        System.out.println("----------------");
        System.out.printf("No of %s: ", p1.getName());
        int orderQty1 = input.nextInt();
        System.out.printf("No of %s: ", p2.getName());
        int orderQty2 = input.nextInt();
        System.out.printf("No of %s: ", p3.getName());
        int orderQty3 = input.nextInt();

        System.out.println("");

        double cost1 = p1.getPrice() * orderQty1;
        double cost2 = p2.getPrice() * orderQty2;
        double cost3 = p3.getPrice() * orderQty3;

        double subtotal = cost1 + cost2 + cost3;
        double gst = 0.07 * subtotal;
        double tCost = subtotal + gst;

        System.out.println("Summary of your order");
        System.out.println("---------------------\n");
        System.out.printf("%-30s%-10s%10s%n", "iPhone", "Quantity", "Cost");
        System.out.printf("------------------------------------------------------%n");
        System.out.printf("%-30s%-12d%.2f%n", p1.getName(), orderQty1, cost1);
        System.out.printf("%-30s%-12d%.2f%n", p2.getName(), orderQty2, cost2);
        System.out.printf("%-30s%-12d%.2f%n", p3.getName(), orderQty3, cost3);
        System.out.printf("------------------------------------------------------%n");
        System.out.printf("%-40s%10.2f%n", "Subtotal:", subtotal);
        System.out.printf("%-40s%10.2f%n", "GST (7%):", gst);
        System.out.printf("%-40s%10.2f%n", "Total cost:", tCost);
        System.out.printf("------------------------------------------------------%n");


        int remain1 = p1.getQty() - orderQty1;
        int remain2 = p2.getQty() - orderQty2;
        int remain3 = p3.getQty() - orderQty3;


        System.out.println("Balance report");
        System.out.printf("---------------%n%n");
        System.out.printf("%-20s%-10s%9s%12s%n", "iPhone", "Quantity", "Sold", "Balance");
        System.out.printf("-----------------------------------------------------------%n");
        System.out.printf("%-20s%-15d%-11d%-10d%n", p1.getName(), p1.getQty(), orderQty1, remain1);
        System.out.printf("%-20s%-15d%-11d%-10d%n", p2.getName(), p2.getQty(), orderQty2, remain2);
        System.out.printf("%-20s%-15d%-11d%-10d%n", p3.getName(), p3.getQty(), orderQty3, remain3);
        System.out.printf("-----------------------------------------------------------%n");
    }
}
