import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a, b, c, d, e;
        a = b = c = d = e = 0;


        e = n/60;

        int ost1 = n - n/60*60;
        int ost2 = ost1 - ost1/20*20;
        int ost3 = ost2 - ost2/10*10;

        if (n%60 > 35) {
            e += 1;

        } else {
            d = ost1/20;
            if (ost1%20 > 17) {
                d += 1;
            } else {
                c = ost2/10;
                if (ost2%10 > 8) {
                    c += 1;
                } else {
                    b = ost3/5;
                    if (ost3%5 > 4) {
                        b += 1;
                    } else {
                        a = ost3%5;
                    }
                }
            }
        }
        System.out.format("%d %d %d %d %d", a, b, c, d, e);

    }
}
