import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите исходную координату ");
        int origin = scanner.nextInt();
        System.out.print("Введите первую точку ");
        int first = scanner.nextInt();
        System.out.print("Введите вторую точку ");
        int second = scanner.nextInt();

        int distance1 = abs(origin - first);
        int distance2 = abs(origin - second);

        int minDistance = distance1 < distance2 ? distance1 : distance2;

        if (distance1 < distance2) {
            System.out.println("Первая точка ближе второй. Дистанция равна " +
                    +minDistance);
        } else if (distance1 > distance2) {

            System.out.println("Вторая точка ближе первой. Дистанция равна " +
                    +minDistance);
        } else {
            System.out.print("Обе точки равноудалены. Дистанция равна " +
                    +minDistance);
        }

    }


    public static int abs(int x) {
        return x < 0 ? -x : x;
    }
}
