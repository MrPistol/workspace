import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();


        while (a <= b) {
            if ((int) Math.sqrt(a)*(int) Math.sqrt(a) == a) {
                System.out.print(a + " ");

            }
            ++a;

        }
    }

}
