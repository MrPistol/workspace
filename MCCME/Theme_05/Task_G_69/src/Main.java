import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] numbers = new int[n];


        for (int i = 0; i < n; ++i) {
            numbers[i] = scanner.nextInt();
        }

        for (int i = 0; i < n /2; i++)
        {
            int tmp = numbers[i];
            numbers[i] = numbers[n - i - 1];
            numbers[n - i - 1] = tmp;
        }
        for(int i = 0 ; i<n;++i)
            System.out.print(numbers[i]+" ");

    }
}
