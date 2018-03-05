import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final int MIN = -99;
        final int MAX = 99;

        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        int correctAnswer = 0;
        int wrongAnswer = 0;

        for (int i = 0; i < number; ++i) {
            int randA = (int) (MIN + Math.random()*(MAX - MIN + 1));
            int randB = (int) (MIN + Math.random()*(MAX - MIN + 1));
            System.out.format("%d + %d = ", randA, randB);
            if (scanner.nextInt() == randA + randB) {
                ++correctAnswer;
            } else {
                ++wrongAnswer;
            }
        }
        System.out.format("Количество правильных ответов:%d%n" +
                "Количество неправильных ответов: %d", correctAnswer, wrongAnswer);
    }
}
