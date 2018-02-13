import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k, m, n, r;
        k = scanner.nextInt();
        m = scanner.nextInt();
        n = scanner.nextInt();
        r = 0;

        if (n <= k) {
            r = 2*m;
        } else {
            r = m*(2*n/k + (1 - (k - 2*n%k)/k));
        }

        System.out.println(r);

    }
}
