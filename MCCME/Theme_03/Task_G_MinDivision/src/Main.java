import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        int divison = 2;

        while (divison <= 30000) {
            if (x%divison == 0) {
                System.out.print(divison);
                System.exit(0);
            }

            ++divison;

        }


    }
}
