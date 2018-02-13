import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner( System.in );
		System.out.print("¬ведите первое число: ");
		int n1 = scanner.nextInt(); // Scans the next token of the input as an int.
		System.out.print("¬ведите второе число: ");
		int n2 = scanner.nextInt(); // Scans the next token of the input as an int.
//		int sum = n1 + n2;
		System.out.println(n1 + " + " + n2 + " = " + (n1+n2));
		scanner.close(); 
		

	}

}
