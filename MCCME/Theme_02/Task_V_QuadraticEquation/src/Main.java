import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        double d = b * b - 4 * a * c;
        if (d >= 0) {
            double x1 = (-b + Math.sqrt(d))/(2*a);
            System.out.println(x1);

            if (d > 0) {
                double x2 = (-b - Math.sqrt(d))/(2*a);
                System.out.println(x2);


            }
        }
    }
}
