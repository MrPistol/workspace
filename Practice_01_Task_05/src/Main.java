import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите значение стороны a: ");
        int a = scanner.nextInt(); // Scans the next token of the input as an int.
        System.out.print("Введите значение стороны b: ");
        int b = scanner.nextInt(); // Scans the next token of the input as an int.
        System.out.print("Введите значение стороны c: ");
        int c = scanner.nextInt(); // Scans the next token of the input as an int.
        int v = a * b * c;
        System.out.printf("Объем параллелепипеда (%d x %d x %d) равен %d", a, b, c, v);
        scanner.close();

    }

}
