import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int a = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int b = scanner.nextInt();

        if (a > b) {
            System.out.format("Первое число %d больше второго числа %d.%n", a, b);
        } else if (a < b) {
            System.out.format("Второе число %d больше первого числа %d.%n", b, a);


        } else {
            System.out.format("Первое число %d  равно второму числу %d.%n", b, a);


        }


    }
}
