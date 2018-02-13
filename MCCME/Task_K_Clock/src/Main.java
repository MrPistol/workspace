import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int hours, minutes;
        minutes = number % 60;
        hours = (number / 60) % 24;
        System.out.println(hours + " " + minutes);
    }
}

