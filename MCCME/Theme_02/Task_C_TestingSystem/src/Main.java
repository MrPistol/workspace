import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        final int C = 1;

        if (a == C && b == C || a != C && b != C) {
            System.out.print("YES");
        } else {
            System.out.print("NO");
        }
    }
}
