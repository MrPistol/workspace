import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("A = ");
        long a = scanner.nextInt();
        System.out.print("B = ");
        long b = scanner.nextInt();

        long gcd = gcd(a, b);
        System.out.format("НОД(%d, %d) = %d", a, b, gcd);
    }

    public static long gcd(long a, long b) {

        long i = Math.min(a, b);
        for (; i > 0; --i) {
            if (a%i == 0 && b%i == 0) {
                break;
            }
        }
        return i;
    }

}
