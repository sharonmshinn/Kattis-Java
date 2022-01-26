import java.util.Scanner;

public class OwlAndFox2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int cases = scanner.nextInt();
		
		//for as many cases as we have
		for(int i=0; i<cases; i++) {
			String n = scanner.next();
			//keeping an original int for loops
			int original = Integer.parseInt(n);
			//splitting original string input to add to total
			String[] split = n.split("");
			int[] nums = new int[split.length];
			//adding 
			for(int j=0; j<split.length; j++) {
				nums[j] = Integer.parseInt(split[j]);
			}
			
			int total = -1;
			int index = nums.length;
			for(int j=0; j<nums.length; j++) {
				total += nums[j];
			}
			
			int returnNum = 0;
			int compareTotal = 0;
			
			
			while(compareTotal != total) {
				for(int k=original-1; k>=0; k--) {
					int addTotal = 0;
					String numCompare = Integer.toString(k);
					String[] splitCompare = numCompare.split("");
					int[] numSplit = new int[splitCompare.length];
					for(int m=0; m<splitCompare.length; m++) {
						numSplit[m] = Integer.parseInt(splitCompare[m]);
						addTotal += numSplit[m];
					}
					for(int m=0; m<numSplit.length; m++) {
						if(addTotal == total) {
							compareTotal = addTotal;
							returnNum = k;
						}
					}
				}
			}
		}
	}
}
