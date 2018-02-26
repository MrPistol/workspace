import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int binary = 0;
        int reverseBinary = 0;
        while (number != 0) {
            binary = number%2;
            String numberOfBinary =  String.valueOf(binary);


            number = number/2;
        }


    }
}
