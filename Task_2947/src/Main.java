import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n < 24 * 60) {
            int h = n / 60;
            int m = n % 60;

            System.out.println(h + " " + m);
        } else {
            n = n % (24 * 60);
            int h = n / 60;
            int m = n % 60;

            System.out.println(h + " " + m);
        }
    }
}
