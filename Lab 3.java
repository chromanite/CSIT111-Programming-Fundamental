import java.util.Scanner;

class PetrolPurchase {
    private String station;
    private double quantity;
    private String type;
    private double price;
    private int discount;

    PetrolPurchase(String s, double q, String t, double p, int d) {
        setInfo(s, q, t, p, d);
    }

    PetrolPurchase(PetrolPurchase pp) {
        this.station = pp.getStation();
        this.quantity = pp.getQuantity();
        this.type = pp.getType();
        this.price = pp.getPrice();
        this.discount = pp.getDiscount();
    }

    public String getStation() {
        return this.station;
    }

    public double getQuantity() {
        return this.quantity;
    }

    public String getType() {
        return this.type;
    }

    public double getPrice() {
        return this.price;
    }

    public int getDiscount() {
        return this.discount;
    }

    public void setStation(String station) {
        this.station = station;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    private double computePayment() {
        return quantity * price;
    }

    public double getPayment() {
        return computePayment();
    }
    
    private void setInfo(String s, double q, String t, double p, int d) {
        this.station = s;
        this.quantity = q;
        this.type = t;
        this.price = p;
        this.discount = d;
    }

    public void printInfo() {
        double disc = ((double)getDiscount() / 100) * getPayment();
        double pay = getPayment() -  disc;
        System.out.printf("Statiom: %s%n", getStation());       
        System.out.printf("Total litre: %.2f%n", getQuantity());       
        System.out.printf("Petrol type: %s%n", getType());       
        System.out.printf("Price per liter: %.2f%n", getPrice());       
        System.out.printf("Actual cost: %.2f%n", getPayment());       
        System.out.printf("Discount(%d%s): %.2f%n", getDiscount(), "%", disc);       
        System.out.printf("Amount to pay: %.2f%n", pay);
    }
}


public class revision3 {

    private static Scanner input;
    public static void main(String[] args) {
        input = new Scanner(System.in);

        System.out.printf("Enter the station: ");
        String s = input.nextLine();
        
        System.out.printf("Enter quantity in litre: ");
        double q = input.nextDouble();

        input.nextLine();

        System.out.printf("Enter type of petrol: ");
        String t = input.nextLine();
        
        System.out.printf("Enter price of petrol: ");
        double p = input.nextDouble();
        
        System.out.printf("Enter discount: ");
        int d = input.nextInt();

        PetrolPurchase pp = new PetrolPurchase(s, q, t, p, d);

        System.out.printf("%nSummary of your purchase%n");
        pp.printInfo();

        System.out.printf("%nEnter additional quantity of petrol: ");
        q = input.nextDouble();

        pp.setQuantity(pp.getQuantity() + q);

        System.out.printf("%nYour new purchased price%n");
        pp.printInfo();

        System.out.printf("%nDuplicate the same object%n");
        PetrolPurchase pp2 = new PetrolPurchase(pp);
        pp2.printInfo();
    }
}
