enum Type {
    Equilateral, Isosceles,
    Scalene, NotTriangle;
}

class PossibleTriangle {
    private int a;
    private int b;
    private int c;
    private Type pt;

    PossibleTriangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    Boolean isTriangle() {
        if ((a & b & c) < 0 && (b + c <= a) || (c + a <= b) || (a + b <= c)) {
            pt = Type.NotTriangle;
            return false;
        }
        else {
            if (a == b && b == c) {
                pt = Type.Equilateral;
                return true;
            } else if (a == b || b == c || c == a ) {
                pt = Type.Isosceles;
                return true;
            } else {
                pt = Type.Scalene;
            }
        } 
        return true;
    }

    Type getType() {
        return this.pt;
    }

    public void displayInfo() {
        
        isTriangle();

        System.out.printf("a = %d, b = %d, c = %d%n", a, b, c);

        switch (getType()) {
            case Equilateral:
                System.out.println("Equilateral triangle");
                System.out.println("Isoceles triangle");
                System.out.println("A triangle");
                System.out.println("--------------------");
                break;
            
            case Isosceles:
                System.out.println("Isoceles triangle");
                System.out.println("A triangle");
                System.out.println("--------------------");
                break;

            case Scalene:
                System.out.println("A triangle");
                System.out.println("--------------------");
                break;

            default:
                System.out.println("Not a triangle");
                System.out.println("--------------------");
                break;
        }
    }
}


public class revision4 {
    public static void main(String[] args) {
        PossibleTriangle t1 = new PossibleTriangle(4, 5, 6);
        PossibleTriangle t2 = new PossibleTriangle(1, 2, 3);
        PossibleTriangle t3 = new PossibleTriangle(4, 5, 5);
        PossibleTriangle t4 = new PossibleTriangle(6, 6, 6);

        t1.displayInfo();
        t2.displayInfo();
        t3.displayInfo();
        t4.displayInfo();
    }   
}
