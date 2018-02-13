import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int h, m;
        m = n % 60;
        h = (n / 60) % 24;
        System.out.println(h + " " + m);
    }
}
