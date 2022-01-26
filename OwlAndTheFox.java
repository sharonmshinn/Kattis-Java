import java.util.Scanner;
public class OwlAndTheFox {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int cases = scanner.nextInt();
		
		for(int i=0; i<cases; i++) {
			String n = scanner.next();
			int original = Integer.parseInt(n);
			String[] split = n.split("");
			int[] nums = new int[split.length];
			for(int j=0; j<split.length; j++) {
				nums[j] = Integer.parseInt(split[j]);
			}
			int total = -1;
			int index = nums.length;
			for(int j=0; j<nums.length; j++) {
				total += nums[j];
			}
			int returnNum = 0;
			for(int k=0; k<original; k++) {
				int compareTotal = 0;
				String numCompare = Integer.toString(k);
				String[] splitCompare = numCompare.split("");
				int[] numSplit = new int[splitCompare.length];
				for(int m=0; m<splitCompare.length; m++) {
					numSplit[m] = Integer.parseInt(splitCompare[m]);
					compareTotal += numSplit[m];
				}
				for(int m=0; m<numSplit.length; m++) {
					if(compareTotal == total) {
						returnNum = k;
						}
					}
				}
			System.out.println(returnNum);
			}
	}
		
				
}
