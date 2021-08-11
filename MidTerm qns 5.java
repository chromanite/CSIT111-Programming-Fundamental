import java.util.Random;

enum PetType {
    Dog, Cat, Mouse, Duck, Cow;
}

class Pet {
    private PetType pt;
    private double cost;

    public Pet() {
        this.pt = PetType.Dog;
        this.cost = 0.0;
    }

    public Pet(PetType pt, double cost) {
        setInfo(pt, cost);
    }

    public Pet(Pet p) {
        this.pt = p.pt;
        this.cost = p.cost;
    }

    public PetType getPet() {
        return this.pt;
    }

    public void setInfo(PetType pt, double cost) {
        this.pt = pt;
        this.cost = cost;
    }

    private double totalCost() {
        return cost * 1.07;
    }

    public void displayInfo() {

        double gst = cost * 0.07;

        System.out.println("Pet: " + getPet());
        System.out.printf("Cost (subtotal): %.2f%n", cost);
        System.out.printf("GST (%s): %.2f%n", "7%", gst);
        System.err.printf("Total cost: %s%.2f%n", "$",totalCost());
        System.out.println("-------------------------");
    }

}


public class qns5 {

    private PetType getPet() {
        Random rand = new Random();

        int x = rand.nextInt(5);

        if (x == 0) {
            return PetType.Dog;
        } else if (x == 1) {
            return PetType.Cat;
        } else if (x == 2) {
            return PetType.Mouse;
        } else if (x == 3) {
            return PetType.Duck; 
        } else if (x == 4) {
            return PetType.Cow;
        }

        return PetType.Dog;
    }

    private double getCost() {
        Random rand = new Random();

        return 0.0 + (1000.0 - 0.0) * rand.nextDouble();
    }

    private void get3Pets(Pet p1, Pet p2, Pet p3) {
        p1.displayInfo();
        p2.displayInfo();
        p3.displayInfo();
    }

    public static void main(String[] args) {
        qns5 shop = new qns5();

        Pet p1 = new Pet(shop.getPet(), shop.getCost());
        Pet p2 = new Pet(shop.getPet(), shop.getCost());
        Pet p3 = new Pet(shop.getPet(), shop.getCost());

        shop.get3Pets(p1, p2, p3);
    }
}
