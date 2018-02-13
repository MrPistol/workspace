import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите четырёхзначное число? ");
        int i = scanner.nextInt();
        int a, b, c, d, s;
        a = i / 1000;
        b = i / 100 % 10;
        c = i / 10 % 10;
        d = i % 10;
        s = a + b + c + d;
        System.out.printf("Сумма всех цифр числа %d равна %d%n", i, s);
    }
}
