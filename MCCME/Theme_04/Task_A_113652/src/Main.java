import java.util.Scanner;

public class Main {
    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.print(answer(n));


    }

    public static String answer(int k) {
        String result = "";
        if (k == 3 || k == 2 || k == 5 || k == 8)
            result = "NO";
        else
            result = "YES";
        return result;
    }
}
