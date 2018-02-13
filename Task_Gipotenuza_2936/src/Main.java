import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        FileReader reader = new FileReader("input.txt");
        Scanner scan = new Scanner(reader);

        FileWriter writer = new FileWriter("output.txt");
        int a = Integer.parseInt(scan.nextLine());
        int b = Integer.parseInt(scan.nextLine());
        double c = Math.sqrt(a*a + b*b);

        writer.write(String.valueOf(c));
        writer.close();

    }
}