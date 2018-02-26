import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        int numbers = scanner.nextInt();
        String answer = "NO";

        for (int i = 0; i < numbers; ++i) {
            int number = scanner.nextInt();
            if (number == 0) {
                answer = "YES";
                System.out.print(answer);
                System.exit(0);
            }
        }

        System.out.print(answer);


    }
}