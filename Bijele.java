//https://open.kattis.com/problems/bijele

import java.util.Scanner;

public class Bijele {
	public static void main(String[] args) {
		
		int[] validSet = new int[] {1,1,2,2,2,8};
		int[] compareSet = new int[6];
		int[] piecesToFix = new int[6];
		
		Scanner scanner = new Scanner(System.in);
		
		for(int i=0;i<6;i++) {
			compareSet[i] = scanner.nextInt();
			piecesToFix[i] = validSet[i] - compareSet[i];
			System.out.print(piecesToFix[i] + " ");
		}
	}
}
