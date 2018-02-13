import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);
        double z = 0.0;
        double sum = z + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1;
        if (Math.abs(sum - 1.0)<0.00001) {
        System.out.printf("%f%n",sum);
        System.out.print(sum);
        } else {
            System.out.printf("Не равны %f  %n", sum );
            System.out.print("Не равны " + sum);
        }
    }
}
