import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        int dividers = 1;
        while (dividers <= x) {
            if (x%dividers == 0){
                System.out.print(dividers + " ");
            }
            ++dividers;
        }
    }
}
