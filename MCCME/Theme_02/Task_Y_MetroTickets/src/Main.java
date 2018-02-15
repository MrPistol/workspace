import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int x, y, z, a, b, c, px, py, pz;

        x = 1;
        y = 10;
        z = 60;
        px = 15;
        py = 125;
        pz = 440;
        a = b = c = 0;

        int sum = 0;
        int k = 0;


        a = b = c = 0;

        c = n/60;
        int ost1 = n - n/60*60;

        if (n%60 > 34) {
            c += 1;
        } else {
            b = ost1/10;
            if (ost1%10 > 8)
                b += 1;
            else a = ost1%10;
        }


        System.out.format("%d %d %d", a, b, c);


    }
}
