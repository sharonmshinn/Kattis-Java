import java.util.Scanner;

public class ReversedBinaryNumbers2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int[] binaryRep = new int[10];
		
		int decimalNum = scanner.nextInt();
		
		for (int i=9; i>=0; i--) {
			if(decimalNum == Math.pow(2, i)) {
				binaryRep[i] = 1;
				decimalNum -= Math.pow(2, i);
				
				System.out.println("At " + Math.pow(2, i) + "'s place at index " + i +". Adding 1 here. ");
				System.out.print("Taking away " + Math.pow(2, i) + " from output. Remainder is now " + decimalNum);
				System.out.println(" ");
				System.out.println(" ");
				
				
			}else if(decimalNum < Math.pow(2, i+1) && decimalNum > Math.pow(2, i)) {
				binaryRep[i] = 1;
				decimalNum -= Math.pow(2, i);
				
				System.out.println("At " + Math.pow(2, i-1) + "'s place at index " + (i-1) + ". Adding 1 here. ");
				System.out.print("Taking away " + Math.pow(2, i-1) + " from output. Remainder is now " + decimalNum);
				System.out.println(" ");
				System.out.println(" ");
				
				
			}else if(decimalNum < Math.pow(2, i)) {
				binaryRep[i] = 0;
				
				System.out.println("At " + Math.pow(2, i) + "'s place at index " + i +". Adding 0 here. ");
				System.out.print("Not taking away " + Math.pow(2, i) + " from output. Remainder is now " + decimalNum);
				System.out.println(" ");
				System.out.println(" ");
				
				
			}else if (decimalNum != Math.pow(2,i)) {
				binaryRep[i] = 0;
			}
		}
		
		for(int i=0; i<10; i++) {
			System.out.print(binaryRep[i]);
		}
		
		for (int i=0, k=9; i<10 && k>=0; i++, k--) {
			if(binaryR)
		}
	}
}
