import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] numbers = new int[n];
        int answer = 0;

        for (int i = 0; i < n; ++i) {
            numbers[i] = scanner.nextInt();
        }

        for (int i = 1; i < n - 1; ++i) {
            if (numbers[i - 1] < numbers[i] && numbers[i] > numbers[i + 1])
                ++answer;


        }

        System.out.print(answer);

    }
}
