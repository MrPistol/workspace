import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        FileReader reader = new FileReader("input.txt");
        Scanner scanner = new Scanner(reader);
        FileWriter writer = new FileWriter("output.txt");

        int v = Integer.parseInt(scanner.nextLine());
        int t = Integer.parseInt(scanner.nextLine());
        int l = 109;
        int r;
        if (Math.abs(v * t) == l || Math.abs(v * t) % l == 0) {
            r = 0;
        } else {
            if (v > 0) {
                if (v * t > l) {
                    r = (v * t) % l;
                } else {
                    r = v * t;
                }
            } else {
                if (Math.abs(v * t) > l) {
                    r = ((v * t) % l) + l;
                } else {
                    r = l + v * t;
                }
            }
        }


        writer.write(String.valueOf(r));
//        System.out.print(r);
        writer.close();
        reader.close();


    }
}
