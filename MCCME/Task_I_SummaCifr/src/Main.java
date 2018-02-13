import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int edinici = number%10;
        int desyatki = number/10%10;
        int sotni = number/100;
        int summa = edinici + desyatki + sotni;
        System.out.print(summa);
    }
}
