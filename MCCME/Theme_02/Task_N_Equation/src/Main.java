import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (a == 0 && b == 0) {
            System.out.println("INF");

        } else if (a == 0 || b == 0 || b%a != 0) {
            System.out.println("NO");

        } else if (b%a == 0) {
            System.out.println(-b/a);

        }
    }
}
