import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int v = scanner.nextInt();
        int t = scanner.nextInt();
        int l = 109;

        int s = (l + v*t%l)%l;
        System.out.println(s);

    }
}
