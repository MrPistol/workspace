import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] numbers = new int[n];
        int count = 0;

        for (int i = 0; i < n; ++i) {
            numbers[i] = scanner.nextInt();
        }

        for (int i = 1; i < n; ++i) {
            if(numbers[i-1]<numbers[i])
                ++count;


        }

        System.out.print(count);

    }
}
