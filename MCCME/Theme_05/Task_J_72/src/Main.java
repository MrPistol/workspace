import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = initializeArray(n);

        int max = max(array);
        System.out.println(max);
    }

    public static int[] initializeArray(int n) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++)
            array[i] = scanner.nextInt();
        return array;
    }

    public static int max(int[] array) {

        int maximum = array[0];

        for (int i = 0; i < array.length; i++)
            if (maximum < array[i]) maximum = array[i];

        return maximum;
    }
}