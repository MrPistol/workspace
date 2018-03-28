import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[] numbers = new int[n];

        for (int j = 0; j < n; ++j) {
            numbers[j] = scanner.nextInt();
        }

        for (int i = 0; i < (n+1)/2; ++i) {
            System.out.printf("%d ", numbers[i*2]);
        }

    }
}
