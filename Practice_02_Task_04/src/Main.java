import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final double INCH_IN_SM = 2.54;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите значение в дюймах? ");
        int inch = scanner.nextInt();
        double sm = inch * INCH_IN_SM;
        System.out.printf("%d дюйм. = %.2f см.", inch, sm);


    }
}
