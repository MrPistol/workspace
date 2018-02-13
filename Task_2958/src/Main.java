import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int n = (int) Math.ceil((double) b / a);
        int m = b / a;

        int c = a * n + b * m;
        System.out.println(c + " " + n + " " + m);

    }
}
