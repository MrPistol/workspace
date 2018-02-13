import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b, c, d, e, f;
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        d = scanner.nextInt();
        e = 0;
        f = 0;

        if (d >= b && c >= a) {
            f = d - b;
            e = c - a;
        } else if (d < b && c >= a) {
            f = 100 + d - b;
            e = c - 1 - a;
        }
        System.out.println(e + " " + f);
    }
}

