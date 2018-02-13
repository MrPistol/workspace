import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)throws Exception{
        FileReader reader = new FileReader("input.txt");
        Scanner scanner = new Scanner(reader);
        FileWriter writer = new FileWriter("output.txt");
        int n = Integer.parseInt(scanner.nextLine());
        int k = Integer.parseInt(scanner.nextLine());
        int r = k%n;
        writer.write(String.valueOf(r));
        reader.close();
        writer.close();
    }
}
