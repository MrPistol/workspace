import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        char ch = ' ';

        if (n >= 0 && n < 60)
            System.out.println("Оценка: F");
        else if (n >= 60 && n < 70)
            System.out.println("Оценка: D");
        else if (n >= 70 && n < 80)
            System.out.println("Оценка: C");
        else if (n >= 80 && n < 90)
            System.out.println("Оценка: B");
        else if (n >= 90 && n <= 100)
            System.out.println("Оценка: A");
        else
            System.out.println("Введите число от 0 до 100");


    }
}
