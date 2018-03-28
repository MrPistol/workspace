import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] array = new int[scanner.nextInt()];
        for (int i = 0; i < array.length; i++)
            array[i] = scanner.nextInt();
        int petya = scanner.nextInt();

        if (petya < array[array.length - 1]) {
            System.out.println(array.length + 1);
        } else {
            for (int i = 0; i < array.length; i++)

                if (petya > array[i]) {
                    System.out.println(i + 1);
                    break;
                }
        }

    }
}