import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        int min = 9;
        int max = 0;

        while (number > 0) {
            int digit = number%10;
            if (digit > max) {
                max = digit;
            }
            if (digit < min) {
                min = digit;
            }
            number /= 10;
        }
        System.out.print(min + " " + max);

    }
}
