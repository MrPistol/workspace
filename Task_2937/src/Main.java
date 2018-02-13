import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        FileReader reader = new FileReader("input.txt");
        Scanner scan = new Scanner(reader);
        int i = 1;
        while (scan.hasNextLine()) {

            FileWriter writer = new FileWriter("output.txt");
            int s = Integer.parseInt(scan.nextLine());
            writer.write("The next number for the number " + String.valueOf(s) + " is " + (s+1)+".\nThe previous number for the number " + String.valueOf(s) +" is " + (s-1)+".");
            writer.close();
        }
    }
}