import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int numberOfZeroes = 0;

        while (number > 0) {
            int ost = number%10;
            if (ost == 0)
                ++numberOfZeroes;
            number = number/10;
        }
        System.out.print(numberOfZeroes);

    }
}
