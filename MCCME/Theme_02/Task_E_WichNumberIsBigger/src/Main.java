import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int r = 0;

        if (a > b) {
            r = 1;
        } else if (a < b) {
            r = 2;
        }
        System.out.print(r);
    }
}
