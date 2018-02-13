import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();

        if ((k%3 == 0 || k%5 == 0 || k%3%5 == 0 || k%5%3 == 0 || k%(5 + 3)%3 == 0 || k%(5 + 3)%5 == 0) && k > 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
