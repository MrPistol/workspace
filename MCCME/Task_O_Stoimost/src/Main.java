import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int n = scanner.nextInt();
        int sum = a * 100 * n + b * n;
        System.out.println(sum / 100 + " " + sum % 100);
    }
}