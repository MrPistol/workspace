import java.util.Scanner;

public class Mian {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите температуру в градусах Фаренгейта? ");
        double f = scanner.nextDouble();
        double c = (f - 32) * 5 / 9;
        System.out.printf("Температура в градусах Цельсия: %.2f", c);

    }
}
