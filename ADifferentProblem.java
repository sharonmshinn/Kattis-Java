//https://open.kattis.com/problems/different

import java.util.Scanner; 

public class aDifferentProblem {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			long firstNum = scanner.nextLong();
			long secondNum = scanner.nextLong();
			long difference = Math.abs(firstNum - secondNum);
			System.out.println(difference);
		}
  }
}
