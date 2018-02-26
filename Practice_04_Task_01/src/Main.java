import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number;
        int count = 0;
        int sum = 0;


        while ((number = scanner.nextInt()) != 0) {
            sum += number;
            ++count;

        }

        if (count != 0)

            System.out.format("Среднее арифметическое %.2f", sum/(double) count);

        else
            System.out.println("Нет данных для расчёта");

    }
}
