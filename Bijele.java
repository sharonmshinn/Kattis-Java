//https://open.kattis.com/problems/bijele

import java.util.Scanner;

public class Bijele {
	public static void main(String[] args) {
		
		//first array represents what chess pieces should be present
		int[] validSet = new int[] {1,1,2,2,2,8};
		//second array represents what we actually have for our chess pieces
		int[] compareSet = new int[6];
		//third array is our output of how many pieces to add, minus, or keep the same
		int[] piecesToFix = new int[6];
		
		Scanner scanner = new Scanner(System.in);
		
		//for each iteration, we will minus our validSet with what we actually have (compareSet) and put the result in our piecesToFix
		//then we will print the results with a space in between each result
		for(int i=0;i<6;i++) {
			compareSet[i] = scanner.nextInt();
			piecesToFix[i] = validSet[i] - compareSet[i];
			System.out.print(piecesToFix[i] + " ");
		}
		scanner.close();
	}
}
