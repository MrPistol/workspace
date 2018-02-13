import java.io.FileReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int t = 45;
        int timeInMin = 540 + n * t + (n / 2 * 5) + ((n - 1) / 2 * 15);
        int h = timeInMin / 60;
        int m = timeInMin % 60;
        System.out.println(h + " " + m);


    }
}
