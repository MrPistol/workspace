import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b, c, r;
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        r=0;


        if (a >= b && a >= c) {
            r = a;
        } else if (b >= a && b >= c) {
            r = b;
        } else if (c >= b && c >= a) {
            r = c;
        }

        System.out.print(r);
    }
}
