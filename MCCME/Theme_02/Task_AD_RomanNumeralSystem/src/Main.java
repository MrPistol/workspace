import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int tens = n / 10;
        int ones = n % 10;

        String result ="";


        switch (tens){
            case 1: result +="X";       break;
            case 2: result +="XX";      break;
            case 3: result +="XXX";     break;
            case 4: result +="XL";      break;
            case 5: result +="L";       break;
            case 6: result +="LX";      break;
            case 7: result +="LXX";     break;
            case 8: result +="LXXX";    break;
            case 9: result +="XC";      break;
            case 10: result +="C";      break;

        }


        switch (ones){
            case 1: result +="I";       break;
            case 2: result +="II";      break;
            case 3: result +="III";     break;
            case 4: result +="IV";      break;
            case 5: result +="V";       break;
            case 6: result +="VI";      break;
            case 7: result +="VII";     break;
            case 8: result +="VIII";    break;
            case 9: result +="IX";      break;

        }

        System.out.println(result);

    }
}
