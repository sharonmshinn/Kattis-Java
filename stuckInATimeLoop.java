import java.util.Scanner;

public class stuckInATimeLoop {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int loopNum = scanner.nextInt();
		int count = 1;
		while (loopNum > 0) {
			System.out.println(count + " Abracadabra");
			loopNum -= 1;
			count += 1;
		}

	}

}
