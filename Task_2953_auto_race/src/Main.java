import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int d = 0;
        d = (m / n) + (2- (2*n - (m%n))/n);
        System.out.println(d);
    }
}
