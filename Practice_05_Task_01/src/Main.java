import java.util.Scanner;

public class Main {
    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        System.out.print(abs(a,b,c));
    }

    public static int abs(int a, int b, int c) {

        if (Math.abs(a - b) > Math.abs(a - c)) {
            int sec = Math.abs(a - c);
            System.out.print("Вторая точка ближе первой. Дистанция равна ");
            return sec;
        } else {
            int sec = Math.abs(a - b);
            System.out.print("Первая точка ближе второй. Дистанция равна ");
            return sec;
        }

    }
}
