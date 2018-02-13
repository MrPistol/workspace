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

        if (xA == xB || yA==yB || Math.abs(xA - xB) == Math.abs(yA - yB)){
            answer = "YES";
        }
        System.out.print(answer);
    }
}
