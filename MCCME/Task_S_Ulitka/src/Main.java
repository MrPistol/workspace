import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h, a, b, days;
        h = scanner.nextInt();
        a = scanner.nextInt();
        b = scanner.nextInt();
        int step = a-b;
        int realH = h-a;
        days = 1 + realH/step + (1 - (step - ( realH%step ))/step );
        System.out.print(days);

    }
}
