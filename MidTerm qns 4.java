class FourSides {

    private static final String SQR = "==> It is a Square\n";
    private static final String REC = "==> It is a Rectangle\n";
    private static final String QUA = "==> It is a Quadrilateral\n";
    private static final String NIL = "==> It is a not a valid quadrilateral\n";
    private int a;
    private int b;
    private int c;
    private int d;
    private String pt;

    public FourSides() {
        this.a = 1;
        this.b = 1;
        this.c = 1;
        this.d = 1;
        displayInfo();
    }

    public FourSides(int a, int b, int c, int d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        displayInfo();
    }

    private String getType() {
        if (a == b && b == c && c == d) {
            this.pt = SQR + REC + QUA;
        } else if (a == b || a == c || a == d || b == c || b == d || c == d) {
            this.pt = REC + QUA;
        } else if ((a | b | c | d) > 0) {
            this.pt = REC;
        } else {
            this.pt = NIL;
        }

        return pt;
    }

    public void displayInfo() {
        System.out.printf("%s (%d, %d, %d, %d)%n", "PossibleType", a, b, c, d);
        System.out.printf(getType());
        System.out.println("----------------------------------");
 
    }
}

public class qns4 {
    public static void main(String[] args) {
        FourSides s1 = new FourSides();
        FourSides s2 = new FourSides(8,8,8,8);
        FourSides s3 = new FourSides(8,9,8,9);
        FourSides s4 = new FourSides(5,6,7,8);
        FourSides s5 = new FourSides(3,-1,0,7);        
    }
}
