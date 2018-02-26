import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        final int PRICE_1 = 15;
        final int PRICE_10 = 125;
        final int PRICE_60 = 440;

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int a, b, c;
        a = b = c = 0;

        int sum1 = 0;
        int kolvo1 = 0;

        do {
            ++kolvo1;
            sum1 = kolvo1 * PRICE_1;

        } while (sum1 < PRICE_10);

        --kolvo1;


        c = n / 60;
        int ost1 = n % 60;

        if (n % 60 > 34) {
            c++;
        } else {
            b = ost1 / 10;
            if (ost1 % 10 > kolvo1)
                b++;
            else a = ost1 % 10;
        }


        System.out.format("%d %d %d", a, b, c);


    }
}
