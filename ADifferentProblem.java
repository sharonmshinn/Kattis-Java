//Each line of the input consists of a pair of integers. Each integer is between 0 and 1015 (inclusive). The input is terminated by end of file.
//For each pair of integers in the input, output one line, containing the absolute value of their difference.

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
