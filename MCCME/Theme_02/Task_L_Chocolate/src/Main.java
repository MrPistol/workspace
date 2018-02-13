import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, m, k;
        String answer = "NO";
        n = scanner.nextInt();
        m = scanner.nextInt();
        k = scanner.nextInt();

        if (k%n == 0 && k < n*m || k%m == 0 && k < n*m) {
            answer = "YES";
        }
        System.out.print(answer);
    }
}
