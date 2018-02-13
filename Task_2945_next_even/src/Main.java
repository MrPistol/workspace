import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int nextEvenNumber = number + (2 * ((number + 1) % 2)) + (number % 2);
        System.out.println(nextEvenNumber);
    }
}
