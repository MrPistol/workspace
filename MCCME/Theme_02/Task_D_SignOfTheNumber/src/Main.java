import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int sign = 0;

        if (x > 0) {
            x = 1;
        } else if (x < 0) {
            x = -1;
        }

        System.out.print(x);
    }
}
