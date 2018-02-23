import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        String answer = "";


/*
        if (number == 1 || number == 2 || number == 12)
            answer = "Зима";
        else if (number == 3 || number == 4 || number == 5)
            answer = "Весна";
        else if (number == 6 || number == 7 || number == 8)
            answer = "Лето";
        else if (number == 9 || number == 10 || number == 11)
            answer = "Осень";
        else
            answer = "Введите число от 1 до 12";
*/


        switch (number) {
            case 12:
            case 1:
            case 2:
                answer = "Зима";
                break;
            case 3:
            case 4:
            case 5:
                answer = "Весна";
                break;
            case 6:
            case 7:
            case 8:
                answer = "Лето";
                break;
            case 9:
            case 10:
            case 11:
                answer = "Осень";
                break;
            default:
                answer = "Введите число от 1 до 12";
        }

        System.out.print(answer);


    }
}
