import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final int PRICE_1 = 15;
        final int PRICE_5 = 70;
        final int PRICE_10 = 125;
        final int PRICE_20 = 230;
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a, b, c, d, e;
        a = b = c = d = e = 0;


        e = n / 60;

        int ost1 = n % 60;
        int ost2 = ost1 % 20;
        int ost3 = ost2 % 10;

        if (n % 60 > 35) {
            ++e;

        } else {
            d = ost1 / 20;
            if (ost1 % 20 > 17) {
                ++d;
            } else {
                c = ost2 / 10;
                if (ost2 % 10 > 8) {
                    ++c;
                } else {
                    b = ost3 / 5;
                    if (ost3 % 5 > 4) {
                        ++b;
                    } else {
                        a = ost3 % 5;
                    }
                }
            }
        }
        System.out.format("%d %d %d %d %d", a, b, c, d, e);

    }
}
