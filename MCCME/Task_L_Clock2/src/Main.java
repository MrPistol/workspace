import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numbers, hours, minutes, seconds;
        numbers = scanner.nextInt();
        hours = (numbers / 3600) % 24;
        minutes = (numbers / 60) % 60;
        seconds = numbers % 60;
        System.out.printf("%d:%02d:%02d", hours, minutes, seconds);

    }
}
 