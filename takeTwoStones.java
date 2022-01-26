import java.util.Scanner;
public class takeTwoStones {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double number = scanner.nextDouble();
		if ((number%2) == 0) {
			System.out.println("Bob");
		} else {
			System.out.println("Alice");
		}

	}

}
