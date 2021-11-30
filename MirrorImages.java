//https://open.kattis.com/problems/mirror

import java.util.Scanner;
public class MirrorImages {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//take input for num of cases
		int cases = scanner.nextInt();
		
		//for number of cases
		for(int i=1; i<=cases; i++) {
			System.out.println("Test " + i);
			//take input for num of rows and columns
			int rows = scanner.nextInt();
			int columns = scanner.nextInt();
			String[] input = new String[rows];
			String[] splitInput = new String[columns];
			//reverse for loop to mirror image
			for(int j=rows-1; j>=0; j--) {
				input[j] = scanner.next();
			}
			for(int k=0; k<rows; k++) {
				splitInput = input[k].split("");
				for(int m=columns-1; m>=0; m--) {
					System.out.print(splitInput[m]);
				}
				System.out.println(" ");
			}

		}
		scanner.close()
	}
}
