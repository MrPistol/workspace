import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int temp = n;
        int digits = 0;
        int result = 0;

        do {
            temp /= 10;
            ++digits;
        }
        while (temp > 0);

        int m = 1;
        for (int i = 0; i < digits-1; ++i)
            m *= 10;

        temp = n;
        do {


            result += temp%10*m;
            m/=10;
            temp/=10;

        } while (temp > 0);

        System.out.print(result);
    }
}
