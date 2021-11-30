import java.util.Scanner;
public class licenseToLaunch {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int daysOfLicense = scanner.nextInt();
		int[] spaceJunk = new int[daysOfLicense];
		
		for (int i=0; i<daysOfLicense; i++) {
			int spaceJunkAmount = scanner.nextInt();
			spaceJunk[i] = spaceJunkAmount;
		}
		
		int lowestSoFar = spaceJunk[0];
		int dayToLaunch = 0;
		
		for (int i=0; i<daysOfLicense; i++){
			if (spaceJunk[i] < lowestSoFar) {
				lowestSoFar = spaceJunk[i];
				dayToLaunch = i;
			}
		}
		
		System.out.println(dayToLaunch);
		
	}
}