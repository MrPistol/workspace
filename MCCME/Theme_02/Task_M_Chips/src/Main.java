import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        String answer = "NO";
        if ((k + 4)%4 == 0 || k == 1) {
            answer = "YES";
        }

        System.out.print(answer);
    }
}
