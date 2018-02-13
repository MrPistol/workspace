import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите вещественное число: ");
        double n = scanner.nextDouble();
        double abs = n;
        if (abs < 0) {
           abs *= -1;
        }

        System.out.printf("|%.3f| = %.3f%n", n, abs);
    }
}
