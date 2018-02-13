import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int aa = scanner.nextInt();
        int bb = scanner.nextInt();
        int cc = scanner.nextInt();

        int dif = (aa * 3600 + bb * 60 + cc) - (a * 3600 + b * 60 + c);
        System.out.println(dif);

    }
}
