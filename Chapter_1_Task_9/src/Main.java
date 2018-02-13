import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your weight: ");
        double w = scanner.nextDouble();
        w = w * 0.17;
        System.out.println(w);
        scanner.close();
  }
}

