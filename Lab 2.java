import java.util.*;

public class revision2 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.printf("Enter 4 digits integer to be encrypted: ");
        int n = kb.nextInt();

        int a, b, c, d;

        d = n % 10;

        n /= 10;

        c = n % 10;

        n /= 10;

        b = n % 10;

        a = n / 10;

        a = (a + 7) % 10;
        b = (b + 7) % 10;
        c = (c + 7) % 10;
        d = (d + 7) % 10;

        int temp = a;
        a = c;
        c = temp;

        int temp1 = b;
        b = d;
        d = temp1;

        System.out.printf("Encrypted integer is %d%d%d%d%n%n", a,b,c,d);
    }
}