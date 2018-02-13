import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int des = number % 100;
        int tis = number / 100;
        int a = des / 10;
        int b = des%10;
        int sed = b*10 +a;
        int result = 1 + sed-tis;
        System.out.print(result);
    }
}
