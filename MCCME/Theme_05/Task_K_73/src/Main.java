import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[scanner.nextInt()];




        for (int i = 0; i < array.length; i++)
            array[i] = scanner.nextInt();


        int number = 1;

        for (int i = 0; i < array.length - 1; i++)
            if (array[i] < array[i + 1]) number++;

        System.out.println(number);
    }
}