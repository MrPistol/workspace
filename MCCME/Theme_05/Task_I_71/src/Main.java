import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] numbers = new int[n];


        for (int i = 0; i < n; ++i) {
            numbers[i] = scanner.nextInt();
        }

        int last = numbers[n];
        int first = numbers[0];
        int next = 0;
        for (int i = 1; i < n - 1; i++) {
            next = numbers[i + 1];
            numbers[i] = numbers[i-1];

        }
        for (int i = 0; i < n; ++i)
            System.out.print(numbers[i] + " ");

    }
}
