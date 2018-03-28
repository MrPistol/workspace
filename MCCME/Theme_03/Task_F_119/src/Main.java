import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();


        System.out.println(countPalindromov(number));


    }

    public static int countPalindromov(int n) {
        int count = 0;
        for (int i = 1; i <= n; ++i) {
            String number = "";
            int k = i;
            while (k != 0) {
                number += k%10;
                k /= 10;
            }
            if (Integer.parseInt(number) == i) {
                ++count;
            }
        }
        return count;
    }

}
