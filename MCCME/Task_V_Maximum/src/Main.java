import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int diff = a - b;
        int abs = diff * ((2 * diff - 1) % 2);

        int max = (a + b + abs) / 2;
        System.out.print(max);

    }
}