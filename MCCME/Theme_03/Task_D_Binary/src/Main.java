import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int deNumber = scanner.nextInt();


        String reverse = new StringBuffer(binar(deNumber)).reverse().toString();
        System.out.println(binar(deNumber));


    }

    public static String binar(int a) {
        int b;
        String stroke = "";
        while (a != 0) {
            b = a % 2;
            stroke += String.format("%d", b);
            a = a / 2;
        }
        return stroke;
    }
}
