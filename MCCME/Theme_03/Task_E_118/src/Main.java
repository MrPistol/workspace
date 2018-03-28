import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();


        System.out.println(reverse(number));


    }

    public static int reverse(int n) {

        String number = "";
        while (n != 0) {
            number += n%10;
            n /= 10;
        }

        return Integer.parseInt(number);
    }
}
