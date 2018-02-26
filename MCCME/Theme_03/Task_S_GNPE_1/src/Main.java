import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int numbers = scanner.nextInt();

        int count = 1;
        for (int i = 1; i <= numbers; ++i) {
            for (int k = 1; k <= i && count <=numbers; ++k) {
                int x = i;
                System.out.print(x + " ");
                ++count;
            }
        }
    }
}
