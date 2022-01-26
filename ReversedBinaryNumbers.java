import java.util.Scanner;
public class ReversedBinaryNumbers {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int[] binaryRep = new int[10];
		
		int decimalNum = scanner.nextInt();
		
		for (int i=0; i<10; i++) {
			if (decimalNum == Math.pow(2, 9-i)) {
				binaryRep[i] = 1;
				decimalNum -= Math.pow(2, 9-i);
			}else if (decimalNum < Math.pow(2,10-i) && decimalNum > Math.pow(2, 9-i)) {
				binaryRep[i] = 1;
				decimalNum -= Math.pow(2,9-i);
			}else if (decimalNum > Math.pow(2,10-i)){
				binaryRep[i] = 0;
			}else if (decimalNum != (Math.pow(2, 10-i))) {
				binaryRep[i] = 0;
			}
		}
		
		

		int i=0;
		int index = 10;

		while(binaryRep[i] == 0) {
			i++;
			index--;
		}
		
		int output = 0;
		for(int j=i, k=0; j<10 && k<index; j++, k++) {
			if(binaryRep[j] == 1) {
				output += Math.pow(2, k);
			}
			
		}
		System.out.println(output);

	}

}
