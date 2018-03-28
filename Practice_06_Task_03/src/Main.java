import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.format("N: ");
        int n = scanner.nextInt();
        int[] numbers = new int[n];

        for (int i = 0; i < n; ++i) {
            System.out.format("Введите элемент %d: ", i);
            numbers[i] = scanner.nextInt();
        }

        System.out.print("До:    ");
        printNumbers(numbers);

        reverse(numbers);

        System.out.print("После: ");
        printNumbers(numbers);

    }

    public static void reverse(int[] numbers) {
        for (int i = 0, j = numbers.length - 1; i < j; ++i, --j) {
            int temp = numbers[i];
            numbers[i] = numbers[j];
            numbers[j] = temp;
        }

    }

    public static void printNumbers(int[] numbers) {
        for (int i = 0; i < numbers.length; ++i) {
            System.out.format("%d ", numbers[i]);
        }
        System.out.println();

    }
}
