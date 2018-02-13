import java.util.Scanner;

public class Mian {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = a;
        int d = b;
        b = c;
        a = d;
        System.out.println(a + " " + b);


    }
}

