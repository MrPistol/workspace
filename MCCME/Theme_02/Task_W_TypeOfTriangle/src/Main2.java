import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int x = a*a;
        int y = b*b;
        int z = c*c;


        String answer = "";

        if (a + b > c || b + c > a || c + a > b) {

            if (x == y + z || y == z + x || z == x + y)
                answer = "right";
            else if (x > y + z || y > x + z || z > x + y)
                answer = "obtuse";
            else
                answer = "acute";


        } else
            answer = "impossible";

        System.out.println(answer);
    }
}
