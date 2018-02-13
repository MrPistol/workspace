import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int a = number % 10;
        int b = number / 10 % 10;
        int c = number / 100;
        System.out.println(a + b + c);
    }
}
