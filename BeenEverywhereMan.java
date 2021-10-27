//https://open.kattis.com/problems/everywhere

import java.util.Scanner;

public class BeenEverywhereMan {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int cases = scanner.nextInt();
		int[] output = new int[cases];
		
		for(int i=0; i<cases;i++) {
			int trips = scanner.nextInt();
			String[] cities = new String[trips];
			for(int k=0; k<trips; k++) {
				cities[k] = scanner.next();
			}
			String uniqueCities = "";
			for(int m=0; m<trips; m++) {
				if(uniqueCities.contains(cities[m])){
					uniqueCities += "";
				}else {
					uniqueCities += cities[m] + " ";
				}
			}
			String[] finalCount = uniqueCities.split(" ");
			output[i] = finalCount.length;
		}
		for(int s=0; s<cases; s++) {
			System.out.println(output[s]);
		}
	}
}
