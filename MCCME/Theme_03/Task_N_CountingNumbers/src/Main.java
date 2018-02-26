import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int numbers = scanner.nextInt();
        int numbersZeros = 0;
        int numbersPositive = 0;
        int numbersNegative = 0;

        for (int i = 0; i < numbers; ++i) {
            int number = scanner.nextInt();
            if (number == 0) {
                ++numbersZeros;
            } else if (number > 0) {
                ++numbersPositive;
            } else ++numbersNegative;

        }

        System.out.format("%d %d %d", numbersZeros, numbersPositive, numbersNegative);
    }
}