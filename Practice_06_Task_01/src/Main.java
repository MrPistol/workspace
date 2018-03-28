import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("N: ");
        int n = scanner.nextInt();
        int[] counters = new int[11];

        for (int i = 0; i < n; ++i) {
            int firstDice = random(1, 6);
            int secondDice = random(1, 6);
            int sum = firstDice + secondDice;
            ++counters[sum - 2];
        }

        for (int i = 0; i < counters.length; ++i) {
            System.out.format("%d: %d%n", i + 2, counters[i]);
        }

    }

    private static int random(int min, int max) {
        return (int) (min + Math.random()*(max - min + 1));
    }
}
