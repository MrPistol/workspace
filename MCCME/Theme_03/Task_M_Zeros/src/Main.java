import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        int numbers = scanner.nextInt();
        int numbersOfZeros = 0;

        for(int i = 0; i<numbers;++i){
            int zero = scanner.nextInt();
            if(zero==0){
                ++numbersOfZeros;
            }

        }

        System.out.print(numbersOfZeros);
    }
}
