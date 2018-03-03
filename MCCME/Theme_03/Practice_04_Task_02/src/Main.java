import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        int number = scanner.nextInt();
        int sum = 0;
        while (number > 0) {
            sum += number%10;
            number = number/10;
        }
        System.out.print("Сумма всех его цифр равна " + sum);
    }
}
