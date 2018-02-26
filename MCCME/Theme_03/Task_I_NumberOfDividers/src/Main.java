import java.util.Scanner;

public class Main {
    public static void main(String argsp[]) {
        Scanner scanner = new Scanner(System.in);

        long x = scanner.nextLong();
        long divider = 1;
        int numbers = 0;


        while (divider <= x && x <= 2*10e9) {
            if (x%divider == 0) {
                ++numbers;
            }
            ++divider;
        }
        System.out.print(numbers);

    }
}
