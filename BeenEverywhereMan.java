//https://open.kattis.com/problems/everywhere

import java.util.Scanner;

public class BeenEverywhereMan {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//number of cases, create an array with that length for output
		int cases = scanner.nextInt();
		int[] output = new int[cases];
		
		//for number of cases, input trips taken per case to cities
		for(int i=0; i<cases;i++) {
			int trips = scanner.nextInt();
			String[] cities = new String[trips];
			for(int k=0; k<trips; k++) {
				cities[k] = scanner.next();
			}
			//empty string to add unique cities if they are not already present in the string
			String uniqueCities = "";
			for(int m=0; m<trips; m++) {
				if(uniqueCities.contains(cities[m])){
					uniqueCities += "";
				}else {
					uniqueCities += cities[m] + " ";
				}
			}
			//split unique cities string by spaces into an array and input into our output array the length of each split array
			String[] finalCount = uniqueCities.split(" ");
			output[i] = finalCount.length;
		}
		//print number of unique cities per case on each new line
		for(int s=0; s<cases; s++) {
			System.out.println(output[s]);
		}
	}
}
