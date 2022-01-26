import java.util.Scanner;
public class NastyHacks {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int cases = scanner.nextInt();
		String[] choice = new String[cases];
		
		for(int i=0; i<cases; i++) {
			int noAdCost = 0;
			int yesAdCost = 0;
			int costToAd = 0;
			int totalAdRev = 0;
			
			for(int k=0; k<3; k++) {
				if(k==0) {
					noAdCost = scanner.nextInt();
				}else if(k==1) {
					yesAdCost = scanner.nextInt();
				}else if(k==2) {
					costToAd = scanner.nextInt();
				}
				totalAdRev = yesAdCost - costToAd;
				if (noAdCost > totalAdRev) {
					choice[i] = "do not advertise";
				}else if(noAdCost < totalAdRev) {
					choice[i] = "advertise";
				}else if (noAdCost == totalAdRev) {
					choice[i] = "does not matter";
				}
			}
		}
		for(int i=0; i<cases; i++) {
			System.out.println(choice[i]);
		}

	}

}
