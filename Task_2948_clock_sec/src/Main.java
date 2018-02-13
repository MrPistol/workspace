import java.io.FileReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String sec, min;

        int s = n % 60;
        if (s < 10) {
            sec = "0" + s;

        } else {
            sec = String.valueOf(s);
        }

        int m = n / 60;
        if (m < 60) {
            if (m < 10) {
                min = "0" + m;

            } else {
                min = String.valueOf(m);
            }
        } else {
            if (m % 60 < 10) {
                min = "0" + m % 60;
            } else {
                min = String.valueOf(m % 60);
            }
        }

        int h = n / (60 * 60);
        if (h < 24) {
            h = h;
        } else {
            h = h % 24;
        }

        System.out.println(h + ":" + min + ":" + sec);
    }
}

