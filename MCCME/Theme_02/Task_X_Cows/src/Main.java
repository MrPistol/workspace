import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        char ok = ' ';

        if (n%10 == 1 && n != 11) {
            ok = 'a';

        } else if (n%10 == 2 && n != 12 || n%10 == 3 && n != 13 || n%10 == 4 && n != 14) {
            ok = 'y';
        }

        System.out.println(n + " korov" + ok);
    }
}
