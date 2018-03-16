import java.util.Scanner;

public class Main {
    public static void main(String argsp[]) {
        Scanner scanner = new Scanner(System.in);

        long x = scanner.nextLong();

        int numbers = 0;


        for (long divider = 1, end = (int) Math.sqrt(x); divider <= end; ++divider) {
            if (x%divider == 0) {
                if (x/divider == divider)
                    ++numbers;
                else
                    numbers += 2;
            }

        }
        System.out.print(numbers);

    }
}
