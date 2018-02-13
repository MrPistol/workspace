import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a, b;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Первое значение? ");
        a = scanner.nextInt();
        System.out.print("Второе значение? ");
        b = scanner.nextInt();
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.printf("До перестановки: a = %d; b = %d;%n", a, b);
        System.out.printf("После перестановки: a = %d; b = %d;%n", a, b);


        // TODO: произвести перестанову переменных
    }
}
