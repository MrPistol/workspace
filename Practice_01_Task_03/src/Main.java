import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner( System.in );
		System.out.print( "Как вас зовут? " );
		String input = scanner.nextLine();
		
		System.out.println( "Привет, " + input );
		scanner.close(); 

	}

}
