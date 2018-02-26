import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int xA, yA, xB, yB;
        String answer = "NO";
        xA = scanner.nextInt();
        yA = scanner.nextInt();
        xB = scanner.nextInt();
        yB = scanner.nextInt();

        if (
                Math.abs(xA - xB) == 2 && Math.abs(yA - yB) == 1 ||
                Math.abs(xA - xB) == 1 && Math.abs(yA - yB) == 2
                ){
            answer = "YES";
        }
        System.out.print(answer);
    }
}
