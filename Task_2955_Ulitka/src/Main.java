import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int otr = h - a;
        int raz = a - b;
        double ost = (double) (otr % raz)/raz;
        int dol = (int) Math.ceil(ost);
        int r = 1 + otr / raz + dol;
        System.out.println(r);
    }
}
