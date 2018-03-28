import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String number = scanner.next();

        System.out.println(max(number));

    }

    public static long max(long n) {
        long m = 0;
        while (n > 0) {
            if (m < n % 10)
                m = n % 10;
            n /= 10;
        }
        return m;
    }
}
