import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int kolvoUrokov = scanner.nextInt();
        int dlitUroka = 45;
        int timeInMin = 540 + kolvoUrokov * dlitUroka + (kolvoUrokov / 2 * 5) + ((kolvoUrokov - 1) / 2 * 15);
        int h = timeInMin / 60;
        int m = timeInMin % 60;
        System.out.println(h + " " + m);


    }
}
 