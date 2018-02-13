import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int v = scanner.nextInt();
        int t = scanner.nextInt();
        int dlinaDorogi = 109;
        int s = (dlinaDorogi + v*t%dlinaDorogi)%dlinaDorogi;
        System.out.print(s);
    }
}
