import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите минимальное значение? ");
        int min = scanner.nextInt();
        System.out.print("Введите максимальное значение? ");
        int max = scanner.nextInt();
        Random random = new Random();
        int rand = min + random.nextInt(max - min);
        System.out.printf("Случайно число от %d до %d: %d", min, max, rand);

    }
}
