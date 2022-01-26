
import java.util.Scanner;
public class OddManOut {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int cases = scanner.nextInt();
		
		
		for(int i=0; i<cases; i++) {
			int guests = scanner.nextInt();
			int[] codes = new int[guests];
			for(int j=0; j<guests; j++) {
				codes[j] = scanner.nextInt();
			}
			for(int k=0; k<guests; k++) {
				int guestCount = 0;
				for(int m=0; m<guests; m++) {
					if(codes[k] == codes[m]) {
						guestCount++;
					}
				}
				if(guestCount == 1) {
					System.out.println("Case #" + (i+1) + ": " + codes[k]);
				}
				
				
				
			}
			
		}

	}

}
