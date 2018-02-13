import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, h, m, s;
        n = scanner.nextInt();
        h = (n / 3600) % 24;
        m = (n / 60) % 60;
        s = n % 60;
        System.out.printf("%d:%02d:%02d", h, m, s);

    }
}
