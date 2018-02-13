import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hoursA = scanner.nextInt();
        int minutesA = scanner.nextInt();
        int secondsA = scanner.nextInt();
        int hoursB = scanner.nextInt();
        int minutesB = scanner.nextInt();
        int secondsB = scanner.nextInt();

        int difference = (hoursB * 3600 + minutesB * 60 + secondsB) - (hoursA * 3600 + minutesA * 60 + secondsA);
        System.out.println(difference);

    }
}
 