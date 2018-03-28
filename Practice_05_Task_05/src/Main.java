import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("A = ");
        long a = scanner.nextInt();
        System.out.print("B = ");
        long b = scanner.nextInt();

        long gcd = euclid_gcd_recursive(a, b);
        System.out.format("НОД(%d, %d) = %d", a, b, gcd);
    }

    public static long gcd(long a, long b) {
        while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static long euclid_gcd_recursive(long a, long b) {
        return b != 0 ? euclid_gcd_recursive(b, a % b) : a;
    }

}


