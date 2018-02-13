import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner("input.txt");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(Math.sqrt(a * a + b * b));

    }
}
