import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.printf("The next number for the number %d is %d.\n" +
                "The previous number for the number %d is %d." , number, (number+1),number, (number-1));
    }
}
