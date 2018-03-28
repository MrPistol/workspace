import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] numbers = new int[n];
        String answer = "NO";

        for (int i = 0; i < n; ++i) {
            numbers[i] = scanner.nextInt();
        }

        for (int i = 1; i < n - 1; ++i) {
            if (numbers[i - 1] > 0 && numbers[i]     > 0 ||
                numbers[i]     > 0 && numbers[i + 1] > 0 ||
                numbers[i - 1] < 0 && numbers[i]     < 0 ||
                numbers[i]     < 0 && numbers[i + 1] < 0)
                answer = "YES";


        }

        System.out.print(answer);

    }
}
